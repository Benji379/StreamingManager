package com.sm.controladores;

import com.glasspanepopup.GlassPanePopup;
import com.sm.componet.CustomFileChooser;
import com.sm.frm.mdlHitsOpenBullet;
import com.sm.modelo.SystemConfig;//SystemConfig.MAIN_COLOR_1
import com.sm.utils.Action;
import com.sm.utils.CopiarArchivo;
import com.sm.utils.EliminarArchivo;
import com.sm.utils.ExportarExcel;
import com.sm.utils.FiltroTabla;
import com.sm.utils.ImportarExcel;
import com.sm.utils.NombresExcels;
import com.sm.utils.UIController;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CHitsVTR {

    mdlHitsOpenBullet h;
    private DefaultTableModel modelo;
    private String nombreArchivoExcel;

    public CHitsVTR(mdlHitsOpenBullet h) {
        this.h = h;
    }

    public void init() {
        h.tabla.fixTable(h.jScrollPane1);
        rellenarListaHits();
        UIController.removerBordeBlanco(h.ScrollLista);
        initModelos();
    }

    private void initModelos() {
        modeloFiltro = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "#", "Data", "Type", "Config", "Wordlist", "RUT", "PASS", "Incluye", "Date"
                });
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "#", "Data", "Type", "Config", "Wordlist", "RUT", "PASS", "Incluye", "Date"
                });
    }

    private void rellenarListaHits() {
        h.listaTablasHits.removeAll();
        String folderPath = "config/backup/OpenBullet2/Mis_Hits";
        ArrayList<String> excelFiles = NombresExcels.getExcelFileNames(folderPath);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String fileName : excelFiles) {
            listModel.addElement(fileName);
        }
        h.listaTablasHits.setModel(listModel);
    }

    public void eventoSeleccionLista() {
        Action.cargar(() -> {
            try {
                String datoSeleccionado = h.listaTablasHits.getSelectedValue();
                System.out.println(datoSeleccionado);

                nombreArchivoExcel = "config/backup/OpenBullet2/Mis_Hits/" + datoSeleccionado + ".xlsx";
                modelo = ImportarExcel.cargarDatosDesdeExcel(nombreArchivoExcel);
                h.tabla.setModel(modelo);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
//        ImportarExcel.cargarDatosDesdeExcel(h.tabla, direccionArchivo);
        },() -> {
            GlassPanePopup.closePopupAll();
        });
    }

    public void btnAbrirCarpeta() {
//        Action.AccederEnlace("config\\backup\\OpenBullet2\\Mis_Hits");
        Action.AccederEnlace("config\\backup\\OpenBullet2\\Mis_Hits");
    }

    DefaultTableModel modeloFiltro;

    public void btnFiltrar() {
        String columnas[] = {"RUT", "Incluye", "Type"};
        JTextField textField[] = {h.txtRut, h.txtIncluye, h.txtEstado};
        modeloFiltro = FiltroTabla.filterTable(modelo, textField, columnas);
        h.tabla.setModel(modeloFiltro);
    }

    int filaSeleccionada = -1;

    public void btnLimpiar() {
        filaSeleccionada = -1;
        h.txtEstado.setText("");
        h.txtIncluye.setText("");
        h.txtRut.setText("");
//        h.listaTablasHits.clearSelection(); // quito esta vaina
//        Action.vaciarTabla(h.tabla);//quito esta vaina porseaca
        nombreArchivoExcel = "";
        modelo.setRowCount(0);
        modeloFiltro.setRowCount(0);
    }

    public void clickTabla() {
        filaSeleccionada = h.tabla.getSelectedRow();
        String estado = UIController.datoFilaColumna(h.tabla, filaSeleccionada, "type").toString();
        String incluye = UIController.datoFilaColumna(h.tabla, filaSeleccionada, "incluye").toString();
        String rut = UIController.datoFilaColumna(h.tabla, filaSeleccionada, "rut").toString();
        h.txtEstado.setText(estado);
        h.txtIncluye.setText(incluye);
        h.txtRut.setText(rut);
    }

    public void btnExportar() {
        try {
            String nombreArchivo = h.listaTablasHits.getSelectedValue();
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(h);
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

    public void btnImportar() {
        try {
            String nombreArchivo = "";
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(h);
            String direccion = CustomFileChooser.chooseFile(frame, nombreArchivo, "xlsx", "Archivos excel");
            if (direccion != null) {
                CopiarArchivo.copiarArchivoCarpeta(direccion, "config/backup/OpenBullet2/Mis_Hits");
                rellenarListaHits();
            } else {
//                System.out.println("No se descargo");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void btnEliminarLista() {
        String nombreArchivo = h.listaTablasHits.getSelectedValue();
        String carpetaDir = "config/backup/OpenBullet2/Mis_Hits/" + nombreArchivo + ".xlsx";
        Action.msjC(() -> revalidaListaEliminacion(carpetaDir), "Confirmar eliminacion");
    }

    private void revalidaListaEliminacion(String carpetaDir) {
        EliminarArchivo.eliminarArchivo(carpetaDir);
        rellenarListaHits();
        btnLimpiar();
    }

    public void btnEliminarHit() {
        if (filaSeleccionada >= 0) {
            String rutSeleccionado = UIController.datoFilaColumna(modelo, filaSeleccionada, "RUT").toString();
            UIController.eliminarFila(modelo, "RUT", rutSeleccionado);
            ExportarExcel.exportToExcel(modelo, nombreArchivoExcel, SystemConfig.MAIN_COLOR_1);
            eventoSeleccionLista();
        }
    }

    public void btnActualizarSoloHit() {

        String numeralIdentificador = UIController.datoFilaColumna(h.tabla, filaSeleccionada, "#").toString();

        String nuevoRut = h.txtRut.getText();
        String nuevoType = h.txtEstado.getText();
        String nuevoIncluye = h.txtIncluye.getText();

        //miniFiltroGuardadorDeEstdo
        String campoRut = h.txtRut.getText();
        String campoEstado = h.txtEstado.getText();
        String campoIncluye = h.txtIncluye.getText();

        UIController.cambiarDato(modelo, "#", numeralIdentificador, "RUT", nuevoRut);
        UIController.cambiarDato(modelo, "#", numeralIdentificador, "Incluye", nuevoIncluye);
        UIController.cambiarDato(modelo, "#", numeralIdentificador, "Type", nuevoType);

        ExportarExcel.exportToExcel(modelo, nombreArchivoExcel, com.sm.modelo.SystemConfig.MAIN_COLOR_1);

        h.txtEstado.setText(campoEstado);
        h.txtIncluye.setText(campoIncluye);
        h.txtRut.setText(campoRut);

        btnFiltrar();
        h.tabla.setModel(modeloFiltro);
    }

}
