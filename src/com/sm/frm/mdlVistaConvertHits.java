package com.sm.frm;

import com.sm.controladores.CVistaConvertHits;
import static com.sm.modelo.SystemConfig.*;

public class mdlVistaConvertHits extends javax.swing.JPanel {

    CVistaConvertHits controlador;

    public mdlVistaConvertHits() {
        initComponents();
        controlador = new CVistaConvertHits(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new com.javaswingdev.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new com.javaswingdev.Table();
        pTextArea = new com.javaswingdev.RoundPanel();
        jScrollPane2 = new com.benjiBK.scroll.ScrollPaneWin11();
        txtAreaHits = new javax.swing.JTextArea();
        pInput = new com.sm.componet.Panel();
        pFiltros = new com.sm.componet.Panel();
        pIncluye = new com.sm.componet.Panel();
        txtIncluye = new com.sm.componet.TextFieldSuggestion();
        jlbIncluye = new javax.swing.JLabel();
        pRut = new com.sm.componet.Panel();
        txtRut = new com.sm.componet.TextFieldSuggestion();
        jlbRut = new javax.swing.JLabel();
        btnBuscar = new com.sm.componet.Button();
        pActions = new com.sm.componet.PanelRound();
        btnMostrar = new com.sm.componet.Button();
        btnGuardar = new com.sm.componet.Button();
        Exportar = new com.sm.componet.Button();

        setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setRound(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Data", "Type", "Config", "Wordlist", "RUT", "PASS", "Incluye", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        jScrollPane1.setViewportView(tabla);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        pTextArea.setBackground(new java.awt.Color(255, 255, 255));
        pTextArea.setRound(10);

        txtAreaHits.setColumns(20);
        txtAreaHits.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtAreaHits.setRows(5);
        jScrollPane2.setViewportView(txtAreaHits);

        javax.swing.GroupLayout pTextAreaLayout = new javax.swing.GroupLayout(pTextArea);
        pTextArea.setLayout(pTextAreaLayout);
        pTextAreaLayout.setHorizontalGroup(
            pTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTextAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pTextAreaLayout.setVerticalGroup(
            pTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTextAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pInput.setBackground(new java.awt.Color(35, 35, 35));
        pInput.setRoundBottomLeft(10);
        pInput.setRoundBottomRight(10);
        pInput.setRoundTopLeft(10);
        pInput.setRoundTopRight(10);

        pFiltros.setBackground(new java.awt.Color(35, 35, 35));

        pIncluye.setBackground(new java.awt.Color(35, 35, 35));
        pIncluye.setRoundBottomLeft(10);
        pIncluye.setRoundBottomRight(10);
        pIncluye.setRoundTopLeft(10);
        pIncluye.setRoundTopRight(10);

        txtIncluye.setForeground(new java.awt.Color(255, 255, 255));
        txtIncluye.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jlbIncluye.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbIncluye.setForeground(new java.awt.Color(255, 255, 255));
        jlbIncluye.setText("Incluye");

        javax.swing.GroupLayout pIncluyeLayout = new javax.swing.GroupLayout(pIncluye);
        pIncluye.setLayout(pIncluyeLayout);
        pIncluyeLayout.setHorizontalGroup(
            pIncluyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIncluyeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pIncluyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbIncluye))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pIncluyeLayout.setVerticalGroup(
            pIncluyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIncluyeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbIncluye)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pRut.setBackground(new java.awt.Color(35, 35, 35));
        pRut.setRoundBottomLeft(10);
        pRut.setRoundBottomRight(10);
        pRut.setRoundTopLeft(10);
        pRut.setRoundTopRight(10);

        txtRut.setForeground(new java.awt.Color(255, 255, 255));
        txtRut.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jlbRut.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbRut.setForeground(new java.awt.Color(255, 255, 255));
        jlbRut.setText("RUT");

        javax.swing.GroupLayout pRutLayout = new javax.swing.GroupLayout(pRut);
        pRut.setLayout(pRutLayout);
        pRutLayout.setHorizontalGroup(
            pRutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pRutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbRut))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pRutLayout.setVerticalGroup(
            pRutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbRut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Filtrar");
        btnBuscar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnBuscar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFiltrosLayout = new javax.swing.GroupLayout(pFiltros);
        pFiltros.setLayout(pFiltrosLayout);
        pFiltrosLayout.setHorizontalGroup(
            pFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFiltrosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pFiltrosLayout.setVerticalGroup(
            pFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFiltrosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFiltrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pActions.setBackground(new java.awt.Color(35, 35, 35));

        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setText("Mostrar");
        btnMostrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnMostrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnGuardar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        Exportar.setForeground(new java.awt.Color(0, 0, 0));
        Exportar.setText("Exportar");
        Exportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exportar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Exportar.setShadowColor(new java.awt.Color(0, 0, 0));
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pActionsLayout = new javax.swing.GroupLayout(pActions);
        pActions.setLayout(pActionsLayout);
        pActionsLayout.setHorizontalGroup(
            pActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pActionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pActionsLayout.setVerticalGroup(
            pActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pActionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(pActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(pActions, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTextArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        controlador.mostrarHits();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        controlador.btnFiltrar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        controlador.btnExportarExcel();
    }//GEN-LAST:event_ExportarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        controlador.btnGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button Exportar;
    public com.sm.componet.Button btnBuscar;
    public com.sm.componet.Button btnGuardar;
    public com.sm.componet.Button btnMostrar;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jlbIncluye;
    public javax.swing.JLabel jlbRut;
    public com.sm.componet.PanelRound pActions;
    public com.sm.componet.Panel pFiltros;
    public com.sm.componet.Panel pIncluye;
    public com.sm.componet.Panel pInput;
    public com.sm.componet.Panel pRut;
    public com.javaswingdev.RoundPanel pTabla;
    public com.javaswingdev.RoundPanel pTextArea;
    public com.javaswingdev.Table tabla;
    public javax.swing.JTextArea txtAreaHits;
    public com.sm.componet.TextFieldSuggestion txtIncluye;
    public com.sm.componet.TextFieldSuggestion txtRut;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pActions, pFiltros, pIncluye, pInput, pRut);
        TEXT1(jlbIncluye, jlbRut);
        TEXT1(txtIncluye, txtRut);
        TEXT2(txtAreaHits);
        BOTON1(btnBuscar, btnGuardar, btnMostrar, Exportar);
        TEXT2(btnBuscar, btnGuardar, btnMostrar, Exportar);
        txtAreaHits.setSelectionColor(SELECT1);
    }

}
