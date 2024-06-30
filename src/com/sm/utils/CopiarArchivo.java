package com.sm.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopiarArchivo {

    public static void copiarArchivoCarpeta(String rutaOriginal, String carpetaDestino) {
        try {
            // Corregir la ruta del archivo original para manejar la codificación de caracteres
            rutaOriginal = rutaOriginal.trim();

            // Crear objetos Path para la ruta original y el destino
            Path rutaOrigenPath = Paths.get(rutaOriginal);
            Path carpetaDestinoPath = Paths.get(carpetaDestino);

            // Verificar si la ruta original es un archivo válido
            if (!Files.isRegularFile(rutaOrigenPath)) {
                throw new IllegalArgumentException("La ruta original no es un archivo válido.");
            }

            // Verificar si la carpeta destino es un directorio válido
            if (!Files.isDirectory(carpetaDestinoPath)) {
                throw new IllegalArgumentException("La carpeta destino no es un directorio válido.");
            }

            // Obtener el nombre del archivo original
            String nombreArchivo = rutaOrigenPath.getFileName().toString();

            // Crear la ruta completa para la copia del archivo
            Path rutaDestinoPath = carpetaDestinoPath.resolve(nombreArchivo);

            // Verificar si la carpeta destino existe, si no, crearla
            if (!Files.exists(carpetaDestinoPath)) {
                Files.createDirectories(carpetaDestinoPath);
            }

            // Copiar el archivo
            Files.copy(rutaOrigenPath, rutaDestinoPath);

            System.out.println("Archivo copiado exitosamente a: " + rutaDestinoPath);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void copiarArchivo(String rutaOriginal, String rutaDestinoCompleta) {
        try {
            // Corregir la ruta del archivo original para manejar la codificación de caracteres
            rutaOriginal = rutaOriginal.trim();

            // Crear objetos Path para la ruta original y el destino
            Path rutaOrigenPath = Paths.get(rutaOriginal);
            Path rutaDestinoPath = Paths.get(rutaDestinoCompleta);

            // Verificar si la ruta original es un archivo válido
            if (!Files.isRegularFile(rutaOrigenPath)) {
                throw new IllegalArgumentException("La ruta original no es un archivo válido.");
            }

            // Verificar si la ruta destino es una ruta válida
            if (Files.isDirectory(rutaDestinoPath)) {
                // Si la ruta destino es un directorio, crear la ruta completa usando el nombre del archivo original
                String nombreArchivo = rutaOrigenPath.getFileName().toString();
                rutaDestinoPath = rutaDestinoPath.resolve(nombreArchivo);
            }

            // Verificar si la ruta destino es un archivo válido
            if (Files.exists(rutaDestinoPath) && Files.isDirectory(rutaDestinoPath)) {
                // Si la ruta destino es un directorio existente, crear la ruta completa usando el nombre del archivo original
                String nombreArchivo = rutaOrigenPath.getFileName().toString();
                rutaDestinoPath = rutaDestinoPath.resolve(nombreArchivo);
            }

            // Copiar el archivo
            Files.copy(rutaOrigenPath, rutaDestinoPath);

            System.out.println("Archivo copiado exitosamente a: " + rutaDestinoPath);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

//    public static void main(String[] args) {
//        try {
//            // Ejemplo de uso
//            copiarArchivoCarpeta("C:/Users/benja/OneDrive/Escritorio/betastreamingplus.txt", "C:/Users/benja/OneDrive/Escritorio/PRUEBA_COPIAR_ARCHIVO");
//        } catch (IOException e) {
//            System.out.println("ERROR: " + e.getMessage());
//        }
//    }
}
