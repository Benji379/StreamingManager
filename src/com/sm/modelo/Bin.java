package com.sm.modelo;

import java.io.Serializable;

public class Bin implements Serializable {

    private String id;
    private String bin;
    private String mes;
    private String anio;
    private String ccv;
    private String zip;
    private String aplicacion;
    private String pais;
    private String estado;

    public Bin(String id, String bin, String mes, String anio, String ccv, String zip, String aplicacion, String pais, String estado) {
        this.id = id;
        this.bin = bin;
        this.mes = mes;
        this.anio = anio;
        this.ccv = ccv;
        this.zip = zip;
        this.aplicacion = aplicacion;
        this.pais = pais;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
