package com.sm.componet;

import jnafilechooser.api.JnaFileChooser;

public class FileChooserCustom {

    public static String FileChosserArchivo(String defaultName, String extension, String descripcionTitulo) {
        JnaFileChooser fileChooser = new JnaFileChooser();
        if (extension != null) {
            fileChooser.addFilter(descripcionTitulo, extension);
        }
        fileChooser.setMultiSelectionEnabled(false); // Cambia a true si deseas habilitar la selección múltiple
        fileChooser.setMode(JnaFileChooser.Mode.Files); // Cambia el modo según tus necesidades

        // Establece el nombre de archivo por defecto
        if (defaultName != null && !defaultName.isEmpty()) {
            fileChooser.setDefaultFileName(defaultName + "." + extension);
        }

        if (fileChooser.showOpenDialog(null)) {
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
//            System.out.println("Archivo seleccionado: " + selectedFilePath);
            return selectedFilePath;
        } else {
//            System.out.println("Selección de archivo cancelada.");
            return null;
        }
    }

}
