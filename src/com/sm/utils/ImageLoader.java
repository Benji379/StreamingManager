package com.sm.utils;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageLoader {

    public static Icon getIconFromURL(String imageUrl) {
        try {
            // Crear un objeto URL desde el string
            URL url = new URL(imageUrl);

            Image image;
            // Leer la imagen desde el stream
            try ( // Abrir un stream de entrada desde la URL
                    InputStream inputStream = url.openStream()) {
                // Leer la imagen desde el stream
                image = ImageIO.read(inputStream);
                // Cerrar el stream
            }

            // Crear y retornar el ImageIcon
            return new ImageIcon(image);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método
        String imageUrl = "https://fv5-2.failiem.lv/thumb_show.php?i=38fwjdyhxt&view&v=1";
        Icon icon = getIconFromURL(imageUrl);

        // Crear un JFrame para mostrar el icono
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Agregar el icono a un JLabel y luego al JFrame
        if (icon != null) {
            JLabel label = new JLabel(icon);
            frame.add(label);
        } else {
            System.out.println("Error al cargar la imagen.");
        }

        // Mostrar el JFrame
        frame.setVisible(true);
    }
}
