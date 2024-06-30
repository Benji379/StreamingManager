package com.sm.utils;

import com.glasspanepopup.GlassPanePopup;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class UIController {

    public static void MostrarPanel(JPanel contenedor, JPanel panel) {
        contenedor.removeAll();
//        contenedor.setSize(0, 0);
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void ventanaEmergente(String mensaje, String pieTittle, String urlIcono) {
        JOptionPane.showMessageDialog(null, mensaje, pieTittle, JOptionPane.CLOSED_OPTION, new UIController().icono(urlIcono));
    }

    public Icon icono(String path) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public static void transparentarTextField(JTextField... textField) {
        for (JTextField tx : textField) {
            tx.setBackground(new Color(0, 0, 0, 0));
            tx.setBorder(null);
        }
    }

    public static Icon getIconURL(String imageUrl) {
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

    public static void scrollToTop(JScrollPane scrollPane) {
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMinimum());
    }

    public static void removerBordeBlanco(JScrollPane scrollPane) {
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public static void scrollInvisible(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
    }

    public static void textAreaInivisible(JTextArea textArea, JScrollPane scrollTextArea) {
        textArea.setBackground(new Color(255, 255, 255, 0)); // 128 es el nivel de opacidad
        UIController.scrollInvisible(scrollTextArea);
        textArea.setWrapStyleWord(true); // Activa el ajuste de líneas
        textArea.setLineWrap(true); // Activa el ajuste de líneas
    }

    public static Object datoFilaColumna(JTable tabla, int fila, String nombreColumna) {
        int columnaCodigo = 0;
        Object dato;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (tabla.getColumnName(i).equalsIgnoreCase(nombreColumna)) {
                columnaCodigo = i;
                break;
            }
        }
        dato = tabla.getValueAt(fila, columnaCodigo);
        return dato;
    }

    public static Object datoFilaColumna(DefaultTableModel modelo, int fila, String nombreColumna) {
        int columnaCodigo = -1;
        Object dato = null;

        // Buscar la columna por su nombre
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            if (modelo.getColumnName(i).equalsIgnoreCase(nombreColumna)) {
                columnaCodigo = i;
                break;
            }
        }

        // Verificar si se encontró la columna
        if (columnaCodigo != -1) {
            // Obtener el dato de la fila y columna especificadas
            dato = modelo.getValueAt(fila, columnaCodigo);
        } else {
            System.out.println("La columna especificada no se encontró en el modelo de tabla.");
        }

        return dato;
    }

    public static void cambiarDato(JTable tabla, String nombreColumnaBuscar, Object datoBuscar, Object datoReemplazar) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int columnaBuscar = -1;

        // Buscar la columna por su nombre
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            if (modelo.getColumnName(i).equals(nombreColumnaBuscar)) {
                columnaBuscar = i;
                break;
            }
        }

        // Si la columna no se encuentra, salir del método
        if (columnaBuscar == -1) {
            System.out.println("La columna especificada no se encontró en la tabla.");
            return;
        }

        // Recorrer las filas para buscar el dato a reemplazar
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            Object dato = modelo.getValueAt(fila, columnaBuscar);
            if (dato != null && dato.equals(datoBuscar)) {
                modelo.setValueAt(datoReemplazar, fila, columnaBuscar);
                break; // Se encontró el dato, salir del bucle
            }
        }
    }

    public static void cambiarDato(DefaultTableModel modelo, String nombreColumnaBuscar, Object datoBuscar, Object datoReemplazar) {
        int columnaBuscar = -1;

        // Buscar la columna por su nombre
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            if (modelo.getColumnName(i).equals(nombreColumnaBuscar)) {
                columnaBuscar = i;
                break;
            }
        }

        // Si la columna no se encuentra, salir del método
        if (columnaBuscar == -1) {
            System.out.println("La columna especificada no se encontró en el modelo de tabla.");
            return;
        }

        // Recorrer las filas para buscar el dato a reemplazar
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            Object dato = modelo.getValueAt(fila, columnaBuscar);
            if (dato != null && dato.equals(datoBuscar)) {
                modelo.setValueAt(datoReemplazar, fila, columnaBuscar);
                break; // Se encontró el dato, salir del bucle
            }
        }
    }

    public static void cambiarDato(DefaultTableModel modelo, String columnaID, Object idBuscar, String columnaDatoReemplazar, Object datoReemplazar) {
        int columnaIDIndex = modelo.findColumn(columnaID);
        int columnaDatoIndex = modelo.findColumn(columnaDatoReemplazar);

        if (columnaIDIndex == -1 || columnaDatoIndex == -1) {
            System.out.println("No se encontró la columna especificada en el modelo.");
            return;
        }

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            Object id = modelo.getValueAt(fila, columnaIDIndex);
            if (id != null && id.equals(idBuscar)) {
                modelo.setValueAt(datoReemplazar, fila, columnaDatoIndex);
                break; // Se encontró el ID, salir del bucle
            }
        }
    }

    public static void eliminarFila(DefaultTableModel modelo, String nombreColumna, Object dato) {
        int columnaIndex = modelo.findColumn(nombreColumna);

        if (columnaIndex == -1) {
            System.out.println("No se encontró la columna especificada en el modelo.");
            return;
        }

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            Object valor = modelo.getValueAt(fila, columnaIndex);
            if (valor != null && valor.equals(dato)) {
                modelo.removeRow(fila);
                break; // Se encontró el dato, salir del bucle
            }
        }
    }

    public static void ventanaEmergente(JFrame frame, JPanel panel, String titulo, int alto, int ancho) {
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(alto, ancho);
        dialog.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        dialog.setModal(true); // Hacer que el diálogo sea modal (bloquear otras interacciones)
        dialog.setContentPane(panel); // Establecer el JPanel recibido como contenido del JDialog
        dialog.setTitle(titulo);
        Image icon = frame.getIconImage();
        dialog.setIconImage(icon);// Obtener el icono del JFrame y establecerlo en el JDialog
        dialog.setResizable(false);
        dialog.setVisible(true); // Mostrar el JDialog
    }

    public static void ventanaEmergente(JPanel panel, String titulo, int alto, int ancho) {
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(alto, ancho);
        dialog.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        dialog.setModal(true); // Hacer que el diálogo sea modal (bloquear otras interacciones)
        dialog.setContentPane(panel); // Establecer el JPanel recibido como contenido del JDialog
        dialog.setTitle(titulo);
        dialog.setResizable(false);
        dialog.setVisible(true); // Mostrar el JDialog
    }

    // Método para aplicar una fuente personalizada a un JLabel con un tamaño específico
    public static void applyCustomFont(JLabel label, String fontPath, float fontSize) {
        try {
            // Crear una fuente a partir del archivo
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(fontSize);

            // Establecer la fuente en el JLabel
            label.setFont(customFont);
        } catch (IOException | java.awt.FontFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            // Manejo de errores si la fuente no puede cargarse
        }
    }

    public static ImageIcon imagenIcon(String imagePath) {
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(imagePath);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return icon;
    }

    public static ImageIcon cargarImagenInternet(String urlImagen) {
        try {
            // Crear un objeto URL desde la dirección proporcionada
            URL url = new URL(urlImagen);
            // Abrir una conexión a la URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // Establecer el método de solicitud
            conn.setRequestMethod("GET");
            // Obtener el flujo de entrada de la conexión
            InputStream inputStream = conn.getInputStream();
            // Leer la imagen desde el flujo de entrada
            BufferedImage image = ImageIO.read(inputStream);
            // Cerrar la conexión
            conn.disconnect();
            // Devolver la imagen como ImageIcon
            return new ImageIcon(image);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            // Manejar cualquier error que pueda ocurrir durante el proceso
            return null;
        }
    }

    public static void actualizarLabelBin(String numerosTexto, JLabel label) {
        // Si el texto tiene menos de 16 caracteres, completamos con X
        if (numerosTexto.length() < 16) {
            numerosTexto += "XXXXXXXXXXXXXXXX".substring(numerosTexto.length());
        }

        // Creamos un StringBuilder para construir el nuevo texto del JLabel
        StringBuilder nuevoTexto = new StringBuilder();

        int indexNumeros = 0;
        for (char c : label.getText().toCharArray()) {
            if (c == 'X') {
                // Si encontramos una X, la reemplazamos con el siguiente número
                nuevoTexto.append(numerosTexto.charAt(indexNumeros));
                indexNumeros++;
            } else {
                // Si no es una X, mantenemos el carácter original
                nuevoTexto.append(c);
            }
        }

        // Establecemos el nuevo texto en el JLabel
        label.setText(nuevoTexto.toString());
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionCaracteres(JTextField txtField, KeyEvent evt, int cantNumeros, boolean conEspacio) {
        if (conEspacio) {
            if (txtField.getText().length() >= cantNumeros) {
                evt.consume();
            }
        } else {
            int key = evt.getKeyChar();
            boolean espacio = key == KeyEvent.VK_SPACE;
            if (espacio) {
                evt.consume();
            } else {
                if (txtField.getText().length() >= cantNumeros) {
                    evt.consume();
                }
            }
        }
    }

    public static String getColorHex() {
        // Crear un nuevo JColorChooser
        JColorChooser colorChooser = new JColorChooser();

        // Crear un diálogo para mostrar el JColorChooser
        JFrame frame = new JFrame("Seleccione un color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(colorChooser);
        frame.pack();
        frame.setVisible(true);

        // Crear un ActionListener para el botón "OK" del JColorChooser
        ActionListener okListener = (ActionEvent e) -> {
            // Obtener el color seleccionado
            Color color = colorChooser.getColor();
            // Cerrar el diálogo
            frame.dispose();
            // Convertir el color seleccionado a formato hexadecimal
            String colorHex = String.format("#%06X", color.getRGB() & 0xFFFFFF);
            // Imprimir el color seleccionado en formato hexadecimal
            System.out.println("Color seleccionado en formato hexadecimal: " + colorHex);
        };

        // Obtener el botón "OK" del JColorChooser y agregar el ActionListener
        JButton okButton = new JButton("OK");
        okButton.addActionListener(okListener);

        // Esperar hasta que se seleccione un color y se cierre el diálogo
        while (frame.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // Devolver el color seleccionado en formato hexadecimal
        return "#" + Integer.toHexString(colorChooser.getColor().getRGB()).substring(2).toUpperCase();
    }

    public static void main(String[] args) {
//        String hola = getColorHex();
//        System.out.println(hola);
        ventanaEmergente("Enviando...", "Correo", "/com/sm/img/gmail.png");
    }

    public static java.awt.Window getParentWindonw(JComponent componet) {
        java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(componet);
        return parentWindow;
    }

    public static void acomodarImagenLabel(JLabel label) {
        Icon icon = label.getIcon();
        if (icon != null && icon instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) icon;
            Image image = imageIcon.getImage();
            Image newImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImage);
            label.setIcon(newIcon);
        }
    }
}
