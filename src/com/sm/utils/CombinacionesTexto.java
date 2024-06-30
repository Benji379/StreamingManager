package com.sm.utils;

import java.util.ArrayList;

public class CombinacionesTexto {

    private String texto;

    // Constructor que recibe el texto como par�metro
    public CombinacionesTexto(String texto) {
        this.texto = texto;
    }

    // M�todo para calcular la cantidad de combinaciones posibles
    public int calcularCantidadCombinaciones() {
        int longitud = texto.length();
        // La cantidad de combinaciones posibles es 2 elevado a la cantidad de caracteres menos 1
        return (int) Math.pow(2, longitud - 1);
    }

    // M�todo para generar la lista de combinaciones en formato ArrayList<String>
    public ArrayList<String> generarCombinaciones(int cantidad) {
        ArrayList<String> combinaciones = new ArrayList<>();
        // Recorremos desde 0 hasta cantidad - 1 para generar las combinaciones
        for (int i = 0; i < cantidad; i++) {
            StringBuilder combinacion = new StringBuilder();
            for (int j = 0; j < texto.length(); j++) {
                combinacion.append(texto.charAt(j));
                // Agregamos un punto si el bit correspondiente est� encendido en el n�mero i
                if ((i & (1 << j)) > 0 && j < texto.length() - 1) {
                    combinacion.append(".");
                }
            }
            // Agregamos la combinaci�n a la lista
            combinaciones.add(combinacion.toString());
        }
        return combinaciones;
    }

    public static void main(String[] args) {
//        String texto = "correo";
        String texto = "benji";
        CombinacionesTexto combinaciones = new CombinacionesTexto(texto);
        int cantidadCombinaciones = combinaciones.calcularCantidadCombinaciones();
        ArrayList<String> listaCombinaciones = combinaciones.generarCombinaciones(cantidadCombinaciones);

        // Imprimimos la cantidad de combinaciones posibles
        System.out.println("Cantidad de combinaciones posibles: " + cantidadCombinaciones);
        // Imprimimos las combinaciones
        for (String combinacion : listaCombinaciones) {
            System.out.println(combinacion);
        }
    }
}
