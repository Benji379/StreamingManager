package com.sm.controladores;

import com.sm.componet.CustomFileChooser;
import com.sm.frm.mdlVistaConvertHits;
import com.sm.modelo.SystemConfig;
import com.sm.utils.FiltroTabla;
import com.sm.utils.Action;
import com.sm.utils.ExportarExcel;
import com.sm.utils.HitTabla;
import com.sm.utils.UIController;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CVistaConvertHits {

    mdlVistaConvertHits v;

    public CVistaConvertHits(mdlVistaConvertHits v) {
        this.v = v;
    }

    public void init() {
        UIController.textAreaInivisible(v.txtAreaHits, v.jScrollPane2);
        v.tabla.fixTable(v.jScrollPane1);
        modelo = (DefaultTableModel) v.tabla.getModel();
    }

    DefaultTableModel modelo;

    public void mostrarHits() {
//        modelo = (DefaultTableModel)v.table1.getModel();
        modelo = HitTabla.convertirHitTabla(v.txtAreaHits.getText());
        v.tabla.setModel(modelo);
    }

    public void btnFiltrar() {
        String columnas[] = {"RUT", "Incluye"};
        JTextField textField[] = {v.txtRut, v.txtIncluye};
//        FiltroTabla.filterTable(v.table1, modelo, textField, columnas);
        DefaultTableModel mol = FiltroTabla.filterTable(modelo, textField, columnas);
//        modelo = mol;
        v.tabla.setModel(mol);
    }

    public void btnExportarExcel() {
        try {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(v);
            String direccion = CustomFileChooser.chooseFile(frame, "Tabla Hits", "xlsx", "Archivos excel");
            if (direccion != null) {
                ExportarExcel.exportToExcel(v.tabla, direccion, SystemConfig.MAIN_COLOR_1);
                Action.mensaje("Archivo descargado");
            } else {
//                System.out.println("No se descargo");
            }
        } catch (Exception e) {
        }
    }

    public void btnGuardar() {
        Action.mensajeGuardarHits(v.tabla);
    }

}
