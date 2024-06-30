package com.sm.componet;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.EmptyBorder;

public class ListBenji<T> extends JList<T> {

    public static final int BLACK_FONT = 0;
    public static final int WHITE = 1;

    private int alturaItem = 35;
    private int espacioItem = 3;
    private int espacioIzquierdo = 9;
    private Color fondoColor = new Color(255, 255, 255);
    private Color fondoResaltado = new Color(0, 255, 0);
    private Color letraResaltada = new Color(255, 255, 255);
    private Color letraNormal = new Color(0, 0, 0);

    //JListCustom.customizeJList(h.listaTablasHits, 35, 3, 9, new Color(255, 255, 255), com.sm.modelo.SystemConfig.MAIN_COLOR_1, 0);
    public ListBenji() {
        super();
        customizeJList();
    }

    private void customizeJList() {
        
        // Crear un borde vacío
        Border emptyBorder = BorderFactory.createEmptyBorder();

        // Establecer el fondo blanco
        setBackground(fondoColor);

        // Establecer la fuente y el color de las letras
        Font font = new Font("Century Gothic", Font.PLAIN, 18);
        setFont(font);

        setForeground(new Color(255, 255, 255));

        // Configurar el cambio de cursor a mano cuando se selecciona un elemento
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                if (index >= 0 && getCellBounds(index, index).contains(e.getPoint())) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                } else {
                    setCursor(Cursor.getDefaultCursor());
                }
            }
        });

        // Establecer el renderizador personalizado para cambiar el color de fondo cuando se selecciona un elemento
        setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index,
                        isSelected, cellHasFocus);

                renderer.setBackground(isSelected ? getFondoResaltado() : getFondoColor());
                renderer.setForeground(isSelected ? getLetraResaltada() : getLetraNormal());
                renderer.setBorder(emptyBorder);

                // Establecer el espacio izquierdo del texto
                Border textBorder = BorderFactory.createEmptyBorder(0, getEspacioIzquierdo(), 0, 0);
                renderer.setBorder(BorderFactory.createCompoundBorder(renderer.getBorder(), textBorder));

                Dimension preferredSize = renderer.getPreferredSize();
                preferredSize.height = getAlturaItem();
                preferredSize.width += getEspacioItem();
                renderer.setPreferredSize(preferredSize);

                return renderer;
            }
        });
    }

    public int getAlturaItem() {
        return alturaItem;
    }

    public void setAlturaItem(int alturaItem) {
        this.alturaItem = alturaItem;
    }

    public int getEspacioItem() {
        return espacioItem;
    }

    public void setEspacioItem(int espacioItem) {
        this.espacioItem = espacioItem;
    }

    public int getEspacioIzquierdo() {
        return espacioIzquierdo;
    }

    public void setEspacioIzquierdo(int espacioIzquierdo) {
        this.espacioIzquierdo = espacioIzquierdo;
    }

    public Color getFondoColor() {
        return fondoColor;
    }

    public void setFondoColor(Color fondoColor) {
        this.fondoColor = fondoColor;
    }

    public Color getFondoResaltado() {
        return fondoResaltado;
    }

    public void setFondoResaltado(Color fondoResaltado) {
        this.fondoResaltado = fondoResaltado;
    }

    public Color getLetraResaltada() {
        return letraResaltada;
    }

    public void setLetraResaltada(Color letraResaltada) {
        this.letraResaltada = letraResaltada;
    }

    public Color getLetraNormal() {
        return letraNormal;
    }

    public void setLetraNormal(Color letraNormal) {
        this.letraNormal = letraNormal;
    }

}
