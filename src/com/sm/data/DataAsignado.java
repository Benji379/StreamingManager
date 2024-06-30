package com.sm.data;

import com.sm.modelo.Asignado;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DataAsignado {

    private static final String URL_GUARDADO = "config/backup/Data/Asignado.bin";

    // Cambiamos a LinkedHashMap para mantener el orden de inserción.
    private LinkedHashMap<String, Asignado> hashAsignado;

    public DataAsignado() {
        hashAsignado = new LinkedHashMap<>();
        cargarChoferDesdeArchivo(); // Método para cargar choferes al inicio desde el archivo .bin
    }

    public void registrar(Asignado asignado) {
        hashAsignado.put(asignado.getId(), asignado);
        guardarEnArchivo();
    }

    public void actualizar(Asignado asignado) {
        hashAsignado.put(asignado.getId(), asignado);
        guardarEnArchivo();
    }

    public void borrar(String cod) {
        hashAsignado.remove(cod);
        guardarEnArchivo();
    }

    public DefaultTableModel consultar() {
//        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        DefaultTableModel modelo  = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Asignado", "WhatsApp", "Inicio", "Fin", "Estado", "Cuenta"
                });
        modelo.setRowCount(0); // Limpia el modelo para nuevos datos

        // Suponiendo que 'hashChofer' es tu LinkedHashMap y que mantienes el orden de inserción
        for (Asignado asignado : hashAsignado.values()) {
            // Los datos se agregarán en el modelo del JTable en el orden en que se iteran aquí
            modelo.addRow(new Object[]{
                asignado.getId(),
                asignado.getAsignado(),
                asignado.getWhastapp(),
                asignado.getFechaInicio(),
                asignado.getFechaFinal(),
                asignado.getEstado(),
                asignado.getCuenta().getCod()
            });
        }
        return modelo;
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(URL_GUARDADO))) {
            out.writeObject(hashAsignado);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<Asignado> getConsultar() {
        ArrayList<Asignado> resultado = new ArrayList<>();
        for (Asignado cuenta : hashAsignado.values()) {
            resultado.add(cuenta);
        }
        return resultado;
    }
    
    public ArrayList<Object> getConsultar(int columna) {
        ArrayList<Object> resultado = new ArrayList<>();
        for (Asignado cuenta : hashAsignado.values()) {
            switch (columna) {
                case 0:
                    resultado.add(cuenta.getId());
                    break;
                case 1:
                    resultado.add(cuenta.getAsignado());
                    break;
                case 2:
                    resultado.add(cuenta.getWhastapp());
                    break;
                case 3:
                    resultado.add(cuenta.getFechaInicio());
                    break;
                case 4:
                    resultado.add(cuenta.getFechaFinal());
                    break;
                case 5:
                    resultado.add(cuenta.getEstado());
                    break;
                case 6:
                    resultado.add(cuenta.getCuenta());
                    break;
                    
            }
        }
        return resultado;
    }

    public boolean existeApoderado(String dni) {
        return hashAsignado.containsKey(dni);
    }

    @SuppressWarnings("unchecked")
    private void cargarChoferDesdeArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(URL_GUARDADO))) {
            // Primero leemos el objeto como HashMap, ya que así fue originalmente guardado.
            Object readObject = in.readObject();
            if (readObject instanceof HashMap) {
                // Creamos un nuevo LinkedHashMap para mantener el orden de inserción.
                hashAsignado = new LinkedHashMap<>((HashMap<String, Asignado>) readObject);
            } else {
                throw new IllegalArgumentException("Tipo de objeto no esperado en el archivo: " + readObject.getClass());
            }
        } catch (FileNotFoundException e) {
            hashAsignado = new LinkedHashMap<>(); // Si no se encuentra el archivo, inicializamos un nuevo LinkedHashMap
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
            hashAsignado = new LinkedHashMap<>(); // En caso de otro error, también inicializamos un nuevo LinkedHashMap
        }
    }

}
