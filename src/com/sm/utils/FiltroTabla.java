package com.sm.utils;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableRowSorter;

public class FiltroTabla {

    /*
    public static void main(String[] args) {
        // Crear un JTable de ejemplo
        String[] columnNames = {"Nombre", "Apellido", "Edad"};
        Object[][] data = {
            {"John", "Doe", 30},
            {"Jane", "Smith", 25},
            {"Bob", "Johnson", 35},
            {"Alice", "Williams", 28}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Crear JTextFields para ingresar los criterios de búsqueda
        JTextField[] textFields = {new JTextField(), new JTextField()};
        String[] columnNamesToFilter = {"Nombre", "Apellido"};

        // Asignar los nombres de columna a los JTextFields
        for (int i = 0; i < columnNamesToFilter.length; i++) {
            textFields[i].setName(columnNamesToFilter[i]);
        }

        // Crear el botón de filtrar
        JButton filterButton = new JButton("Filtrar");

        // Crear el panel para los textFields y el botón
        JPanel filterPanel = new JPanel(new FlowLayout());
        for (JTextField textField : textFields) {
            filterPanel.add(textField);
        }
        filterPanel.add(filterButton);

        // Crear el frame y agregar el panel de filtros y la tabla
        JFrame frame = new JFrame("Filtrar JTable");
        frame.setLayout(new BorderLayout());
        frame.add(filterPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Agregar un listener al botón de filtrar
        filterButton.addActionListener(e -> filterTable(table, textFields, columnNamesToFilter));
    }
     */
    // Método para filtrar la tabla
    public static void filterTable(JTable table, DefaultTableModel modelo, JTextField[] textFields, String[] columnNamesToFilter) {
        String[] filters = new String[textFields.length];

        // Obtener los filtros de cada JTextField
        for (int i = 0; i < textFields.length; i++) {
            filters[i] = textFields[i].getText().toLowerCase();
        }

        // Filtrar la tabla
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        List<RowFilter<Object, Object>> rowFilters = new ArrayList<>();
        for (int i = 0; i < filters.length; i++) {
            final int index = i;
            rowFilters.add(RowFilter.regexFilter("(?i)" + filters[i], table.getColumnModel().getColumnIndex(columnNamesToFilter[i])));
        }
        sorter.setRowFilter(RowFilter.andFilter(rowFilters));
        table.setRowSorter(sorter);
    }

    public static DefaultTableModel filterTable(DefaultTableModel modelo, JTextField[] textFields, String[] columnNamesToFilter) {
        String[] filters = new String[textFields.length];

        // Obtener los filtros de cada JTextField
        for (int i = 0; i < textFields.length; i++) {
            filters[i] = textFields[i].getText().toLowerCase();
        }

        // Crear un nuevo modelo de tabla para aplicar el filtro
        DefaultTableModel filteredModel = new DefaultTableModel();

        // Agregar las columnas al modelo filtrado
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            filteredModel.addColumn(modelo.getColumnName(i));
        }

        // Aplicar filtro a cada fila del modelo original
        for (int i = 0; i < modelo.getRowCount(); i++) {
            boolean includeRow = true;
            for (int j = 0; j < filters.length; j++) {
                String filter = filters[j];
                if (!filter.isEmpty()) {
                    String cellValue = modelo.getValueAt(i, modelo.findColumn(columnNamesToFilter[j])).toString().toLowerCase();
                    if (!cellValue.contains(filter)) {
                        includeRow = false;
                        break;
                    }
                }
            }
            if (includeRow) {
                Object[] rowData = new Object[modelo.getColumnCount()];
                for (int k = 0; k < modelo.getColumnCount(); k++) {
                    rowData[k] = modelo.getValueAt(i, k);
                }
                filteredModel.addRow(rowData);
            }
        }

        return filteredModel;
    }

    public static DefaultTableModel filterTable(DefaultTableModel modelo, Object[] filters, String[] columnNamesToFilter) {
        // Crear un nuevo modelo de tabla para aplicar el filtro
        DefaultTableModel filteredModel = new DefaultTableModel();
        // Agregar las columnas al modelo filtrado
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            filteredModel.addColumn(modelo.getColumnName(i));
        }

        // Aplicar filtro a cada fila del modelo original
        for (int i = 0; i < modelo.getRowCount(); i++) {
            boolean includeRow = true;
            for (int j = 0; j < filters.length; j++) {
                Object filter = filters[j];
                if (filter != null) {
                    String filterString = filter.toString().toLowerCase();
                    String cellValue = modelo.getValueAt(i, modelo.findColumn(columnNamesToFilter[j])).toString().toLowerCase();
                    if (!cellValue.contains(filterString)) {
                        includeRow = false;
                        break;
                    }
                }
            }
            if (includeRow) {
                Object[] rowData = new Object[modelo.getColumnCount()];
                for (int k = 0; k < modelo.getColumnCount(); k++) {
                    rowData[k] = modelo.getValueAt(i, k);
                }
                filteredModel.addRow(rowData);
            }
        }

        return filteredModel;
    }

}
