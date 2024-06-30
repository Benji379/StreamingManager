package com.sm.utils;

import com.glasspanepopup.GlassPanePopup;
import com.glasspanepopup.MenssageInput;
import com.glasspanepopup.Message;
import com.glasspanepopup.MessageConf;
import com.glasspanepopup.MessageError;
import com.sm.modelo.MiInterfaz;
import com.sm.modelo.SystemConfig;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.sm.componet.CustomFileChooser;
import com.sm.load.Carga100;
import com.sm.load.Carga150;
import com.sm.load.Carga200;
import com.sm.modelo.Accion;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JColorChooser;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Action {

    public static void Pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static String _Null(Object dato) {
        if (dato != null) {
            return dato.toString();
        } else {
            return "";
        }
    }

    public static void cargar(Accion accionPrincipal, Accion pantallaCarga) {
        // Crear un nuevo hilo para ejecutar la acción principal
        Thread hilo = new Thread(() -> {
            // Mostrar la pantalla de carga
            SwingUtilities.invokeLater(pantallaCarga::ejecutar);
            // Ejecutar la acción principal
            accionPrincipal.ejecutar();
        });
        // Iniciar el hilo
        hilo.start();
    }
    
    public static void cargar(Accion accionPrincipal) {
        // Crear un nuevo hilo para ejecutar la acción principal
        Accion pantallaCarga = () -> GlassPanePopup.showPopup(new Carga150());
        Thread hilo = new Thread(() -> {
            // Mostrar la pantalla de carga
            SwingUtilities.invokeLater(pantallaCarga::ejecutar);
            // Ejecutar la acción principal
            Pausar(200);
            accionPrincipal.ejecutar();
            GlassPanePopup.closePopupLast();
        });
        // Iniciar el hilo
        hilo.start();
    }

    public static void cargando100() {
        GlassPanePopup.showPopup(new Carga100());
    }

    public static void cargando150() {
        GlassPanePopup.showPopup(new Carga150());
    }

    public static void cargando200() {
        GlassPanePopup.showPopup(new Carga200());
    }

    public static boolean verificarConexionInternet() {
        try {
            // Intenta conectarte a Google (puede ser cualquier sitio web confiable)
            URL url = new URL("http://www.google.com");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            urlConnect.setConnectTimeout(3000); // Tiempo de espera de 3 segundos
            urlConnect.connect();

            // Si la respuesta es 200 (HTTP_OK), hay conexión a Internet
            if (urlConnect.getResponseCode() == 200) {
                return true;
            }
        } catch (IOException e) {
            // Si hay una excepción, no hay conexión a Internet
            return false;
        }
        return false;
    }

    public static void msjC(MiInterfaz miInterfaz, String titulo) {
        MessageConf obj = new MessageConf(titulo);
        obj.eventOK((ActionEvent ae) -> {
            miInterfaz.Actualizar();
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    public static void mensaje(String mensaje) {
//        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.PLAIN_MESSAGE, new UIController().icono("/com/img/icons/checkVerde.png"));
        Message obj = new Message(mensaje, "Accion realizada");
        obj.eventOK((ActionEvent ae) -> {
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    public static void mensajeError(String mesanje) {
        MessageError obj = new MessageError(mesanje, "Ha ocurrido un error");
        obj.eventOK((ActionEvent ae) -> {
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException e) {
        }
    }

    public static void mensajeGuardarHits(JTable tabla) {
        MenssageInput obj = new MenssageInput("Ingrese el nombre de la Lista de Hits");
        obj.eventOK((ActionEvent ae) -> {
//            System.out.println(obj.getInput() + "amor");
            guardarListHit(obj.getInput(), tabla);
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    private static void guardarListHit(String nombreListaHits, JTable tabla) {
        String nombreArchivo;
        if (nombreListaHits.equals("")) {
            nombreArchivo = "Archivo sin nombre";
        } else {
            nombreArchivo = nombreListaHits;
        }
        String direccion = "config/backup/OpenBullet2/Mis_Hits/" + nombreArchivo + ".xlsx";
        ExportarExcel.exportToExcel(tabla, direccion, SystemConfig.MAIN_COLOR_1);
    }

    public static void vaciarTabla(JTable tabla) {
        DefaultTableModel mol = (DefaultTableModel) tabla.getModel();
        mol.setRowCount(0);
        tabla.setModel(mol);
    }

    public static void copiarPortapapeles(String text) {
        // Obtenemos el Toolkit del sistema
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Obtenemos el Clipboard del sistema
        Clipboard clipboard = toolkit.getSystemClipboard();
        // Creamos una StringSelection que contiene el texto a copiar
        StringSelection selection = new StringSelection(text);
        // Copiamos la StringSelection al Clipboard
        clipboard.setContents(selection, null);
        System.out.println("Texto copiado al portapapeles: " + text);
    }

    public static boolean sinVacio(String... txts) {
        for (String t : txts) {
            if (t.equals("")) {
                return false;
            }
        }
        return true;
    }

    public static Date convertirStringToDate(String fechaString) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaDate = formato.parse(fechaString);
            return fechaDate;
        } catch (ParseException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }

    public static String getColorHexString(String titulo, Color colorDefault) {
        // Guardar el LookAndFeel actual
        LookAndFeel lafAnterior = UIManager.getLookAndFeel();

        try {
            // Establecer el LookAndFeel personalizado solo para la ventana del JColorChooser
            FlatLaf.registerCustomDefaultsSource("com/sm/data");
            FlatDarculaLaf.setup();
            Color selectedColor = JColorChooser.showDialog(null, titulo, colorDefault);
            if (selectedColor != null) {
                return colorToHexString(selectedColor);
            } else {
                return null; // Si el usuario cancela la selección
            }
        } finally {
            try {
                // Restaurar el LookAndFeel original
                UIManager.setLookAndFeel(lafAnterior);
            } catch (UnsupportedLookAndFeelException e) {
                System.out.println("ERROR: " + e.getMessage());
                // Manejar la excepción si no se puede restaurar el LookAndFeel original
            }
        }
    }

    private static String colorToHexString(Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*#$_";

    public static String generarTokenRandom(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

        Random random = new Random();
        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            randomString.append(CHARACTERS.charAt(index));
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
//        boolean verificar = verificarConexionInternet();
//        if (verificar) {
//            System.out.println("TENEMOS CONEXION A INTERNET");
//        } else {
//            System.out.println("NO HAY CONEXION A INTERNET");
//        }
        System.out.println(generarTokenRandom(20));
    }

    public static void descargarExcel(Component c, String nombreArchivo, DefaultTableModel modelo) {
        try {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(c);
            String direccion = CustomFileChooser.chooseFile(frame, nombreArchivo, "xlsx", "Archivos excel");
            if (direccion != null) {
                ExportarExcel.exportToExcel(modelo, direccion, SystemConfig.MAIN_COLOR_1);
                Action.mensaje("Archivo descargado");
            } else {
//                System.out.println("No se descargo");
            }
        } catch (Exception e) {
        }
    }
}
