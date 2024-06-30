package com.sm.frm;

import com.sm.controladores.CInicio;
import static com.sm.modelo.SystemConfig.*;

public class mdlInicio extends javax.swing.JPanel {

    CInicio controlador;

    public mdlInicio() {
        initComponents();
        controlador = new CInicio(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardContadorUsuarios = new com.javaswingdev.Card();
        cardContadorHits = new com.javaswingdev.Card();
        cardBins = new com.javaswingdev.Card();
        pTabla = new com.javaswingdev.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new com.javaswingdev.Table();
        slideCarrusel = new com.sm.componet.Slideshow();

        setBackground(new java.awt.Color(30, 30, 30));
        setOpaque(false);

        cardContadorUsuarios.setBackground(new java.awt.Color(35, 35, 35));
        cardContadorUsuarios.setColor1(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        cardContadorUsuarios.setColor2(com.sm.modelo.SystemConfig.MAIN_COLOR_3);
        cardContadorUsuarios.setDescription("Cuentas");
        cardContadorUsuarios.setIcon(javaswingdev.GoogleMaterialDesignIcon.PERSON);
        cardContadorUsuarios.setValues("0");

        cardContadorHits.setBackground(new java.awt.Color(35, 35, 35));
        cardContadorHits.setColor1(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        cardContadorHits.setColor2(com.sm.modelo.SystemConfig.MAIN_COLOR_3);
        cardContadorHits.setDescription("Hits");
        cardContadorHits.setIcon(javaswingdev.GoogleMaterialDesignIcon.DNS);
        cardContadorHits.setValues("0");

        cardBins.setBackground(new java.awt.Color(35, 35, 35));
        cardBins.setColor1(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        cardBins.setColor2(com.sm.modelo.SystemConfig.MAIN_COLOR_3);
        cardBins.setDescription("BIN's");
        cardBins.setIcon(javaswingdev.GoogleMaterialDesignIcon.CARD_GIFTCARD);
        cardBins.setValues("0");

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pTabla.setRound(10);

        table.setBackground(new java.awt.Color(20, 20, 20));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nombre", "Telefono", "Usuario", "Contraseña", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        slideCarrusel.setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cardContadorUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(cardContadorHits, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(cardBins, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(slideCarrusel, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardBins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardContadorHits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardContadorUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(slideCarrusel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.javaswingdev.Card cardBins;
    public com.javaswingdev.Card cardContadorHits;
    public com.javaswingdev.Card cardContadorUsuarios;
    public javax.swing.JScrollPane jScrollPane1;
    public com.javaswingdev.RoundPanel pTabla;
    public com.sm.componet.Slideshow slideCarrusel;
    public com.javaswingdev.Table table;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(cardContadorHits, cardBins, cardContadorUsuarios);
    }

}
