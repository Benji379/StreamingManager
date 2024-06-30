package com.sm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ImportarExcel {

    public static void cargarDatosDesdeExcel(JTable tabla, String archivoExcel) {
        // Ruta del archivo Excel

        try {
            // Crear un libro de trabajo de Excel
            try ( // Cargar el archivo Excel
                    FileInputStream archivo = new FileInputStream(new File(archivoExcel))) {
                // Crear un libro de trabajo de Excel
                XSSFWorkbook libro = new XSSFWorkbook(archivo);
                // Obtener la primera hoja del libro
                XSSFSheet hoja = libro.getSheetAt(0);
                // Obtener la primera fila para los nombres de columna
                Row filaNombresColumnas = hoja.getRow(0);
                String[] nombresColumnas = new String[filaNombresColumnas.getLastCellNum()];
                // Obtener los nombres de las columnas
                for (int i = 0; i < filaNombresColumnas.getLastCellNum(); i++) {
                    Cell celda = filaNombresColumnas.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                    if (celda != null) {
                        nombresColumnas[i] = celda.getStringCellValue();
                    } else {
                        nombresColumnas[i] = "";
                    }
                }   // Establecer los nombres de columna en el modelo de la tabla
                javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) tabla.getModel();
                modeloTabla.setRowCount(0);
                modeloTabla.setColumnIdentifiers(nombresColumnas);
                // Iterar sobre las filas de la hoja (empezando desde la segunda fila, ya que la primera fila son los nombres de columna)
                for (int rowIndex = 1; rowIndex <= hoja.getLastRowNum(); rowIndex++) {
                    Row fila = hoja.getRow(rowIndex);
                    if (fila != null) {
                        // Crear un arreglo para almacenar los datos de la fila
                        Object[] datosFila = new Object[nombresColumnas.length];

                        // Iterar sobre las celdas de la fila
                        for (int columnIndex = 0; columnIndex < nombresColumnas.length; columnIndex++) {
                            Cell celda = fila.getCell(columnIndex, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                            if (celda != null) {
                                switch (celda.getCellTypeEnum()) {
                                    case STRING:
                                        datosFila[columnIndex] = celda.getStringCellValue();
                                        break;
                                    case NUMERIC:
                                        datosFila[columnIndex] = celda.getNumericCellValue();
                                        break;
                                    case BOOLEAN:
                                        datosFila[columnIndex] = celda.getBooleanCellValue();
                                        break;
                                    default:
                                        datosFila[columnIndex] = null;
                                }
                            } else {
                                datosFila[columnIndex] = null;
                            }
                        }

                        // Agregar los datos de la fila al modelo de la tabla
                        modeloTabla.addRow(datosFila);
                    }
                }
                // Cerrar el archivo
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static DefaultTableModel cargarDatosDesdeExcel(String archivoExcel) {
        DefaultTableModel modeloTabla = new DefaultTableModel();

        try {
            // Cargar el archivo Excel
            FileInputStream archivo = new FileInputStream(new File(archivoExcel));
            // Crear un libro de trabajo de Excel
            XSSFWorkbook libro = new XSSFWorkbook(archivo);
            // Obtener la primera hoja del libro
            XSSFSheet hoja = libro.getSheetAt(0);
            // Obtener la primera fila para los nombres de columna
            Row filaNombresColumnas = hoja.getRow(0);
            String[] nombresColumnas = new String[filaNombresColumnas.getLastCellNum()];
            // Obtener los nombres de las columnas
            for (int i = 0; i < filaNombresColumnas.getLastCellNum(); i++) {
                Cell celda = filaNombresColumnas.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (celda != null) {
                    nombresColumnas[i] = celda.getStringCellValue();
                } else {
                    nombresColumnas[i] = "";
                }
            }
            // Establecer los nombres de columna en el modelo de la tabla
            modeloTabla.setColumnIdentifiers(nombresColumnas);
            // Iterar sobre las filas de la hoja (empezando desde la segunda fila, ya que la primera fila son los nombres de columna)
            for (int rowIndex = 1; rowIndex <= hoja.getLastRowNum(); rowIndex++) {
                Row fila = hoja.getRow(rowIndex);
                if (fila != null) {
                    // Crear un arreglo para almacenar los datos de la fila
                    Object[] datosFila = new Object[nombresColumnas.length];

                    // Iterar sobre las celdas de la fila
                    for (int columnIndex = 0; columnIndex < nombresColumnas.length; columnIndex++) {
                        Cell celda = fila.getCell(columnIndex, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                        if (celda != null) {
                            switch (celda.getCellTypeEnum()) {
                                case STRING:
                                    datosFila[columnIndex] = celda.getStringCellValue();
                                    break;
                                case NUMERIC:
                                    datosFila[columnIndex] = celda.getNumericCellValue();
                                    break;
                                case BOOLEAN:
                                    datosFila[columnIndex] = celda.getBooleanCellValue();
                                    break;
                                default:
                                    datosFila[columnIndex] = null;
                            }
                        } else {
                            datosFila[columnIndex] = null;
                        }
                    }

                    // Agregar los datos de la fila al modelo de la tabla
                    modeloTabla.addRow(datosFila);
                }
            }
            // Cerrar el archivo
            archivo.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return modeloTabla;
    }
}
