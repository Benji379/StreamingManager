package Test;

import javax.swing.table.DefaultTableModel;

public class pruebaa {

    public static DefaultTableModel mergeModels(DefaultTableModel model1, DefaultTableModel model2) {
        // Crear un nuevo DefaultTableModel con las columnas de los modelos originales
        DefaultTableModel mergedModel = new DefaultTableModel();
        for (int i = 0; i < model1.getColumnCount(); i++) {
            mergedModel.addColumn(model1.getColumnName(i));
        }

        // Verificar que ambos modelos tengan la misma cantidad de filas
        int numRows = Math.min(model1.getRowCount(), model2.getRowCount());

        // Combinar datos de las columnas de los modelos originales
        for (int row = 0; row < numRows; row++) {
            Object[] rowData = new Object[model1.getColumnCount()];
            for (int col = 0; col < model1.getColumnCount(); col++) {
                if (col < 3) {
                    // Copiar datos de las primeras 3 columnas del primer modelo
                    rowData[col] = model1.getValueAt(row, col);
                } else {
                    // Copiar datos de la cuarta columna del segundo modelo
                    rowData[col] = model2.getValueAt(row, 3);
                }
            }
            mergedModel.addRow(rowData);
        }

        return mergedModel;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        DefaultTableModel model1 = new DefaultTableModel();
        DefaultTableModel model2 = new DefaultTableModel();

        // Agregar columnas a los modelos
        model1.addColumn("Columna1");
        model1.addColumn("Columna2");
        model1.addColumn("Columna3");
        model1.addColumn("Columna4");

        model2.addColumn("Columna1");
        model2.addColumn("Columna2");
        model2.addColumn("Columna3");
        model2.addColumn("Columna4");

        // Agregar datos de ejemplo a los modelos
        model1.addRow(new Object[]{"Dato1", "Dato2", "Dato3", "Dato4"});
        model1.addRow(new Object[]{"Dato5", "Dato6", "Dato7", "Dato8"});

        model2.addRow(new Object[]{"Dato9", "Dato10", "Dato11", "Dato12"});
        model2.addRow(new Object[]{"Dato13", "Dato14", "Dato15", "Dato16"});

        // Llamar al método para combinar los modelos
        DefaultTableModel mergedModel = mergeModels(model1, model2);

        // Imprimir el nuevo modelo combinado
        for (int row = 0; row < mergedModel.getRowCount(); row++) {
            for (int col = 0; col < mergedModel.getColumnCount(); col++) {
                System.out.print(mergedModel.getValueAt(row, col) + "\t");
            }
            System.out.println();
        }
    }
}
