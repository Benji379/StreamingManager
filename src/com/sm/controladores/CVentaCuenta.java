package com.sm.controladores;

import com.sm.componet.CustomFileChooser;
import com.sm.data.DataAsignado;
import com.sm.data.DataCuentas;
import com.sm.frm.mdlVentaCuenta;
import com.sm.frm.ventanaListaCuentas;
import com.sm.modelo.Asignado;
import com.sm.modelo.Cuenta;
import com.sm.modelo.SystemConfig;
import com.sm.utils.Action;
import com.sm.utils.ExportarExcel;
import com.sm.utils.UIController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class CVentaCuenta {

    mdlVentaCuenta v;
    DataAsignado data;
    DefaultTableModel modelo;
    int filaSeleccionada = -1;

    public CVentaCuenta(mdlVentaCuenta v) {
        this.v = v;
        data = new DataAsignado();
    }

    public void init() {
//        limpiar();
        consultar();
        v.tabla.fixTable(v.jScrollPane1);
    }

    public void limpiar() {
        consultar();
        filaSeleccionada = -1;
        v.txtAsignado.setText("");
        v.txtCuenta.setText("");
        v.txtFin.setText("");
        v.txtInicio.setText("");
        v.txtWhastApp.setText("");
        v.comboEstado.setSelectedItem("");
    }

    private void consultar() {
        modelo = data.consultar();
        v.tabla.setModel(modelo);
    }

    public void agregar() {
        String id = getIdActual();
        String asignado = v.txtAsignado.getText();
        String wsp = v.txtWhastApp.getText();
        String fechaInicio = v.txtInicio.getText();
        String fechaFinal = v.txtFin.getText();
        String estado = (String) v.comboEstado.getSelectedItem();
        String idCuenta = v.txtCuenta.getText();
        DataCuentas dataCuen = new DataCuentas();
        if (Action.sinVacio(id, asignado, wsp, fechaInicio, fechaFinal, estado, idCuenta)) {
            Cuenta cuen = dataCuen.getConsultar(idCuenta);
            Asignado asig = new Asignado(id, asignado, wsp, fechaInicio, fechaFinal, estado, cuen);
            data.registrar(asig);
            limpiar();
        } else {
            Action.mensajeError("Rellene todos los campos");
        }
    }

    private int ID_ACTUAL() {
        try {
            int idActual = 0;
            for (Object id : new com.sm.data.DataAsignado().getConsultar(0)) {
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

    private DefaultTableModel modeloActualTabla() {
        return (DefaultTableModel) v.tabla.getModel();
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            String id = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "ID").toString();
            String asignado = v.txtAsignado.getText();
            String wsp = v.txtWhastApp.getText();
            String fechaInicio = v.txtInicio.getText();
            String fechaFinal = v.txtFin.getText();
            String estado = (String) v.comboEstado.getSelectedItem();
            String idCuenta = v.txtCuenta.getText();
            DataCuentas dataCuen = new DataCuentas();
            if (Action.sinVacio(id, asignado, wsp, fechaInicio, fechaFinal, estado, idCuenta)) {
                Cuenta cuen = dataCuen.getConsultar(idCuenta);
                Asignado asig = new Asignado(id, asignado, wsp, fechaInicio, fechaFinal, estado, cuen);
                data.actualizar(asig);
                limpiar();
            } else {
                Action.mensajeError("Rellene todos los campos");
            }
        } else {
            Action.mensajeError("Seleccionar fila");
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            String id = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "ID").toString();
            data.borrar(id);
            limpiar();
        } else {
            Action.mensajeError("Seleccionar fila");
        }
    }

    private DefaultTableModel modeloDescargar() {

        DefaultTableModel modeloDescargar = new DefaultTableModel(
                new String[]{"ID", "Asignado", "WhatsApp", "UserCuenta", "PasswordCuenta", "Aplicacion", "Estado", "Inicio", "Fin"}, 0);

        ArrayList<Asignado> asig = data.getConsultar();
        Object datos[] = new Object[9];
        for (Asignado a : asig) {
            datos[0] = a.getId();
            datos[1] = a.getAsignado();
            datos[2] = a.getWhastapp();
            datos[3] = a.getCuenta().getUsuario();
            datos[4] = a.getCuenta().getPassword();
            datos[5] = a.getCuenta().getAplicacion();
            datos[6] = a.getEstado();
            datos[7] = a.getFechaInicio();
            datos[8] = a.getFechaFinal();
            modeloDescargar.addRow(datos);
        }

        return modeloDescargar;
    }

    public void descargar() {
        try {
            String nombreArchivo = "Venta Cuentas";
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(v);
            String direccion = CustomFileChooser.chooseFile(frame, nombreArchivo, "xlsx", "Archivos excel");
            if (direccion != null) {
                ExportarExcel.exportToExcel(modeloDescargar(), direccion, SystemConfig.MAIN_COLOR_1);
                Action.mensaje("Archivo descargado");
            } else {
//                System.out.println("No se descargo");
            }
        } catch (Exception e) {
        }
    }

    public void copiar() {
        String aplicacion = v.infoTxtAplicacion.getText();
        String usuario = v.infoTxtUsuario.getText();
        String password = v.infotxtPassword.getText();
        String fechaFin = v.txtFin.getText();
        String textoCopiar = generarTextoCopia(aplicacion, usuario, password, fechaFin);
        Action.copiarPortapapeles(textoCopiar);
        v.btnCopiar.setText("Copiado al portapapeles!");
        // Temporizador para cambiar el texto del botón después de un segundo
        Timer timer = new Timer(2300, e -> {
            v.btnCopiar.setText("Copiar");
        });
        timer.setRepeats(false); // Para que solo se ejecute una vez
        timer.start();
    }

    public void clickTabla() {
        filaSeleccionada = v.tabla.getSelectedRow();
            
        String id = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "ID").toString();
        String asignado = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "Asignado").toString();
        String wsp = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "WhatsApp").toString();
        String fechaInicio = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "Inicio").toString();
        String fechaFin = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "Fin").toString();
        String estado = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "Estado").toString();
        String idCuenta = UIController.datoFilaColumna(modeloActualTabla(), filaSeleccionada, "Cuenta").toString();

        v.txtAsignado.setText(asignado);
        v.txtWhastApp.setText(wsp);
        v.txtInicio.setText(fechaInicio);
        v.txtFin.setText(fechaFin);
        v.comboEstado.setSelectedItem(estado);
        v.txtCuenta.setText(idCuenta);
        llenarInfoCuenta(idCuenta);

    }

    public void clickTxtCuenta() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(v);
