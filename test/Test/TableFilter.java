package Test;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.TableRowSorter;

public class TableFilter {
    
    public static void filterTable(JTable table, HashMap<String, JTextField> filterFields) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>((DefaultTableModel) table.getModel());
        table.setRowSorter(rowSorter);
        
        for (Map.Entry<String, JTextField> entry : filterFields.entrySet()) {
            JTextField filterField = entry.getValue();
            String columnName = entry.getKey();
            filterField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    updateFilter();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    updateFilter();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    updateFilter();
                }

                private void updateFilter() {
                    String text = filterField.getText();
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, table.getColumnModel().getColumnIndex(columnName)));
                }
            });
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Filter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                        {"John", "Doe", 30},
                        {"Jane", "Smith", 25},
                        {"Alice", "Johnson", 35},
                        {"Bob", "Brown", 40}
                },
                new Object[]{"First Name", "Last Name", "Age"}
        );
        
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        HashMap<String, JTextField> filterFields = new HashMap<>();
        JTextField firstNameFilter = new JTextField();
        JTextField lastNameFilter = new JTextField();
        
        filterFields.put("First Name", firstNameFilter);
        filterFields.put("Last Name", lastNameFilter);
        
        JPanel filterPanel = new JPanel(new FlowLayout());
        filterPanel.add(new JLabel("First Name:"));
        filterPanel.add(firstNameFilter);
        filterPanel.add(new JLabel("Last Name:"));
        filterPanel.add(lastNameFilter);
        
        frame.add(filterPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        TableFilter.filterTable(table, filterFields);
        
        frame.pack();
        frame.setVisible(true);
    }
}
