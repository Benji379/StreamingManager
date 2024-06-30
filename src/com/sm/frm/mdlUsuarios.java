package com.sm.frm;

import com.sm.controladores.CUsuarios;
import static com.sm.modelo.SystemConfig.*;
import com.sm.utils.UIController;

public class mdlUsuarios extends javax.swing.JPanel {

    CUsuarios controlador;

    public mdlUsuarios() {
        initComponents();
        controlador = new CUsuarios(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new com.javaswingdev.RoundPanel();
        scrollTabla = new com.benjiBK.scroll.ScrollPaneWin11();
        tabla = new com.javaswingdev.Table();
        pInput = new com.sm.componet.PanelCustom();
        pNombre = new com.sm.componet.PanelTransparent();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new com.sm.componet.TextFieldSuggestion();
        pPassword = new com.sm.componet.PanelTransparent();
        jlbPassword = new javax.swing.JLabel();
        txtPassword = new com.sm.componet.TextFieldSuggestion();
        pCorreo = new com.sm.componet.PanelTransparent();
        jlbCorreo = new javax.swing.JLabel();
        txtCorreo = new com.sm.componet.TextFieldSuggestion();
        pWhatsApp = new com.sm.componet.PanelTransparent();
        jlbWhatsApp = new javax.swing.JLabel();
        txtWhatsApp = new com.sm.componet.TextFieldSuggestion();
        pRango = new com.sm.componet.PanelTransparent();
        jlbRango = new javax.swing.JLabel();
        comboRango = new com.sm.componet.ComboBoxSuggestion();
        pCredito = new com.sm.componet.PanelTransparent();
        jlbCredito = new javax.swing.JLabel();
        txtCredito = new com.sm.componet.TextFieldSuggestion();
        pEstado = new com.sm.componet.PanelTransparent();
        jlbEstado = new javax.swing.JLabel();
        comboEstado = new com.sm.componet.ComboBoxSuggestion();
        scrollBotones = new com.benjiBK.scroll.ScrollPaneWin11();
        pBotones = new javax.swing.JPanel();
        btnRegistrar = new com.sm.componet.Button();
        btnFiltrar = new com.sm.componet.Button();
        btnLimpiar = new com.sm.componet.Button();
        btnEditar = new com.sm.componet.Button();
        btnBorrar = new com.sm.componet.Button();
        btnDescargar = new com.sm.componet.Button();

        setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setRound(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Nombre", "Correo", "WhatsApp", "Rango", "Credito", "Estado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scrollTabla.setViewportView(tabla);

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabla)
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        pInput.setBackground(new java.awt.Color(35, 35, 35));
        pInput.setShadowColor(new java.awt.Color(0, 0, 0));

        jlbNombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setText("Nombre");

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pNombreLayout = new javax.swing.GroupLayout(pNombre);
        pNombre.setLayout(pNombreLayout);
        pNombreLayout.setHorizontalGroup(
            pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombreLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        pNombreLayout.setVerticalGroup(
            pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNombreLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jlbPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlbPassword.setText("Password");

        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pPasswordLayout = new javax.swing.GroupLayout(pPassword);
        pPassword.setLayout(pPasswordLayout);
        pPasswordLayout.setHorizontalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        pPasswordLayout.setVerticalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPasswordLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jlbCorreo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCorreo.setText("Correo");

        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pCorreoLayout = new javax.swing.GroupLayout(pCorreo);
        pCorreo.setLayout(pCorreoLayout);
        pCorreoLayout.setHorizontalGroup(
            pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCorreoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        pCorreoLayout.setVerticalGroup(
            pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCorreoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jlbWhatsApp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbWhatsApp.setForeground(new java.awt.Color(255, 255, 255));
        jlbWhatsApp.setText("WhatsApp");

        txtWhatsApp.setForeground(new java.awt.Color(255, 255, 255));
        txtWhatsApp.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pWhatsAppLayout = new javax.swing.GroupLayout(pWhatsApp);
        pWhatsApp.setLayout(pWhatsAppLayout);
        pWhatsAppLayout.setHorizontalGroup(
            pWhatsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pWhatsAppLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pWhatsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWhatsApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbWhatsApp, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        pWhatsAppLayout.setVerticalGroup(
            pWhatsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pWhatsAppLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbWhatsApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jlbRango.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbRango.setForeground(new java.awt.Color(255, 255, 255));
        jlbRango.setText("Rango");

        comboRango.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRangoLayout = new javax.swing.GroupLayout(pRango);
        pRango.setLayout(pRangoLayout);
        pRangoLayout.setHorizontalGroup(
            pRangoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRangoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbRango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRangoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(comboRango, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pRangoLayout.setVerticalGroup(
            pRangoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRangoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbRango)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboRango, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jlbCredito.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbCredito.setForeground(new java.awt.Color(255, 255, 255));
        jlbCredito.setText("Credito");

        txtCredito.setForeground(new java.awt.Color(255, 255, 255));
        txtCredito.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pCreditoLayout = new javax.swing.GroupLayout(pCredito);
        pCredito.setLayout(pCreditoLayout);
        pCreditoLayout.setHorizontalGroup(
            pCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreditoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        pCreditoLayout.setVerticalGroup(
            pCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCreditoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Suspendido" }));
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
                    .addGroup(pEstadoLayout.createSequentialGroup()
                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pEstadoLayout.createSequentialGroup()
                        .addComponent(jlbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        scrollBotones.setBorder(null);
        scrollBotones.setPreferredSize(new java.awt.Dimension(200, 100));

        pBotones.setBackground(new java.awt.Color(35, 35, 35));

        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnFiltrar.setForeground(new java.awt.Color(0, 0, 0));
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFiltrar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnFiltrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
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

        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnEditar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBorrar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnBorrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
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

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        scrollBotones.setViewportView(pBotones);

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addComponent(pCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pWhatsApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(pRango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        controlador.filtrar();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.btnLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        controlador.editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        controlador.eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        controlador.descargar();
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void comboRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRangoActionPerformed

    }//GEN-LAST:event_comboRangoActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void txtCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyTyped
        UIController.limitacionNumeros(txtCredito, evt, 4);
    }//GEN-LAST:event_txtCreditoKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnBorrar;
    public com.sm.componet.Button btnDescargar;
    public com.sm.componet.Button btnEditar;
    public com.sm.componet.Button btnFiltrar;
    public com.sm.componet.Button btnLimpiar;
    public com.sm.componet.Button btnRegistrar;
    public com.sm.componet.ComboBoxSuggestion comboEstado;
    public com.sm.componet.ComboBoxSuggestion comboRango;
    public javax.swing.JLabel jlbCorreo;
    public javax.swing.JLabel jlbCredito;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbNombre;
    public javax.swing.JLabel jlbPassword;
    public javax.swing.JLabel jlbRango;
    public javax.swing.JLabel jlbWhatsApp;
    public javax.swing.JPanel pBotones;
    public com.sm.componet.PanelTransparent pCorreo;
    public com.sm.componet.PanelTransparent pCredito;
    public com.sm.componet.PanelTransparent pEstado;
    public com.sm.componet.PanelCustom pInput;
    public com.sm.componet.PanelTransparent pNombre;
    public com.sm.componet.PanelTransparent pPassword;
    public com.sm.componet.PanelTransparent pRango;
    public com.javaswingdev.RoundPanel pTabla;
    public com.sm.componet.PanelTransparent pWhatsApp;
    public javax.swing.JScrollPane scrollBotones;
    public javax.swing.JScrollPane scrollTabla;
    public com.javaswingdev.Table tabla;
    public com.sm.componet.TextFieldSuggestion txtCorreo;
    public com.sm.componet.TextFieldSuggestion txtCredito;
    public com.sm.componet.TextFieldSuggestion txtNombre;
    public com.sm.componet.TextFieldSuggestion txtPassword;
    public com.sm.componet.TextFieldSuggestion txtWhatsApp;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pInput, pBotones);
        BOTON1(btnBorrar, btnDescargar, btnEditar, btnFiltrar, btnLimpiar, btnRegistrar);
        TEXT2(btnBorrar, btnDescargar, btnEditar, btnFiltrar, btnLimpiar, btnRegistrar);
        TEXT1(jlbCorreo, jlbCredito, jlbEstado, jlbNombre, jlbPassword, jlbRango, jlbWhatsApp);
        TEXT1(txtCorreo, txtCredito, txtNombre, txtPassword, txtWhatsApp);
    }

}
