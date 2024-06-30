package Test;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    public void importTxtToTableModel(DefaultTableModel modelo, String urlCarpeta) {
        // Limpiamos el modelo antes de agregar nuevos datos
        modelo.setRowCount(0);

        File carpeta = new File(urlCarpeta);

        // Verificamos si la URL corresponde a una carpeta
        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            // Contador para el número de fila
            int contador = 1;

            // Iteramos sobre los archivos en la carpeta
            for (File archivo : archivos) {
                // Verificamos si el archivo es un archivo .txt
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".txt")) {
                    try {
                        // Creamos un BufferedReader para leer el archivo
                        BufferedReader reader = new BufferedReader(new FileReader(archivo));

                        // Contador de líneas
                        int lineCount = 0;
                        while (reader.readLine() != null) {
                            lineCount++;
                        }

                        // Cerramos el BufferedReader
                        reader.close();

                        // Agregamos los datos al modelo de tabla
                        modelo.addRow(new Object[]{
                            contador,
                            archivo.getName(), // Nombre del archivo
                            lineCount, // Cantidad de líneas
                            "Libre" // Estado por defecto
                        });

                        // Incrementamos el contador de fila
                        contador++;
                    } catch (IOException e) {
                        System.out.println("");
                    }
                }
            }
        } else {
            System.err.println("La URL no corresponde a una carpeta.");
        }
    }
}
