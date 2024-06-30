package com.sm.modelo;

import java.io.Serializable;

public class Asignado implements Serializable{
    
    private String id;
    private String asignado;
    private String whastapp;
    private String fechaInicio;
    private String fechaFinal;
    private String estado;
    private Cuenta cuenta;

    public Asignado(String id, String asignado, String whastapp, String fechaInicio, String fechaFinal, String estado, Cuenta cuenta) {
        this.id = id;
        this.asignado = asignado;
        this.whastapp = whastapp;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.cuenta = cuenta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public String getWhastapp() {
        return whastapp;
    }

    public void setWhastapp(String whastapp) {
        this.whastapp = whastapp;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
}
