package com.sm.utils;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    public static DefaultTableModel importTxtToTableModel(String urlCarpeta) {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"N", "Nombre", "Cantidad", "Estado"}, 0);

        File carpeta = new File(urlCarpeta);

        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            int contador = 1;

            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".txt")) {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(archivo));

                        // Leer la cantidad de líneas del metadato
                        String linea;
                        int lineCount = 0;
                        while ((linea = reader.readLine()) != null) {
                            if (linea.startsWith("#LINES:")) {
                                lineCount = Integer.parseInt(linea.substring(7).trim());
                                break;
                            } else {
                                lineCount++;
                            }
                        }
                        reader.close();

                        // Obtener el nombre del archivo sin la extensión ".txt"
                        String nombreArchivo = archivo.getName();
                        int index = nombreArchivo.lastIndexOf(".");
                        if (index > 0) {
                            nombreArchivo = nombreArchivo.substring(0, index);
                        }

                        modelo.addRow(new Object[]{
                            contador,
                            nombreArchivo,
                            lineCount,
                            "Libre"
                        });

                        contador++;
                    } catch (IOException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                }
            }
        } else {
            System.err.println("La URL no corresponde a una carpeta.");
        }

        return modelo;
    }

    public static DefaultTableModel importTxtToTableModelopk(String urlCarpeta) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(
                    new Object[]{"N", "Nombre", "Aplicacion", "Estado"}, 0);

            File carpeta = new File(urlCarpeta);

            if (carpeta.isDirectory()) {
                File[] archivos = carpeta.listFiles();

                int contador = 1;

                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".opk")) {
                        // Obtener el nombre del archivo sin la extensión ".txt"
                        String nombreArchivo = archivo.getName();
                        int index = nombreArchivo.lastIndexOf(".");
                        if (index > 0) {
                            nombreArchivo = nombreArchivo.substring(0, index);
                        }

                        modelo.addRow(new Object[]{
                            contador,
                            nombreArchivo,
                            "null",
                            "Libre"
                        });

                        contador++;
                    }
                }
            } else {
                System.err.println("La URL no corresponde a una carpeta.");
            }

            return modelo;
        } catch (Exception e) {
            return null;
        }
    }

//    public static void main(String[] args) {
//        // Creamos una instancia de FileProcessor
//
//        // Especificamos la URL de la carpeta que contiene los archivos .txt
//        String urlCarpeta = "config/backup/OpenBullet2/ComboList";
//
//        // Utilizamos el método importTxtToTableModel para obtener el DefaultTableModel
//        DefaultTableModel modelo = FileProcessor.importTxtToTableModel(urlCarpeta);
//
//        // Creamos una tabla utilizando el modelo de tabla llenado con los archivos .txt
//        JTable table = new JTable(modelo);
//
//        // Creamos un JScrollPane para la tabla
//        JScrollPane scrollPane = new JScrollPane(table);
//
//        // Creamos un JFrame para mostrar la tabla
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(scrollPane);
//        frame.pack();
//        frame.setVisible(true);
//    }
}
