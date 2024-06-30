package resources;
import javax.swing.*;

public class Main {
    
    public static void main(String[] args) {
        // Ejemplo de uso del método con un JLabel
//        String textoIngresado = "19287823374";
        String textoIngresado = "187212";
        JLabel label = new JLabel("ojasijaods");
        remplazarNumerosEnLabel(textoIngresado, label);
        System.out.println(label.getText()); // Esto imprimirá el texto actualizado del JLabel
    }

    public static void remplazarNumerosEnLabel(String numerosTexto, JLabel label) {
//        label.setText("XXXX  XXXX  XXXX  XXXX");
        // Si el texto tiene menos de 16 caracteres, completamos con X
        if (numerosTexto.length() < 16) {
            numerosTexto += "XXXXXXXXXXXXXXXX".substring(numerosTexto.length());
        }

        // Creamos un StringBuilder para construir el nuevo texto del JLabel
        StringBuilder nuevoTexto = new StringBuilder();

        int indexNumeros = 0;
        for (char c : "XXXX  XXXX  XXXX  XXXX".toCharArray()) {
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
}
