package com.sm.modelo;

import java.sql.Timestamp;

public class Rango {

    private int idRango;
    private String nombre;
    private Timestamp fecha;
    private boolean estado;

    public Rango(int idRango, String nombre, Timestamp fecha, boolean estado) {
        this.idRango = idRango;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
