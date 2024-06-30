package com.sm.controladores;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sm.componet.CustomFileChooser;
import com.sm.data.DataBin;
import com.sm.frm.mdlBins;
import com.sm.modelo.Bin;
import com.sm.modelo.SystemConfig;
import com.sm.utils.Action;
import com.sm.utils.ExportarExcel;
import com.sm.utils.FiltroTabla;
import com.sm.utils.UIController;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class CBins {

    private mdlBins c;
    private DataBin data;

    private int filaSeleccionada = -1;
    private DefaultTableModel modelo;

    public CBins(mdlBins c) {
        this.c = c;
        c.tabla.fixTable(c.scroll);
        data = new DataBin();
    }

    public void init() {
        cargarJSONReferencias();
        cargarPaises();
//        limpiar();
        consultar();
        detectarCambios(c.txtAplicacion, c.txtBin, c.txtCvv, c.txtZip);
        detectarCambios(c.comboAnio, c.comboEstado, c.comboMes, c.comboPaises);
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

        }
    }

    private void cargarPaises() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Lee el archivo JSON
            JsonNode rootNode = mapper.readTree(new File("config/backup/configuracion/paises.json"));
            // Extrae los nombres de los países y los guarda en un ArrayList
            List<String> paisesList = new ArrayList<>();
            Iterator<String> nombresPaises = rootNode.fieldNames();
            while (nombresPaises.hasNext()) {
                String nombrePais = nombresPaises.next();
                paisesList.add(nombrePais);
            }
            // Convierte el ArrayList a un array de strings
            String[] paisesArray = new String[paisesList.size()];
            paisesArray = paisesList.toArray(paisesArray);

            // Imprime los nombres de los países
