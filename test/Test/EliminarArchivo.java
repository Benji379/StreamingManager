package Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EliminarArchivo {

    public static void eliminarArchivo(String rutaArchivo) {

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
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        eliminarArchivo("C:\\Users\\benja\\OneDrive\\Escritorio\\PRUEBA_COPIAR_ARCHIVO\\betastreamingplus.txt");
    }
}
