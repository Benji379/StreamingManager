package com.sm.utils;

import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;

public class TableUtils {

    public static DefaultTableModel sumColumnValues(DefaultTableModel model, String columnName) {
    //https://chat.openai.com/share/195121be-b30e-4b3c-a510-a9552f3fc98c
    // Creamos un mapa para almacenar el conteo de cada valor
        Map<Object, Integer> countMap = new HashMap<>();

        // Recorremos el modelo para contar las repeticiones de cada valor en la columna especificada
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object value = model.getValueAt(i, model.findColumn(columnName));
            if (countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                countMap.put(value, 1);
            }
        }

        // Creamos un nuevo modelo para almacenar los resultados
        DefaultTableModel resultModel = new DefaultTableModel();
        resultModel.setRowCount(0);
        resultModel.addColumn("Nombre");
        resultModel.addColumn("Cantidad");

        // Agregamos los resultados al nuevo modelo
        for (Map.Entry<Object, Integer> entry : countMap.entrySet()) {
            resultModel.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }

        return resultModel;
    }

}
