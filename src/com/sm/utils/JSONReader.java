package com.sm.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
//https://chat.openai.com/share/71968eda-84ce-4cdf-8222-cf3e904fffe2

public class JSONReader {
    
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Lee el archivo JSON
            JsonNode rootNode = mapper.readTree(new File("jsonEsp.json"));

            // Lee los diferentes tipos de datos
            int[] array = mapper.readValue(rootNode.get("array").toString(), int[].class);
            boolean boolValue = rootNode.get("boleano").asBoolean();
            String color = rootNode.get("colorsito").asText();
            JsonNode nullNode = rootNode.get("nulo");
            Integer number = rootNode.get("numero").asInt();
            JsonNode objectNode = rootNode.get("objeto");
            String stringValue = rootNode.get("cadena").asText();

            // Imprime los valores
            System.out.println("Array:");
            for (int num : array) {
                System.out.println(num);
            }
            System.out.println("Boolean: " + boolValue);
            System.out.println("Color: " + color);
            System.out.println("Null: " + nullNode);
            System.out.println("Number: " + number);
            System.out.println("Object:");
            System.out.println(objectNode);
            System.out.println(objectNode.get("x").asText());
            System.out.println("String: " + stringValue);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
