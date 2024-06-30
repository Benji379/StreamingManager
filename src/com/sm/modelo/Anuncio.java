package com.sm.modelo;

public class Anuncio {
    
    private String urlImagen;
    private String urlPagina;

    public Anuncio(String urlImagen, String urlPagina) {
        this.urlImagen = urlImagen;
        this.urlPagina = urlPagina;
    }

    public String getUrlPagina() {
        return urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    
    
    
}
