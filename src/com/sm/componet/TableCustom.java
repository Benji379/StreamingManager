package com.sm.componet;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCustom extends JTable {

    private final TableDarkHeader header;
    private final TableDarkCell cell;

    private Color colorBackGround1 = new Color(0, 1, 4, 243);
    private Color colorBackGround2 = new Color(0, 1, 4, 230);

    private Color colorSelected1 = new Color(110, 21, 17);
    private Color colorSelected2 = new Color(70, 21, 17);

    public TableCustom() {
        header = new TableDarkHeader();
        cell = new TableDarkCell();
        getTableHeader().setDefaultRenderer(header);
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, cell);
        setRowHeight(30);
        getTableHeader().setReorderingAllowed(false);
    }

    public void setColumnAlignment(int column, int align) {
        header.setAlignment(column, align);
    }

    public void setCellAlignment(int column, int align) {
        cell.setAlignment(column, align);
    }

    public void setColumnWidth(int column, int width) {
        getColumnModel().getColumn(column).setPreferredWidth(width);
        getColumnModel().getColumn(column).setMinWidth(width);
        getColumnModel().getColumn(column).setMaxWidth(width);
        getColumnModel().getColumn(column).setMinWidth(10);
        getColumnModel().getColumn(column).setMaxWidth(10000);
    }

    public Color getColorBackGround1() {
        return colorBackGround1;
    }

    public void setColorBackGround1(Color colorBackGround1) {
        this.colorBackGround1 = colorBackGround1;
    }

    public Color getColorBackGround2() {
        return colorBackGround2;
    }

    public void setColorBackGround2(Color colorBackGround2) {
        this.colorBackGround2 = colorBackGround2;
    }

    public Color getColorSelected1() {
        return colorSelected1;
    }

    public void setColorSelected1(Color colorSelected1) {
        this.colorSelected1 = colorSelected1;
    }

    public Color getColorSelected2() {
        return colorSelected2;
    }

    public void setColorSelected2(Color colorSelected2) {
        this.colorSelected2 = colorSelected2;
    }

    private class TableDarkHeader extends DefaultTableCellRenderer {

        private final Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            com.setBackground(getColorBackGround1());
            com.setForeground(new Color(200, 200, 200));
            com.setFont(com.getFont().deriveFont(Font.BOLD, 12));
            if (alignment.containsKey(i1)) {
                setHorizontalAlignment(alignment.get(i1));
            } else {
                setHorizontalAlignment(JLabel.CENTER);
                setFont(new java.awt.Font(com.getFont().getFontName(), 1, com.getFont().getSize() + 2));
//                setFont(new java.awt.Font("Century Gothic", 0, 14));
//                setFont(com.getFont().deriveFont(Font.BOLD, 14));
            }
            return com;
        }
    }

    private class TableDarkCell extends DefaultTableCellRenderer {

        private final Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
            if (isCellSelected(row, column)) {
                if (row % 2 == 0) {
                    com.setBackground(getColorSelected1());
                } else {
                    com.setBackground(getColorSelected2());
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(getColorBackGround2());
                } else {
                    com.setBackground(getColorBackGround1());
                }
            }

            com.setForeground(new Color(200, 200, 200));

            setBorder(new EmptyBorder(0, 5, 0, 5));
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }
}
