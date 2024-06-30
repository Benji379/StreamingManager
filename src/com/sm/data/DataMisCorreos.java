package com.sm.data;

import com.sm.modelo.MisCorreos;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DataMisCorreos {

    private static final String URL_GUARDADO = "config/backup/Data/MisCorreos.bin";

    // Cambiamos a LinkedHashMap para mantener el orden de inserción.
    private LinkedHashMap<String, MisCorreos> hashMisCorreos;

    public DataMisCorreos() {
        hashMisCorreos = new LinkedHashMap<>();
        cargarChoferDesdeArchivo(); // Método para cargar choferes al inicio desde el archivo .bin
    }

    public void registrar(MisCorreos misCorreos) {
        hashMisCorreos.put(misCorreos.getCorreo(), misCorreos);
        guardarEnArchivo();
    }

    public void actualizar(MisCorreos misCorreos) {
        hashMisCorreos.put(misCorreos.getCorreo(), misCorreos);
        guardarEnArchivo();
    }

    public void borrar(String correo) {
        hashMisCorreos.remove(correo);
        guardarEnArchivo();
    }

    public DefaultTableModel consultar() {
//        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Correos", "Estado"
                });
        modelo.setRowCount(0); // Limpia el modelo para nuevos datos

        // Suponiendo que 'hashChofer' es tu LinkedHashMap y que mantienes el orden de inserción
        for (MisCorreos misCorreos : hashMisCorreos.values()) {
            // Los datos se agregarán en el modelo del JTable en el orden en que se iteran aquí
            modelo.addRow(new Object[]{
                misCorreos.getCorreo(),
                misCorreos.getEstado()
            });
        }
        return modelo;
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(URL_GUARDADO))) {
            out.writeObject(hashMisCorreos);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<MisCorreos> getConsultar() {
        ArrayList<MisCorreos> resultado = new ArrayList<>();
        for (MisCorreos misCorreos : hashMisCorreos.values()) {
            resultado.add(misCorreos);
        }
        return resultado;
    }

    public ArrayList<Object> getConsultar(int columna) {
        ArrayList<Object> resultado = new ArrayList<>();
        for (MisCorreos cuenta : hashMisCorreos.values()) {
            switch (columna) {
                case 0:
                    resultado.add(cuenta.getCorreo());
                    break;
                case 1:
                    resultado.add(cuenta.getEstado());
                    break;
            }
        }
        return resultado;
    }

    public boolean existeApoderado(String dni) {
        return hashMisCorreos.containsKey(dni);
    }

    @SuppressWarnings("unchecked")
    private void cargarChoferDesdeArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(URL_GUARDADO))) {
            // Primero leemos el objeto como HashMap, ya que así fue originalmente guardado.
            Object readObject = in.readObject();
            if (readObject instanceof HashMap) {
                // Creamos un nuevo LinkedHashMap para mantener el orden de inserción.
                hashMisCorreos = new LinkedHashMap<>((HashMap<String, MisCorreos>) readObject);
            } else {
                throw new IllegalArgumentException("Tipo de objeto no esperado en el archivo: " + readObject.getClass());
            }
        } catch (FileNotFoundException e) {
            hashMisCorreos = new LinkedHashMap<>(); // Si no se encuentra el archivo, inicializamos un nuevo LinkedHashMap
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
            hashMisCorreos = new LinkedHashMap<>(); // En caso de otro error, también inicializamos un nuevo LinkedHashMap
        }
    }

}
