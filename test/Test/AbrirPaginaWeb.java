package Test;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AbrirPaginaWeb {

    public static void main(String[] args) {
        // Datos para completar el formulario
        String bin = "1234567890123456";
        String month = "01"; // Enero
        String year = "2023";

        // URL de la página web
        String url = "https://cc-genpro.com/";

        // Construir la URL con los datos preingresados
        String urlConDatos = url + "?bin=" + bin + "&month=" + month + "&year=" + year;

        // Abrir la página web en el navegador predeterminado
        abrirPaginaWeb(urlConDatos);
    }

    public static void abrirPaginaWeb(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El manejo de escritorio no está soportado.");
        }
    }
}
