package com.sm.modelo;

import java.io.Serializable;

public class Cuenta implements Serializable {

    private String cod;
    private String usuario;
    private String password;
    private String aplicacion;
    private String estado;
    private String fechaInicio;
    private String fechaFinal;

    public Cuenta(String cod, String usuario, String password, String aplicacion, String estado, String fechaInicio, String fechaFinal) {
        this.cod = cod;
        this.usuario = usuario;
        this.password = password;
        this.aplicacion = aplicacion;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

}
