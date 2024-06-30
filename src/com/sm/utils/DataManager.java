package com.sm.utils;

import java.io.*;
import javax.swing.table.DefaultTableModel;

public class DataManager {

    public static void guardarDatos(DefaultTableModel modelo, String direccionArchivo) {
        try {
            // Escribir encabezados de columnas
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(direccionArchivo))) {
                // Escribir encabezados de columnas
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    writer.write(modelo.getColumnName(i));
                    if (i < modelo.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
                
                // Escribir datos de la tabla
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    for (int j = 0; j < modelo.getColumnCount(); j++) {
                        writer.write(String.valueOf(modelo.getValueAt(i, j)));
                        if (j < modelo.getColumnCount() - 1) {
                            writer.write(",");
                        }
                    }
                    writer.newLine();
                }
            }
            System.out.println("Los datos se han guardado correctamente en el archivo " + direccionArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
            System.out.println("ERROR: "+e.getMessage());
        }
    }

    public static DefaultTableModel cargarDatos(String direccionArchivo) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(direccionArchivo));

            // Leer encabezados de columnas
            String[] columnas = reader.readLine().split(",");
            for (String columna : columnas) {
                modelo.addColumn(columna);
            }

            // Leer datos de la tabla
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                modelo.addRow(datos);
            }

            reader.close();
            System.out.println("Se han cargado los datos correctamente desde el archivo " + direccionArchivo);
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
            e.printStackTrace();
        }
        return modelo;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        DefaultTableModel modelo = new DefaultTableModel();
        // Llena el modelo con datos si es necesario
        String direccionArchivo = "ruta/del/archivo/data.csv";
        guardarDatos(modelo, direccionArchivo);
        DefaultTableModel modeloCargado = cargarDatos(direccionArchivo);
        // Usa el modelo cargado como desees
    }
}
