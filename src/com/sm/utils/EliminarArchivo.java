package com.sm.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EliminarArchivo {

    public static boolean eliminarArchivo(String rutaArchivo) {

        try {
            // Crear un objeto Path para la ruta del archivo
            Path rutaArchivoPath = Paths.get(rutaArchivo);

            // Verificar si la ruta especificada apunta a un archivo válido
            if (!Files.isRegularFile(rutaArchivoPath)) {
                throw new IllegalArgumentException("La ruta especificada no corresponde a un archivo válido.");
            }

            // Eliminar el archivo
            Files.delete(rutaArchivoPath);
            System.out.println("Archivo eliminado exitosamente: " + rutaArchivoPath);
            return true;
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

}
