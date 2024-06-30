package Test;
import javax.swing.table.DefaultTableModel;

public class UtilidadesTabla {

    public static void cambiarDato(DefaultTableModel modelo, String columnaID, Object idBuscar, String columnaDatoReemplazar, Object datoReemplazar) {
        int columnaIDIndex = modelo.findColumn(columnaID);
        int columnaDatoIndex = modelo.findColumn(columnaDatoReemplazar);

        if (columnaIDIndex == -1 || columnaDatoIndex == -1) {
            System.out.println("No se encontró la columna especificada en el modelo.");
            return;
        }

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            Object id = modelo.getValueAt(fila, columnaIDIndex);
            if (id != null && id.equals(idBuscar)) {
                modelo.setValueAt(datoReemplazar, fila, columnaDatoIndex);
                break; // Se encontró el ID, salir del bucle
            }
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addRow(new Object[]{1, "Juan"});
        modelo.addRow(new Object[]{2, "María"});

        System.out.println("Tabla original:");
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            for (int columna = 0; columna < modelo.getColumnCount(); columna++) {
                System.out.print(modelo.getValueAt(fila, columna) + "\t");
            }
            System.out.println();
        }

        // Cambiar nombre a "Pedro" con ID 1
        cambiarDato(modelo, "ID", 1, "Nombre", "Pedro");

        System.out.println("\nTabla modificada:");
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            for (int columna = 0; columna < modelo.getColumnCount(); columna++) {
                System.out.print(modelo.getValueAt(fila, columna) + "\t");
            }
            System.out.println();
        }
    }
}