//            System.out.println("Lista de países:");
            c.comboPaises.removeAllItems();
            for (String pais : paisesArray) {
                c.comboPaises.addItem(pais);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void descargar() {
        try {
            String nombreArchivo = "Bins";
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
        c.txtAplicacion.setText("");
        c.txtBin.setText("");
        c.txtCvv.setText("");
        c.txtZip.setText("");
        c.comboAnio.setSelectedItem("");
        c.comboEstado.setSelectedItem("");
        c.comboMes.setSelectedItem("");
        c.comboPaises.setSelectedItem("");
    }

    public void consultar() {
        modelo = data.consultar();
        c.tabla.setModel(modelo);
    }

    public void agregar() {
        String ID = getIdActual();
        String bin = c.txtBin.getText();
        String mes = (String) c.comboMes.getSelectedItem();
        String anio = (String) c.comboAnio.getSelectedItem();
        String cvv = c.txtCvv.getText();
        String aplicacion = c.txtAplicacion.getText();
        String zip = c.txtZip.getText();
        String pais = (String) c.comboPaises.getSelectedItem();
        String estado = (String) c.comboEstado.getSelectedItem();

        if (Action.sinVacio(ID, bin, mes, anio, cvv, zip, aplicacion, pais, estado)) {
            Bin binn = new Bin(ID, bin, mes, anio, cvv, zip, aplicacion, pais, estado);
            data.registrar(binn);
            limpiar();
        } else {
            Action.mensajeError("Complete todos los campos");
        }
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            String ID = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "ID").toString();
            String bin = c.txtBin.getText();
            String mes = (String) c.comboMes.getSelectedItem();
            String anio = (String) c.comboAnio.getSelectedItem();
            String cvv = c.txtCvv.getText();
            String aplicacion = c.txtAplicacion.getText();
            String zip = c.txtZip.getText();
            String pais = (String) c.comboPaises.getSelectedItem();
            String estado = (String) c.comboEstado.getSelectedItem();
            if (Action.sinVacio(ID, bin, mes, anio, cvv, zip, aplicacion, pais, estado)) {
                Bin binn = new Bin(ID, bin, mes, anio, cvv, zip, aplicacion, pais, estado);
                data.actualizar(binn);
                limpiar();
            } else {
                Action.mensajeError("Complete todos los campos");
            }
        } else {
            Action.mensajeError("Seleccione una fila");
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            String ID = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "ID").toString();
            data.borrar(ID);
            limpiar();
        } else {
            Action.mensajeError("Seleccione una fila");
        }
    }

    private int ID_ACTUAL() {
        try {
            int idActual = 0;
            for (Object id : new com.sm.data.DataBin().getConsultar(0)) {
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

    private DefaultTableModel modeloActual() {
        return (DefaultTableModel) c.tabla.getModel();
    }

    public void clickTabla() {
        filaSeleccionada = c.tabla.getSelectedRow();
//        String ID = UIController.datoFilaColumna(modelo, filaSeleccionada, "ID").toString();
        String bin = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Bin").toString();
        String mes = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Mes").toString();
        String anio = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Anio").toString();
        String cvv = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Ccv").toString();
        String aplicacion = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Aplicacion").toString();
        String zip = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Zip").toString();
        String pais = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Pais").toString();
        String estado = UIController.datoFilaColumna(modeloActual(), filaSeleccionada, "Estado").toString();

        c.txtBin.setText(bin);
        c.comboMes.setSelectedItem(mes);
        c.comboAnio.setSelectedItem(anio);
        c.txtCvv.setText(cvv);
        c.txtAplicacion.setText(aplicacion);
        c.txtZip.setText(zip);
        c.comboPaises.setSelectedItem(pais);
        c.comboEstado.setSelectedItem(estado);

    }

    public void filtrar() {
        String bin = c.txtBin.getText();
        String mes = (String) c.comboMes.getSelectedItem();
        String anio = (String) c.comboAnio.getSelectedItem();
        String cvv = c.txtCvv.getText();
        String aplicacion = c.txtAplicacion.getText();
        String zip = c.txtZip.getText();
        String pais = (String) c.comboPaises.getSelectedItem();
        String estado = (String) c.comboEstado.getSelectedItem();
        String nombreColumnas[] = {"BIN", "Mes", "Anio", "CCV", "ZIP", "Aplicacion", "Estado", "Pais"};
        String datos[] = {bin, mes, anio, cvv, zip, aplicacion, estado, pais};
        c.tabla.setModel(FiltroTabla.filterTable(modelo, datos, nombreColumnas));
    }

    private void detectarCambios(JTextField... textFields) {
        for (JTextField text : textFields) {
            text.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    mostrarTarjeta();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    mostrarTarjeta();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    mostrarTarjeta();
                }
            }
            );
        }
    }

    private void detectarCambios(JComboBox... combos) {
        for (JComboBox co : combos) {
            co.addActionListener((ActionEvent e) -> {
//                String mes = (String) c.comboMes.getSelectedItem();
//                String anio = (String) c.comboAnio.getSelectedItem();
                String mes = evitarNullo(c.comboMes.getSelectedItem());
                String anio = evitarNullo(c.comboAnio.getSelectedItem());

                if (mes.equals("")) {
                    c.tarjetaCredito.setTarjet_dateMes("00");
                } else {
                    c.tarjetaCredito.setTarjet_dateMes(mes);
                }
                if (anio.equals("")) {
                    c.tarjetaCredito.setTarjet_dateAnio("00");
                } else {
                    if (!anio.equalsIgnoreCase("random")) {
                        anio = String.valueOf(anio.charAt(anio.length() - 2))
                                + String.valueOf(anio.charAt(anio.length() - 1));
                    }
                    c.tarjetaCredito.setTarjet_dateAnio(anio);
                }
            });
        }
    }

    private String evitarNullo(Object dato) {
        if (dato != null) {
            return dato.toString();
        } else {
            return "";
        }
    }

    private void mostrarTarjeta() {

        String defaultAplicacion = "Aplicacion+";
        String defaultZip = "00000";
        String defaultCvv = "000";

        String cvv = c.txtCvv.getText();
        if (cvv.equalsIgnoreCase("")) {
            c.tarjetaCredito.setTarjet_cvv(defaultCvv);
        } else {
            c.tarjetaCredito.setTarjet_cvv(cvv);
        }

        String aplicacion = c.txtAplicacion.getText();
        if (aplicacion.equalsIgnoreCase("")) {
            c.tarjetaCredito.setTarjet_aplicacion(defaultAplicacion);
        } else {
            c.tarjetaCredito.setTarjet_aplicacion(aplicacion);
        }

        String zip = c.txtZip.getText();
        if (zip.equalsIgnoreCase("")) {
            c.tarjetaCredito.setTarjet_zip(defaultZip);
        } else {
            c.tarjetaCredito.setTarjet_zip(zip);
        }

        String bin = c.txtBin.getText();
        c.tarjetaCredito.setTarjet_bin(bin);
        if (bin.length() > 0) {
            String nameTarjet;
            char f = bin.charAt(0);
            if (f == '5') {
                nameTarjet = "mastercard";
            } else {
                nameTarjet = "visa";
            }

            String urlImagen = "config/resources/img/logosTarjeta/" + nameTarjet + ".png";
            c.tarjetaCredito.setTarjet_urlImagenTarjeta(urlImagen);
        }
    }

}
