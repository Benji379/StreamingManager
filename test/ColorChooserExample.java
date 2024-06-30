
import javax.swing.*;
import java.awt.*;

public class ColorChooserExample extends JFrame {

    public static String getColorHexString() {
        Color selectedColor = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
        if (selectedColor != null) {
            return colorToHexString(selectedColor);
        } else {
            return null; // Si el usuario cancela la selecci�n
        }
    }

    private static String colorToHexString(Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }

    public static void main(String[] args) {
        // Ejemplo de uso:
        String hexColor = getColorHexString();
        if (hexColor != null) {
            System.out.println("Color hexadecimal seleccionado: " + hexColor);
        } else {
            System.out.println("No se seleccion� ning�n color.");
        }
    }
}
