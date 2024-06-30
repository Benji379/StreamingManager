package com.sm.modelo;

import java.io.Serializable;

public class MisCorreos implements Serializable{
    
    private String correo;
    private String estado;

    public MisCorreos(String correo, String estado) {
        this.correo = correo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
