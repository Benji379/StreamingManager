package com.sm.frm;

import com.sm.utils.Action;
import com.sm.utils.UIController;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;

public class Anuncio extends javax.swing.JPanel {

    public Anuncio(String urlImagen, String urlAcceder) {
        initComponents();
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(urlImagen)));
        imagen.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                UIController.acomodarImagenLabel(imagen);
            }
        });
        imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Action.AccederEnlace(urlAcceder);
            }
        });
    }
    public Anuncio(Icon urlImagen, String urlAcceder) {
        initComponents();
        imagen.setIcon(urlImagen);
        imagen.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                UIController.acomodarImagenLabel(imagen);
            }
        });
        imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Action.AccederEnlace(urlAcceder);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen = new javax.swing.JLabel();

        setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);

        imagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    // End of variables declaration//GEN-END:variables
}
