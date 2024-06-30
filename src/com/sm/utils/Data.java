package com.sm.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Data {

    public static String leerDato(String objeto, String atributo) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(new File("config/backup/Configuracion/data.json"));
            JsonNode objectNode = rootNode.get(objeto);
            String dato = objectNode.get(atributo).asText();
            return dato;
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }

    public static void modificarDato(String objeto, String atributo, String dato) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Lee el archivo JSON
            File file = new File("config/backup/Configuracion/data.json");
            JsonNode rootNode = mapper.readTree(file);

            // Encuentra el nodo del objeto específico
            JsonNode objetoNode = rootNode.path(objeto);

            if (objetoNode.isObject()) {
                // Si el objeto existe y es un ObjectNode, lo casteamos
                ObjectNode objectNode = (ObjectNode) objetoNode;

                // Modificamos solo el atributo específico
                objectNode.put(atributo, dato);

                // Guardamos el archivo con los cambios realizados
                mapper.writeValue(file, rootNode);
            } else {
                // Si el objeto no existe, podemos crear uno nuevo (opcional)
                ObjectNode newObjectNode = mapper.createObjectNode();
                newObjectNode.put(atributo, dato);
                ((ObjectNode) rootNode).set(objeto, newObjectNode);

                // Guardamos el archivo con los cambios realizados
                mapper.writeValue(file, rootNode);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static String datoSistem(String propiedad) throws MalformedURLException, IOException {
        try {
            // Obtener el nombre del host
            String hostName = InetAddress.getLocalHost().getHostName();
//            System.out.println("Nombre del host: " + hostName);

            // Obtener información adicional sobre el sistema
//            String osName = System.getProperty("os.name");
//            String osVersion = System.getProperty("os.version");
//            String osArch = System.getProperty("os.arch");
//            String javaVersion = System.getProperty("java.version");

//            System.out.println("Sistema operativo: " + osName);
//            System.out.println("Versión del sistema operativo: " + osVersion);
//            System.out.println("Arquitectura del sistema operativo: " + osArch);
//            System.out.println("Versión de Java: " + javaVersion);

            // Obtener la dirección IP pública utilizando un servicio web externo
            URL url = new URL("http://checkip.amazonaws.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String ipAddress = br.readLine().trim();
//            System.out.println("Dirección IP pública: " + ipAddress);
            return "";
        } catch (UnknownHostException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        try {
//            System.out.println(leerDato("color", "principal3"));
            modificarDato("user", "usuario", "marimar");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
