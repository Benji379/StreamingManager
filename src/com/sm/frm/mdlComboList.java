package com.sm.frm;

import com.sm.controladores.CComboList;
import static com.sm.modelo.SystemConfig.*;

public class mdlComboList extends javax.swing.JPanel {

    CComboList controlador;

    public mdlComboList() {
        initComponents();
        controlador = new CComboList(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new com.javaswingdev.RoundPanel();
        scroll = new com.benjiBK.scroll.ScrollPaneWin11();
        tabla = new com.javaswingdev.Table();
        panelInputs = new com.sm.componet.PanelRound();
        pNombre = new com.sm.componet.Panel();
        txtNombre = new com.sm.componet.TextFieldSuggestion();
        jlbNombre = new javax.swing.JLabel();
        pEstado = new com.sm.componet.Panel();
        jlbEstado = new javax.swing.JLabel();
        comboEstado = new com.sm.componet.ComboBoxSuggestion();
        pBotones = new com.sm.componet.PanelRound();
        btnCarpeta = new com.sm.componet.Button();
        btnImportar = new com.sm.componet.Button();
        btnActualizar = new com.sm.componet.Button();
        btnLimpiar = new com.sm.componet.Button();
        btnDescargar = new com.sm.componet.Button();
        btnEliminar = new com.sm.componet.Button();
        jlbTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setRound(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N", "Nombre", "Cantidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(com.sm.modelo.SystemConfig.SELECT1);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelInputs.setBackground(new java.awt.Color(30, 30, 30));

        pNombre.setBackground(new java.awt.Color(30, 30, 30));
        pNombre.setRoundBottomLeft(10);
        pNombre.setRoundBottomRight(10);
        pNombre.setRoundTopLeft(10);
        pNombre.setRoundTopRight(10);

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jlbNombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setText("Nombre");

        javax.swing.GroupLayout pNombreLayout = new javax.swing.GroupLayout(pNombre);
        pNombre.setLayout(pNombreLayout);
        pNombreLayout.setHorizontalGroup(
            pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombreLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pNombreLayout.setVerticalGroup(
            pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNombreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pEstado.setBackground(new java.awt.Color(30, 30, 30));
        pEstado.setRoundBottomLeft(10);
        pEstado.setRoundBottomRight(10);
        pEstado.setRoundTopLeft(10);
        pEstado.setRoundTopRight(10);

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usado", "Libre" }));
        comboEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoLayout = new javax.swing.GroupLayout(pEstado);
        pEstado.setLayout(pEstadoLayout);
        pEstadoLayout.setHorizontalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbEstado)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelInputsLayout = new javax.swing.GroupLayout(panelInputs);
        panelInputs.setLayout(panelInputsLayout);
        panelInputsLayout.setHorizontalGroup(
            panelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelInputsLayout.setVerticalGroup(
            panelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pBotones.setBackground(new java.awt.Color(30, 30, 30));

        btnCarpeta.setForeground(new java.awt.Color(0, 0, 0));
        btnCarpeta.setText("Carpeta");
        btnCarpeta.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarpeta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCarpeta.setRippleColor(new java.awt.Color(0, 0, 0));
        btnCarpeta.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarpetaActionPerformed(evt);
            }
        });

        btnImportar.setForeground(new java.awt.Color(0, 0, 0));
        btnImportar.setText("Importar");
        btnImportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnImportar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnImportar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("Actualizar");
        btnActualizar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActualizar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnActualizar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpiar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnLimpiar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnDescargar.setForeground(new java.awt.Color(0, 0, 0));
        btnDescargar.setText("Descargar");
        btnDescargar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescargar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDescargar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnDescargar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnEliminar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImportar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jlbTitulo.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("Mis ComboList");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addComponent(jlbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed

    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btnCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpetaActionPerformed
        controlador.btnCarpeta();
    }//GEN-LAST:event_btnCarpetaActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        controlador.btnImportar();
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        controlador.btnDescargar();
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.borrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        controlador.btnActualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnActualizar;
    public com.sm.componet.Button btnCarpeta;
    public com.sm.componet.Button btnDescargar;
    public com.sm.componet.Button btnEliminar;
    public com.sm.componet.Button btnImportar;
    public com.sm.componet.Button btnLimpiar;
    public com.sm.componet.ComboBoxSuggestion comboEstado;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbNombre;
    public javax.swing.JLabel jlbTitulo;
    public com.sm.componet.PanelRound pBotones;
    public com.sm.componet.Panel pEstado;
    public com.sm.componet.Panel pNombre;
    public com.javaswingdev.RoundPanel pTabla;
    public com.sm.componet.PanelRound panelInputs;
    public javax.swing.JScrollPane scroll;
    public com.javaswingdev.Table tabla;
    public com.sm.componet.TextFieldSuggestion txtNombre;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this, pBotones, pEstado, panelInputs, pNombre);
        BOTON1(btnActualizar, btnCarpeta, btnDescargar, btnEliminar, btnImportar, btnLimpiar);
        TEXT2(btnActualizar, btnCarpeta, btnDescargar, btnEliminar, btnImportar, btnLimpiar);
        TEXT1(jlbEstado, jlbNombre, jlbTitulo);
    }

}
