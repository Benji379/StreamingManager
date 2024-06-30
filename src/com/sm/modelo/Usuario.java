package com.sm.modelo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Usuario implements Serializable {

    private int idUsuario;
    private String nombre;
    private String password;
    private String correo;
    private String whatsapp;
    private int idRango;
    private int idGrupo;
    private int credito;
    private boolean estado;
    private Timestamp fecha;
    private String nombreRango;
    
    public Usuario(String nombre, String password, String correo, String whatsapp, int idRango, int idGrupo, int credito, boolean estado, Timestamp fecha) {
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.whatsapp = whatsapp;
        this.idRango = idRango;
        this.idGrupo = idGrupo;
        this.credito = credito;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getNombreRango() {
        return nombreRango;
    }

    public void setNombreRango(String nombreRango) {
        this.nombreRango = nombreRango;
    }
    
}
