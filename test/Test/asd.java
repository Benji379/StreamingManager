package Test;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class asd {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "Hola Aracely";
        String textoInvertido = textoInvertido(texto);
        System.out.println("Ingrese un numero");
        int n1, n2, n3, n4;
        n1 = teclado.nextInt();
        n2 = 0;
        n3 = 1;
        for (int i = 2; i <= n1; i++) {
            n4 = n2 + n3;
            n2 = n3;
            System.out.println("d");
        }

        System.out.println("Texto original : " + texto);
        System.out.println("Texto invertido: " + textoInvertido);

    }

    public static String textoInvertido(String txt) {
        if (txt.isEmpty()) {
            return "";
        }
        return textoInvertido(txt.substring(1)) + txt.charAt(0);
    }

}
