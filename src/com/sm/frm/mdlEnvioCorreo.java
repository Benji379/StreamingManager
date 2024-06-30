package com.sm.frm;

import com.sm.controladores.CCorreo;

public class mdlEnvioCorreo extends javax.swing.JPanel {

    CCorreo controlador;

    public mdlEnvioCorreo() {
        initComponents();
        controlador = new CCorreo(this);
        controlador.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTittle = new javax.swing.JLabel();
        panelTransparent1 = new com.sm.componet.PanelTransparent();
        pDestinatario = new com.sm.componet.PanelCustom();
        txtDestinatario = new javax.swing.JTextField();
        jlbDestinatario = new javax.swing.JLabel();
        panelTransparent2 = new com.sm.componet.PanelTransparent();
        jlbAsunto = new javax.swing.JLabel();
        pAsunto = new com.sm.componet.PanelCustom();
        txtAsunto = new javax.swing.JTextField();
        panelTransparent3 = new com.sm.componet.PanelTransparent();
        pContenido = new com.sm.componet.PanelCustom();
        jScrollPane1 = new com.benjiBK.scroll.ScrollPaneWin11();
        txtContenido = new javax.swing.JTextArea();
        jlbContenido = new javax.swing.JLabel();
        btnEnviar = new com.sm.componet.Button();
        btnArchivo = new com.sm.componet.Button();

        setBackground(new java.awt.Color(30, 30, 30));

        jlbTittle.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Nuevo Correo");

        pDestinatario.setBackground(new java.awt.Color(35, 35, 35));
        pDestinatario.setShadowColor(new java.awt.Color(0, 0, 0));

        txtDestinatario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDestinatario.setForeground(new java.awt.Color(255, 255, 255));
        txtDestinatario.setBorder(null);
        txtDestinatario.setSelectionColor(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout pDestinatarioLayout = new javax.swing.GroupLayout(pDestinatario);
        pDestinatario.setLayout(pDestinatarioLayout);
        pDestinatarioLayout.setHorizontalGroup(
            pDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDestinatarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        pDestinatarioLayout.setVerticalGroup(
            pDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDestinatarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jlbDestinatario.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbDestinatario.setForeground(new java.awt.Color(255, 255, 255));
        jlbDestinatario.setText("Destinatario:");

        javax.swing.GroupLayout panelTransparent1Layout = new javax.swing.GroupLayout(panelTransparent1);
        panelTransparent1.setLayout(panelTransparent1Layout);
        panelTransparent1Layout.setHorizontalGroup(
            panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        panelTransparent1Layout.setVerticalGroup(
            panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbDestinatario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbAsunto.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbAsunto.setForeground(new java.awt.Color(255, 255, 255));
        jlbAsunto.setText("Asunto");

        pAsunto.setBackground(new java.awt.Color(35, 35, 35));
        pAsunto.setShadowColor(new java.awt.Color(0, 0, 0));

        txtAsunto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(255, 255, 255));
        txtAsunto.setBorder(null);
        txtAsunto.setSelectionColor(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout pAsuntoLayout = new javax.swing.GroupLayout(pAsunto);
        pAsunto.setLayout(pAsuntoLayout);
        pAsuntoLayout.setHorizontalGroup(
            pAsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAsuntoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        pAsuntoLayout.setVerticalGroup(
            pAsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAsuntoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panelTransparent2Layout = new javax.swing.GroupLayout(panelTransparent2);
        panelTransparent2.setLayout(panelTransparent2Layout);
        panelTransparent2Layout.setHorizontalGroup(
            panelTransparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelTransparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        panelTransparent2Layout.setVerticalGroup(
            panelTransparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbAsunto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pContenido.setBackground(new java.awt.Color(35, 35, 35));
        pContenido.setShadowColor(new java.awt.Color(0, 0, 0));

        txtContenido.setColumns(20);
        txtContenido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtContenido.setForeground(new java.awt.Color(255, 255, 255));
        txtContenido.setLineWrap(true);
        txtContenido.setRows(5);
        txtContenido.setBorder(null);
        txtContenido.setSelectionColor(new java.awt.Color(20, 20, 20));
        jScrollPane1.setViewportView(txtContenido);

        javax.swing.GroupLayout pContenidoLayout = new javax.swing.GroupLayout(pContenido);
        pContenido.setLayout(pContenidoLayout);
        pContenidoLayout.setHorizontalGroup(
            pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenidoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        pContenidoLayout.setVerticalGroup(
            pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );

        jlbContenido.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbContenido.setForeground(new java.awt.Color(255, 255, 255));
        jlbContenido.setText("Contenido");

        javax.swing.GroupLayout panelTransparent3Layout = new javax.swing.GroupLayout(panelTransparent3);
        panelTransparent3.setLayout(panelTransparent3Layout);
        panelTransparent3Layout.setHorizontalGroup(
            panelTransparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelTransparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelTransparent3Layout.setVerticalGroup(
            panelTransparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparent3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlbContenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setText("Enviar");
        btnEnviar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEnviar.setRippleColor(new java.awt.Color(30, 30, 30));
        btnEnviar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnArchivo.setForeground(new java.awt.Color(0, 0, 0));
        btnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sm/img/archivo.png"))); // NOI18N
        btnArchivo.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArchivo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnArchivo.setRippleColor(new java.awt.Color(30, 30, 30));
        btnArchivo.setShadowColor(new java.awt.Color(0, 0, 0));
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelTransparent1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelTransparent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelTransparent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlbTittle)
                .addGap(10, 10, 10)
                .addComponent(panelTransparent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTransparent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTransparent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        controlador.btnEnviarCorreo();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        controlador.btnCargarArchivo();
    }//GEN-LAST:event_btnArchivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnArchivo;
    public com.sm.componet.Button btnEnviar;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlbAsunto;
    public javax.swing.JLabel jlbContenido;
    public javax.swing.JLabel jlbDestinatario;
    public javax.swing.JLabel jlbTittle;
    public com.sm.componet.PanelCustom pAsunto;
    public com.sm.componet.PanelCustom pContenido;
    public com.sm.componet.PanelCustom pDestinatario;
    public com.sm.componet.PanelTransparent panelTransparent1;
    public com.sm.componet.PanelTransparent panelTransparent2;
    public com.sm.componet.PanelTransparent panelTransparent3;
    public javax.swing.JTextField txtAsunto;
    public javax.swing.JTextArea txtContenido;
    public javax.swing.JTextField txtDestinatario;
    // End of variables declaration//GEN-END:variables
}
