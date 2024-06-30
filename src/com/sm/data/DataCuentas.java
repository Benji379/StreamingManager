package com.sm.data;

import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.sm.modelo.Cuenta;

public class DataCuentas {

    private static final String URL_GUARDADO = "config/backup/Data/cuentas.bin";

    // Cambiamos a LinkedHashMap para mantener el orden de inserción.
    private LinkedHashMap<String, Cuenta> hashCuentas;

    public DataCuentas() {
        hashCuentas = new LinkedHashMap<>();
        cargarChoferDesdeArchivo(); // Método para cargar choferes al inicio desde el archivo .bin
    }

    public void registrar(Cuenta cuenta) {
        hashCuentas.put(cuenta.getCod(), cuenta);
        guardarEnArchivo();
    }

    public void actualizar(Cuenta cod) {
        hashCuentas.put(cod.getCod(), cod);
        guardarEnArchivo();
    }

    public void borrar(String cod) {
        hashCuentas.remove(cod);
        guardarEnArchivo();
    }
    
    public Cuenta getConsultar(String cod){
        return hashCuentas.get(cod);
    }
    
    public DefaultTableModel consultar() {
//        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        DefaultTableModel modelo  = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Usuario", "Password", "Aplicacion", "Estado", "Inicio", "Final"
                });
        modelo.setRowCount(0); // Limpia el modelo para nuevos datos

        // Suponiendo que 'hashChofer' es tu LinkedHashMap y que mantienes el orden de inserción
        for (Cuenta cuenta : hashCuentas.values()) {
            // Los datos se agregarán en el modelo del JTable en el orden en que se iteran aquí
            modelo.addRow(new Object[]{
                cuenta.getCod(),
                cuenta.getUsuario(),
                cuenta.getPassword(),
                cuenta.getAplicacion(),
                cuenta.getEstado(),
                cuenta.getFechaInicio(),
                cuenta.getFechaFinal()
            });
        }
        return modelo;
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(URL_GUARDADO))) {
            out.writeObject(hashCuentas);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<Object> getConsultar(int columna) {
        ArrayList<Object> resultado = new ArrayList<>();
        for (Cuenta cuenta : hashCuentas.values()) {
            switch (columna) {
                case 0:
                    resultado.add(cuenta.getCod());
                    break;
                case 1:
                    resultado.add(cuenta.getUsuario());
                    break;
                case 2:
                    resultado.add(cuenta.getPassword());
                    break;
                case 3:
                    resultado.add(cuenta.getAplicacion());
                    break;
                case 4:
                    resultado.add(cuenta.getEstado());
                    break;
                case 5:
                    resultado.add(cuenta.getFechaInicio());
                    break;
                case 6:
                    resultado.add(cuenta.getFechaFinal());
                    break;
            }
        }
        return resultado;
    }
    
    public ArrayList<Cuenta> getConsultar() {
        ArrayList<Cuenta> resultado = new ArrayList<>();
        for (Cuenta cuenta : hashCuentas.values()) {
            resultado.add(cuenta);
        }
        return resultado;
    }
    
    public boolean existeApoderado(String dni) {
        return hashCuentas.containsKey(dni);
    }

    @SuppressWarnings("unchecked")
    private void cargarChoferDesdeArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(URL_GUARDADO))) {
            // Primero leemos el objeto como HashMap, ya que así fue originalmente guardado.
            Object readObject = in.readObject();
            if (readObject instanceof HashMap) {
                // Creamos un nuevo LinkedHashMap para mantener el orden de inserción.
                hashCuentas = new LinkedHashMap<>((HashMap<String, Cuenta>) readObject);
            } else {
                throw new IllegalArgumentException("Tipo de objeto no esperado en el archivo: " + readObject.getClass());
            }
        } catch (FileNotFoundException e) {
            hashCuentas = new LinkedHashMap<>(); // Si no se encuentra el archivo, inicializamos un nuevo LinkedHashMap
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
            hashCuentas = new LinkedHashMap<>(); // En caso de otro error, también inicializamos un nuevo LinkedHashMap
        }
    }
    public static void main(String[] args) {
        DataCuentas da = new DataCuentas();
        
        for(Cuenta c : da.getConsultar()){
            System.out.println(c.getAplicacion());
        }
        System.out.println(da.getConsultar("00000003").getPassword());
    }
}
