package com.sm.controladores;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sm.componet.CustomFileChooser;
import com.sm.data.DataCuentas;
import com.sm.frm.mdlCuentas;
import com.sm.frm.ventanaMisCorreos;
import com.sm.modelo.Cuenta;
import com.sm.modelo.SystemConfig;
import com.sm.utils.Action;
import com.sm.utils.ExportarExcel;
import com.sm.utils.FiltroTabla;
import com.sm.utils.TableUtils;
import com.sm.utils.UIController;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CCuentas {

    mdlCuentas c;
    DataCuentas data;
    String fechaHoy;

    int filaSeleccionada = -1;
    DefaultTableModel modelo;

    public CCuentas(mdlCuentas c) {
        this.c = c;
        c.tabla.fixTable(c.scroll);
        data = new DataCuentas();
        fechaHoy = c.txtInicio.getText();
    }

    public void init() {
        cargarJSONReferencias();
        limpiar();
//        UIController.removerBordeBlanco(c.jScrollPane1);
        UIController.scrollInvisible(c.jScrollPane1);
        eventoCombinacionTeclas();
        c.tablaConteo.setColorBackGround1(com.sm.modelo.SystemConfig.BACKGROUND2);
        c.tablaConteo.setColorBackGround2(com.sm.modelo.SystemConfig.BACKGROUND2);
        c.tablaConteo.setColorSelected1(com.sm.modelo.SystemConfig.BACKGROUND2);
        c.tablaConteo.setColorSelected2(com.sm.modelo.SystemConfig.BACKGROUND2);
    }

    private void cargarJSONReferencias() {
        //https://chat.openai.com/share/52d1c214-4cf3-48e2-ac31-10adb5d5a264
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(new File("config/backup/Configuracion/StreamingReferencias.json"));
            Iterator<String> fieldNames = rootNode.fieldNames();
            while (fieldNames.hasNext()) {
                String fieldName = fieldNames.next();
                c.txtAplicacion.addItemSuggestion(fieldName);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void descargar() {
        try {
            String nombreArchivo = "Cuentas";
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(c);
            String direccion = CustomFileChooser.chooseFile(frame, nombreArchivo, "xlsx", "Archivos excel");
            if (direccion != null) {
                ExportarExcel.exportToExcel(modelo, direccion, SystemConfig.MAIN_COLOR_1);
                Action.mensaje("Archivo descargado");
            } else {
//                System.out.println("No se descargo");
            }
        } catch (Exception e) {
        }
    }

    public void limpiar() {
        consultar();
        filaSeleccionada = -1;
        c.dateChooserInicio.setSelectedDate(Action.convertirStringToDate(fechaHoy));
        c.dateChooserFinal.setSelectedDate(Action.convertirStringToDate(fechaHoy));

        c.txtInicio.setText("");
        c.txtFinal.setText("");
        c.txtUsuario.setText("");
        c.txtPassword.setText("");
        c.txtAplicacion.setText("");

//        c.comboEstado.setSelectedIndex(0);
        c.comboEstado.setSelectedItem("");

        consultarTotalSumaAplicacion();
    }

    private void eventoCombinacionTeclas() {
        // Agregar el KeyListener al JTextField
        c.txtUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Verificar si se presiona Control + Espacio
                if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_SPACE) {
                    ventanaMisCorreos vent = new ventanaMisCorreos();
                    UIController.ventanaEmergente(vent, "Mis Correos", 370, 568);
                    String correoSelect = vent.getCorreo();
                    c.txtUsuario.setText(correoSelect);
                }
            }
        });

    }

    public void consultar() {
        modelo = data.consultar();
        c.tabla.setModel(modelo);
    }

    public void agregar() {
        String ID = getIdActual();
        String usuario = c.txtUsuario.getText();
        String password = c.txtPassword.getText();
        String aplicacion = c.txtAplicacion.getText();
        String estado = (String) c.comboEstado.getSelectedItem();
        String fechaInicio = c.txtInicio.getText();
        String fechaFinal = c.txtFinal.getText();
        if (Action.sinVacio(ID, usuario, password, aplicacion, estado, fechaInicio, fechaFinal)) {
            Cuenta cuenta = new Cuenta(ID, usuario, password, aplicacion, estado, fechaInicio, fechaFinal);
            data.registrar(cuenta);
            limpiar();
            System.out.println(fechaInicio);
        } else {
            Action.mensajeError("Campos sin rellenar");
        }
    }

    private DefaultTableModel modeloTablaActual() {
        return (DefaultTableModel) c.tabla.getModel();
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            String ID = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "ID").toString();
            String usuario = c.txtUsuario.getText();
            String password = c.txtPassword.getText();
            String aplicacion = c.txtAplicacion.getText();
            String estado = (String) c.comboEstado.getSelectedItem();
            String fechaInicio = c.txtInicio.getText();
            String fechaFinal = c.txtFinal.getText();
            if (Action.sinVacio(ID, usuario, password, aplicacion, estado, fechaInicio, fechaFinal)) {
                Cuenta cuenta = new Cuenta(ID, usuario, password, aplicacion, estado, fechaInicio, fechaFinal);
                data.actualizar(cuenta);
                limpiar();
                System.out.println(fechaInicio);
            } else {
                Action.mensajeError("Campos sin rellenar");
            }
        } else {
            Action.mensajeError("Seleccione una fila");
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            String ID = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "ID").toString();
            data.borrar(ID);
            limpiar();
        } else {
            Action.mensajeError("Seleccione una fila");
        }
    }

    private int ID_ACTUAL() {
        try {
            int idActual = 0;
            for (Object id : new com.sm.data.DataCuentas().getConsultar(0)) {
                idActual = Integer.parseInt(id.toString());
            }
            return idActual;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            return 0;
        }
    }

    private String getIdActual() {
        int valorActualId = ID_ACTUAL() + 1;
        String nuevaID = String.format("%08d", valorActualId);
        return nuevaID;
    }

    public void clickTabla() {
        filaSeleccionada = c.tabla.getSelectedRow();

        String usuario = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "usuario").toString();
        String password = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "password").toString();
        String aplicacion = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "aplicacion").toString();
        String estado = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "estado").toString();
        String fechaInicio = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "inicio").toString();
        String fechaFinal = UIController.datoFilaColumna(modeloTablaActual(), filaSeleccionada, "final").toString();

        c.txtUsuario.setText(usuario);
        c.txtPassword.setText(password);
        c.txtAplicacion.setText(aplicacion);
        c.comboEstado.setSelectedItem(estado);
        c.txtInicio.setText(fechaInicio);
        c.txtFinal.setText(fechaFinal);

        c.dateChooserInicio.setSelectedDate(Action.convertirStringToDate(fechaInicio));
        c.dateChooserFinal.setSelectedDate(Action.convertirStringToDate(fechaFinal));
    }

    private void consultarTotalSumaAplicacion() {
        c.tablaConteo.setModel(TableUtils.sumColumnValues(modelo, "Aplicacion"));
    }

    public void filtrar() {
        String usuario = c.txtUsuario.getText();
        String password = c.txtPassword.getText();
        String aplicacion = c.txtAplicacion.getText();
        String estado = (String) c.comboEstado.getSelectedItem();
        String fechaInicio = c.txtInicio.getText();
        String fechaFinal = c.txtFinal.getText();
        String nombresColumnas[] = {"Usuario", "Password", "Aplicacion", "Estado", "Inicio", "Final"};
        String datosFiltrar[] = {usuario, password, aplicacion, estado, fechaInicio, fechaFinal};
        c.tabla.setModel(FiltroTabla.filterTable(modelo, datosFiltrar, nombresColumnas));
    }

}
