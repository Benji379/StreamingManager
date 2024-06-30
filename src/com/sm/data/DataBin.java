package com.sm.data;

import com.sm.modelo.Bin;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DataBin {

    private static final String URL_GUARDADO = "config/backup/Data/bins.bin";

    // Cambiamos a LinkedHashMap para mantener el orden de inserción.
    private LinkedHashMap<String, Bin> hashBins;

    public DataBin() {
        hashBins = new LinkedHashMap<>();
        cargarChoferDesdeArchivo(); // Método para cargar choferes al inicio desde el archivo .bin
    }

    public void registrar(Bin bin) {
        hashBins.put(bin.getId(), bin);
        guardarEnArchivo();
    }

    public void actualizar(Bin bin) {
        hashBins.put(bin.getId(), bin);
        guardarEnArchivo();
    }

    public void borrar(String id) {
        hashBins.remove(id);
        guardarEnArchivo();
    }

    public DefaultTableModel consultar() {
//        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "BIN", "Mes", "Anio", "CCV", "ZIP", "Aplicacion", "Estado", "Pais"
                });
        modelo.setRowCount(0); // Limpia el modelo para nuevos datos

        // Suponiendo que 'hashChofer' es tu LinkedHashMap y que mantienes el orden de inserción
        for (Bin bin : hashBins.values()) {
            // Los datos se agregarán en el modelo del JTable en el orden en que se iteran aquí
            modelo.addRow(new Object[]{
                bin.getId(),
                bin.getBin(),
                bin.getMes(),
                bin.getAnio(),
                bin.getCcv(),
                bin.getZip(),
                bin.getAplicacion(),
                bin.getEstado(),
                bin.getPais()
            });
        }
        return modelo;
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(URL_GUARDADO))) {
            out.writeObject(hashBins);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<Object> getConsultar(int columna) {
        ArrayList<Object> resultado = new ArrayList<>();
        for (Bin bin : hashBins.values()) {
            switch (columna) {
                case 0:
                    resultado.add(bin.getId());
                    break;
                case 1:
                    resultado.add(bin.getBin());
                    break;
                case 2:
                    resultado.add(bin.getMes());
                    break;
                case 3:
                    resultado.add(bin.getAnio());
                    break;
                case 4:
                    resultado.add(bin.getCcv());
                    break;
                case 5:
                    resultado.add(bin.getZip());
                    break;
                case 6:
                    resultado.add(bin.getAplicacion());
                    break;
                case 7:
                    resultado.add(bin.getEstado());
                    break;
                case 8:
                    resultado.add(bin.getPais());
                    break;
            }
        }
        return resultado;
    }

    public boolean existeApoderado(String dni) {
        return hashBins.containsKey(dni);
    }

    @SuppressWarnings("unchecked")
    private void cargarChoferDesdeArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(URL_GUARDADO))) {
            // Primero leemos el objeto como HashMap, ya que así fue originalmente guardado.
            Object readObject = in.readObject();
            if (readObject instanceof HashMap) {
                // Creamos un nuevo LinkedHashMap para mantener el orden de inserción.
                hashBins = new LinkedHashMap<>((HashMap<String, Bin>) readObject);
            } else {
                throw new IllegalArgumentException("Tipo de objeto no esperado en el archivo: " + readObject.getClass());
            }
        } catch (FileNotFoundException e) {
            hashBins = new LinkedHashMap<>(); // Si no se encuentra el archivo, inicializamos un nuevo LinkedHashMap
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
            hashBins = new LinkedHashMap<>(); // En caso de otro error, también inicializamos un nuevo LinkedHashMap
        }
    }

}
