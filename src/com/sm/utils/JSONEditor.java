package com.sm.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;

public class JSONEditor {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Lee el archivo JSON
            File file = new File("jsonEsp.json");
            JsonNode rootNode = mapper.readTree(file);

            // Modifica el array
            ((ObjectNode) rootNode).putArray("array").add(4).add(5).add(6);

            // Modifica el booleano
            ((ObjectNode) rootNode).put("boleano", false);

            // Modifica el color
            ((ObjectNode) rootNode).put("colorsito", "blue");

            // Modifica el valor nulo
            ((ObjectNode) rootNode).putNull("nulo");

            // Modifica el número
            ((ObjectNode) rootNode).put("numero", 456);

            // Modifica el objeto
            ObjectNode objectNode = mapper.createObjectNode();
            objectNode.put("x", "y");
            objectNode.put("z", "w");
            ((ObjectNode) rootNode).set("objeto", objectNode);

            // Modifica la cadena
            ((ObjectNode) rootNode).put("cadena", "Hola Mundo");

            // Escribe los cambios de vuelta al archivo JSON
            mapper.writeValue(file, rootNode);

            System.out.println("Archivo JSON modificado con éxito.");
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
