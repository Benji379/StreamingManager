package com.sm.controladores;

import com.sm.componet.CustomFileChooser;
import com.sm.frm.mdlComboList;
import com.sm.utils.Action;
import com.sm.utils.CopiarArchivo;
import com.sm.utils.DataManager;
import com.sm.utils.EliminarArchivo;
import com.sm.utils.FileProcessor;
import com.sm.utils.ManejadorArchivos;
import com.sm.utils.UIController;
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

public class CComboList implements Serializable {

    mdlComboList c;

    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloEstado;
    private String direccionArchivo;
    private String nombreUnicoArchivo;
    private int filaSeleccionada = -1;

    public CComboList(mdlComboList c) {
        this.c = c;
    }

    public void init() {
        c.tabla.fixTable(c.scroll);
        initModelos();
        limpiar();
        initDesing();
    }

    private void initDesing() {
        c.setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);
        c.jlbTitulo.setForeground(com.sm.modelo.SystemConfig.TEXT1);

        c.panelInputs.setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);
        c.pNombre.setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);
        c.pEstado.setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);
        c.pBotones.setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);

    }

    private void initModelos() {
        modeloTabla = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "N", "Nombre", "Cantidad", "Estado"
                });
        modeloEstado = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "N", "Nombre", "Cantidad", "Estado"
                });
    }

    public void btnCarpeta() {
        Action.AccederEnlace("config\\backup\\OpenBullet2\\ComboList");
    }

    public void btnImportar() {
        try {
            String nombreArchiv = "";
            java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(c);
            String direccion = CustomFileChooser.chooseFile(parentWindow, nombreArchiv, "txt", "ComboList .txt");

            if (direccion != null) {
//                CopiarArchivo.copiarArchivoCarpeta(direccion, "config/backup/OpenBullet2/ComboList");
                ManejadorArchivos archi = new ManejadorArchivos(direccion, "config/backup/OpenBullet2/ComboList");
                archi.accion();
                modeloEstado.addRow(new Object[]{archi.getNombreArchivo(), "Libre"});
                DataManager.guardarDatos(modeloEstado, "config/backup/OpenBullet2/dataComboList.csv");
                limpiar();
            } else {
                System.out.println("No se descargo");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void consultarTabla() {

        modeloTabla = FileProcessor.importTxtToTableModel("config/backup/OpenBullet2/ComboList");
        modeloEstado = DataManager.cargarDatos("config/backup/OpenBullet2/dataComboList.csv");

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String nombreModelo = modeloTabla.getValueAt(i, 1).toString();

            for (int j = 0; j < modeloEstado.getRowCount(); j++) {
                String modeloArchivos = modeloEstado.getValueAt(j, 0).toString();
                String estado = modeloEstado.getValueAt(j, 1).toString();
                if (nombreModelo.equalsIgnoreCase(modeloArchivos)) {
                    modeloTabla.setValueAt(estado, i, 3);
                    break;
                }
            }
        }
        c.tabla.setModel(modeloTabla);
    }

    public void limpiar() {
//        modeloTabla.setRowCount(0);
//        modeloEstado.setRowCount(0);
        direccionArchivo = "";
        nombreUnicoArchivo = "";
        filaSeleccionada = -1;
        c.txtNombre.setEditable(true);
        c.txtNombre.setText("");
        c.comboEstado.setSelectedIndex(0);
        c.tabla.clearSelection();
        consultarTabla();
    }

    public void clickTabla() {
        filaSeleccionada = c.tabla.getSelectedRow();
        c.txtNombre.setEditable(false);
        mostrarDatos();
//        Action.mensaje("Hola probando");
    }

    private void mostrarDatos() {
        String nombre = UIController.datoFilaColumna(modeloTabla, filaSeleccionada, "Nombre").toString();
        String estado = UIController.datoFilaColumna(modeloTabla, filaSeleccionada, "Estado").toString();

        nombreUnicoArchivo = nombre;
        direccionArchivo = "config/backup/OpenBullet2/ComboList/" + nombre + ".txt";

        c.txtNombre.setText(nombre);
        c.comboEstado.setSelectedItem(estado);
    }

    public void btnDescargar() {
        try {
            java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(c);
            String direccion = CustomFileChooser.chooseFile(parentWindow, nombreUnicoArchivo, "txt", "Archivos Texto");

            if (direccion != null) {
                System.out.println(direccion);
                System.out.println(direccionArchivo);
                CopiarArchivo.copiarArchivo(direccionArchivo, direccion);
            } else {
//                System.out.println("No se descargo");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void borrar() {
        if (filaSeleccionada > -1) {
            EliminarArchivo.eliminarArchivo(direccionArchivo);
            modeloEstado.removeRow(filaSeleccionada);
            DataManager.guardarDatos(modeloEstado, "config/backup/OpenBullet2/dataComboList.csv");
            System.out.println(direccionArchivo);
            limpiar();
        } else {
//            Action.mensajeError("Seleccione un comboBox");
        }
    }

    public void btnActualizar() {
        if (filaSeleccionada > -1) {
            String estadoActual = (String) c.comboEstado.getSelectedItem();
            String nombreArchi = modeloTabla.getValueAt(filaSeleccionada, 1).toString();

            UIController.cambiarDato(modeloEstado, "Nombre", nombreArchi, "Estado", estadoActual);
            DataManager.guardarDatos(modeloEstado, "config/backup/OpenBullet2/dataComboList.csv");

            limpiar();
        }
    }

    public static void main(String[] args) {
        System.out.println(DataManager.cargarDatos("config/backup/OpenBullet2/dataComboList.csv"));
    }
}
