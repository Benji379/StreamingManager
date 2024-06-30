package com.sm.modelo;

import java.sql.Timestamp;

public class Grupo {
    
    private int idGrupo;
    private String nombre;
    private String tokenGrupo;
    private Timestamp fecha;
    private int idAdministrador;
    private boolean estado;

    public Grupo(int idGrupo, String nombre, String tokenGrupo, Timestamp fecha, int idAdministrador, boolean estado) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.tokenGrupo = tokenGrupo;
        this.fecha = fecha;
        this.idAdministrador = idAdministrador;
        this.estado = estado;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTokenGrupo() {
        return tokenGrupo;
    }

    public void setTokenGrupo(String tokenGrupo) {
        this.tokenGrupo = tokenGrupo;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
