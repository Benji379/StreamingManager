package JSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class JSONReaderDrive {

    public static void consultar() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // URL del JSON en Google Drive
            //https://drive.google.com/file/d/1D_zP30aU3DjVK82EhtEtyR4w-3FfwUYD/view?usp=sharing
            String link = "1D_zP30aU3DjVK82EhtEtyR4w-3FfwUYD";
            String urlDescarga = "https://drive.usercontent.google.com/u/0/uc?id=" + link + "&export=download";
            URL url = new URL(urlDescarga);
            JsonNode rootNode = mapper.readTree(url);

            // Navega por el JSON y lee los diferentes tipos de datos
            String anuncios[] = mapper.readValue(rootNode.get("anuncio").toString(), String[].class);
            
            System.out.println("Anuncios: ");
            for(String an : anuncios){
                System.out.println(an);
            }
            
            JsonNode metadataNode = rootNode.path("metadata");
            String version = metadataNode.path("version").asText();
            String host = metadataNode.path("host").asText();
            String user = metadataNode.path("user").asText();
            String password = metadataNode.path("password").asText();

            // Imprime los valores
            System.out.println("Metadata:");
            System.out.println("Version: " + version);
            System.out.println("Host: " + host);
            System.out.println("User: " + user);
            System.out.println("Password: " + password);

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        consultar();
    }
}