//        UIController.ventanaEmergente(frame, new ventanaListaCuentas(), "Cuentas", 657, 669);
        ventanaListaCuentas ventana = new ventanaListaCuentas();
        UIController.ventanaEmergente(frame, ventana, "Cuentas", 657, 669);
        String idVentaCuenta = ventana.getIdCuenta();
        llenarInfoCuenta(idVentaCuenta);
    }

    private void llenarInfoCuenta(String idVentaCuenta) {
        if (idVentaCuenta != null) {
            v.txtCuenta.setText(idVentaCuenta);
            DataCuentas dataCuenta = new DataCuentas();

            String correo = dataCuenta.getConsultar(idVentaCuenta).getUsuario();
            String password = dataCuenta.getConsultar(idVentaCuenta).getPassword();
            String aplicacion = dataCuenta.getConsultar(idVentaCuenta).getAplicacion();
            String fechaFinal = dataCuenta.getConsultar(idVentaCuenta).getFechaFinal();

            v.infoTxtUsuario.setText(correo);
            v.infotxtPassword.setText(password);
            v.infoTxtAplicacion.setText(aplicacion);
            v.infoTxtFinaliza.setText(fechaFinal);
        }
    }

    private String generarTextoCopia(String aplicacion, String usuario, String password,String fechaFin) {
        String texto
                = "*===================*\n"
                + "*Cuenta "+aplicacion+"*\n"
                + "* *Usuario:* "+usuario+"\n"
                + "* *Password:* "+password+"\n"
                + "* *Finaliza:* "+fechaFin+"\n"
                + "*===================*";
        return texto;
    }

}
