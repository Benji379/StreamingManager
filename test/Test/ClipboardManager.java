package Test;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ClipboardManager {

    public static void copyToClipboard(String text) {
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

    public static void main(String[] args) {
        // Ejemplo de uso
        String textoAEscribir = "¡Hola, mundo!";
        copyToClipboard(textoAEscribir);
    }
}
