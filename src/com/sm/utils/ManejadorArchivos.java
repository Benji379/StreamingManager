package com.sm.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManejadorArchivos {

    private String rutaOriginal;
    private String rutaDestinoCompleta;

    public ManejadorArchivos(String rutaOriginal, String rutaDestinoCompleta) {
        this.rutaOriginal = rutaOriginal;
        this.rutaDestinoCompleta = rutaDestinoCompleta;
    }

    public void accion() {
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

    public String getNombreArchivo() {
        Path rutaOrigenPath = Paths.get(rutaOriginal);
        String nombreArchivo = rutaOrigenPath.getFileName().toString();
        int index = nombreArchivo.lastIndexOf('.');
        if (index > 0) {
            return nombreArchivo.substring(0, index);
        }
        return nombreArchivo;
    }

    public static void main(String[] args) {
        String rutaOriginal = "C:\\Users\\benja\\OneDrive\\Escritorio\\BENJAMIN.txt";
        String rutaDestinoCompleta = "C:\\Users\\benja\\OneDrive\\Escritorio\\PRUEBA_COPIAR_ARCHIVO\\BENJAMIN.txt";

        ManejadorArchivos manejador = new ManejadorArchivos(rutaOriginal, rutaDestinoCompleta);
        manejador.accion();

        System.out.println("Nombre del archivo: " + manejador.getNombreArchivo());
    }
}
