package com.sm.controladores;

import com.sm.componet.CustomFileChooser;
import com.sm.frm.mdlConfig;
import com.sm.utils.Action;
import com.sm.utils.CopiarArchivo;
import com.sm.utils.DataManager;
import com.sm.utils.EliminarArchivo;
import com.sm.utils.FileProcessor;
import com.sm.utils.ManejadorArchivos;
import com.sm.utils.UIController;
import java.awt.HeadlessException;
import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CConfig implements Serializable {

    mdlConfig c;

    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloEstado;
    private String direccionArchivo;
    private String nombreUnicoArchivo;
    private int filaSeleccionada = -1;

    public CConfig(mdlConfig c) {
        this.c = c;
    }

    public void init() {
        c.tabla.fixTable(c.scroll);
        initModelos();
        limpiar();
    }

    private void initModelos() {
        modeloTabla = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "N", "Nombre", "Aplicacion", "Estado"
                });
        modeloEstado = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "N", "Nombre", "Aplicacion", "Estado"
                });
    }

    public void btnCarpeta() {
        Action.AccederEnlace("config\\backup\\OpenBullet2\\Config");
    }

    public void btnAgregar() {
        try {
            String aplicac = c.txtAplicacion.getText();

            if (!aplicac.equalsIgnoreCase("")) {
                String nombreArchiv = "";
                java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(c);
                String direccion = CustomFileChooser.chooseFile(parentWindow, nombreArchiv, "opk", "Config .opk");
                if (direccion != null) {
//                CopiarArchivo.copiarArchivoCarpeta(direccion, "config/backup/OpenBullet2/ComboList");
                    ManejadorArchivos archi = new ManejadorArchivos(direccion, "config/backup/OpenBullet2/Config");
                    archi.accion();
                    String aplica = c.txtAplicacion.getText();
                    modeloEstado.addRow(new Object[]{archi.getNombreArchivo(), aplica, "Libre"});
                    DataManager.guardarDatos(modeloEstado, "config/backup/OpenBullet2/dataConfig.csv");
                    limpiar();
                } else {
                    System.out.println("No se descargo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Asignarle una aplicacion", "Error", JOptionPane.ERROR_MESSAGE);
                c.txtAplicacion.requestFocus();
            }

        } catch (HeadlessException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void consultarTabla() {

        modeloTabla = FileProcessor.importTxtToTableModelopk("config/backup/OpenBullet2/Config");
        modeloEstado = DataManager.cargarDatos("config/backup/OpenBullet2/dataConfig.csv");

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String nombreModelo = modeloTabla.getValueAt(i, 1).toString();

            for (int j = 0; j < modeloEstado.getRowCount(); j++) {
                String modeloArchivos = modeloEstado.getValueAt(j, 0).toString();
                String nombreArch = modeloEstado.getValueAt(j, 1).toString();
                String estado = modeloEstado.getValueAt(j, 2).toString();
                if (nombreModelo.equalsIgnoreCase(modeloArchivos)) {
                    modeloTabla.setValueAt(nombreArch, i, 2);
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
        c.txtAplicacion.setEditable(true);
        c.txtAplicacion.setText("");
        c.comboEstado.setSelectedIndex(0);
        c.tabla.clearSelection();
        consultarTabla();
    }

    public void clickTabla() {
        filaSeleccionada = c.tabla.getSelectedRow();
        c.txtAplicacion.setEditable(false);
        mostrarDatos();
    }

    private void mostrarDatos() {
        String nombre = UIController.datoFilaColumna(modeloTabla, filaSeleccionada, "Nombre").toString();
        String estado = UIController.datoFilaColumna(modeloTabla, filaSeleccionada, "Estado").toString();

        nombreUnicoArchivo = nombre;
        direccionArchivo = "config/backup/OpenBullet2/Config/" + nombre + ".opk";

        c.txtAplicacion.setText(nombre);
        c.comboEstado.setSelectedItem(estado);
    }

    public void btnDescargar() {
        try {
            java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(c);
            String direccion = CustomFileChooser.chooseFile(parentWindow, nombreUnicoArchivo, "opk", "Archivos .opk");

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
            DataManager.guardarDatos(modeloEstado, "config/backup/OpenBullet2/dataConfig.csv");
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
            DataManager.guardarDatos(modeloEstado, "config/backup/OpenBullet2/dataConfig.csv");

            limpiar();
        }
    }

    public static void main(String[] args) {
        System.out.println(DataManager.cargarDatos("config/backup/OpenBullet2/dataConfig.csv"));
    }
}
