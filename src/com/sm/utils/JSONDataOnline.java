package com.sm.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sm.modelo.Anuncio;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class JSONDataOnline {

    private ArrayList<Anuncio> listaAnuncios;
    private String version;
    private String hostBD;
    private String userBD;
    private String passwordBD;

    public JSONDataOnline() {
        consultar();
    }

    private void consultar() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // URL del JSON en Google Drive
            //https://drive.google.com/file/d/1D_zP30aU3DjVK82EhtEtyR4w-3FfwUYD/view?usp=sharing
            String link = "1D_zP30aU3DjVK82EhtEtyR4w-3FfwUYD";
            String urlDescarga = "https://drive.usercontent.google.com/u/0/uc?id=" + link + "&export=download";
            URL url = new URL(urlDescarga);
            JsonNode rootNode = mapper.readTree(url);

            // Navega por el JSON y lee los diferentes tipos de datos
            listaAnuncios = new ArrayList<>();
            JsonNode anunciosNode = rootNode.path("anuncio");
            if (anunciosNode.isArray()) {
                for (JsonNode anuncioNode : anunciosNode) {
                    String urlImagen = anuncioNode.path("urlImagen").asText();
                    String urlSitio = anuncioNode.path("urlSitio").asText();
                    Anuncio anuncio = new Anuncio(urlImagen, urlSitio);
                    listaAnuncios.add(anuncio);
                }
            }

            JsonNode metadataNode = rootNode.path("metadata");
            version = metadataNode.path("version").asText();
            hostBD = metadataNode.path("host").asText();
            userBD = metadataNode.path("user").asText();
            passwordBD = metadataNode.path("password").asText();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<Anuncio> getListaAnuncios() {
        return listaAnuncios;
    }

    public String getVersion() {
        return version;
    }

    public String getHostBD() {
        return hostBD;
    }

    public String getUserBD() {
        return userBD;
    }

    public String getPasswordBD() {
        return passwordBD;
    }

    public static void main(String[] args) {
        ArrayList<Anuncio> listaAnuncios = new JSONDataOnline().getListaAnuncios();
        for (Anuncio anuncio : listaAnuncios) {
            System.out.println(anuncio.getUrlImagen());
            System.out.println(anuncio.getUrlPagina());
        }
    }
}
