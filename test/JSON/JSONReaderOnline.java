package JSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class JSONReaderOnline {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Lee el JSON desde la URL
//            URL url = new URL("https://api.jsonbin.io/v3/b/66466ec5e41b4d34e4f4d6ce");
            URL url = new URL("https://drive.google.com/file/d/1D_zP30aU3DjVK82EhtEtyR4w-3FfwUYD/view?usp=sharing");
            JsonNode rootNode = mapper.readTree(url);

            // Navega por el JSON y lee los diferentes tipos de datos
            JsonNode recordNode = rootNode.path("record");
            JsonNode anuncioNode = recordNode.path("anuncio");
            String a1 = anuncioNode.path("a1").asText();
            String a2 = anuncioNode.path("a2").asText();
            String a3 = anuncioNode.path("a3").asText();

            JsonNode metadataNode = rootNode.path("metadata");
            String id = metadataNode.path("id").asText();
            boolean isPrivate = metadataNode.path("private").asBoolean();
            String createdAt = metadataNode.path("createdAt").asText();

            // Imprime los valores
            System.out.println("Anuncios:");
            System.out.println("a1: " + a1);
            System.out.println("a2: " + a2);
            System.out.println("a3: " + a3);

            System.out.println("Metadata:");
            System.out.println("ID: " + id);
            System.out.println("Private: " + isPrivate);
            System.out.println("Created At: " + createdAt);

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
