package com.sm.frm;

import com.sm.controladores.CCuentas;
import static com.sm.modelo.SystemConfig.*;

public class mdlCuentas extends javax.swing.JPanel {

    CCuentas controlador;

    public mdlCuentas() {
        initComponents();
        controlador = new CCuentas(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserInicio = new com.raven.datechooser.DateChooser();
        dateChooserFinal = new com.raven.datechooser.DateChooser();
        pTabla = new com.javaswingdev.RoundPanel();
        scroll = new javax.swing.JScrollPane();
        tabla = new com.javaswingdev.Table();
        pSuperior = new com.sm.componet.PanelRound();
        pInputs = new com.sm.componet.PanelRound();
        pUsuario = new com.sm.componet.Panel();
        txtUsuario = new com.sm.componet.TextFieldSuggestion();
        jlbUsuario = new javax.swing.JLabel();
        pPassword = new com.sm.componet.Panel();
        txtPassword = new com.sm.componet.TextFieldSuggestion();
        jlbPassword = new javax.swing.JLabel();
        pAplicacion = new com.sm.componet.Panel();
        txtAplicacion = new com.sm.componet.TextFieldSuggestion();
        jlbAplicacion = new javax.swing.JLabel();
        pEstado = new com.sm.componet.Panel();
        jlbEstado = new javax.swing.JLabel();
        comboEstado = new com.sm.componet.ComboBoxSuggestion();
        pInicio = new com.sm.componet.Panel();
        txtInicio = new com.sm.componet.TextFieldSuggestion();
        jlbInicio = new javax.swing.JLabel();
        pFinal = new com.sm.componet.Panel();
        txtFinal = new com.sm.componet.TextFieldSuggestion();
        jlbFinal = new javax.swing.JLabel();
        pBotones = new com.sm.componet.PanelRound();
        btnLimpiar = new com.sm.componet.Button();
        btnEditar = new com.sm.componet.Button();
        btnAgregar = new com.sm.componet.Button();
        btnEliminar = new com.sm.componet.Button();
        btnFiltrar = new com.sm.componet.Button();
        btnDescargar = new com.sm.componet.Button();
        pConteo = new com.sm.componet.PanelRound();
        jScrollPane1 = new com.benjiBK.scroll.ScrollPaneWin11();
        tablaConteo = new com.sm.componet.TableCustom();

        dateChooserInicio.setTextRefernce(txtInicio);

        dateChooserFinal.setTextRefernce(txtFinal);

        setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setRound(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Password", "Aplicacion", "Estado", "Inicio", "Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(130);
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
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        pSuperior.setBackground(new java.awt.Color(35, 35, 35));
        pSuperior.setRoundBottomLeft(10);
        pSuperior.setRoundBottomRight(10);
        pSuperior.setRoundTopLeft(10);
        pSuperior.setRoundTopRight(10);

        pInputs.setBackground(new java.awt.Color(35, 35, 35));
        pInputs.setRoundBottomLeft(10);
        pInputs.setRoundBottomRight(10);
        pInputs.setRoundTopLeft(10);
        pInputs.setRoundTopRight(10);

        pUsuario.setBackground(new java.awt.Color(35, 35, 35));
        pUsuario.setRoundBottomLeft(10);
        pUsuario.setRoundBottomRight(10);
        pUsuario.setRoundTopLeft(10);
        pUsuario.setRoundTopRight(10);

        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlbUsuario.setText("Usuario");

        javax.swing.GroupLayout pUsuarioLayout = new javax.swing.GroupLayout(pUsuario);
        pUsuario.setLayout(pUsuarioLayout);
        pUsuarioLayout.setHorizontalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsuario))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pUsuarioLayout.setVerticalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pPassword.setBackground(new java.awt.Color(35, 35, 35));
        pPassword.setRoundBottomLeft(10);
        pPassword.setRoundBottomRight(10);
        pPassword.setRoundTopLeft(10);
        pPassword.setRoundTopRight(10);

        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlbPassword.setText("Password");

        javax.swing.GroupLayout pPasswordLayout = new javax.swing.GroupLayout(pPassword);
        pPassword.setLayout(pPasswordLayout);
        pPasswordLayout.setHorizontalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPassword))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pPasswordLayout.setVerticalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pAplicacion.setBackground(new java.awt.Color(35, 35, 35));
        pAplicacion.setRoundBottomLeft(10);
        pAplicacion.setRoundBottomRight(10);
        pAplicacion.setRoundTopLeft(10);
        pAplicacion.setRoundTopRight(10);

        txtAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        txtAplicacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jlbAplicacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jlbAplicacion.setText("Aplicacion");

        javax.swing.GroupLayout pAplicacionLayout = new javax.swing.GroupLayout(pAplicacion);
        pAplicacion.setLayout(pAplicacionLayout);
        pAplicacionLayout.setHorizontalGroup(
            pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAplicacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAplicacion))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pAplicacionLayout.setVerticalGroup(
            pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAplicacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbAplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pEstado.setBackground(new java.awt.Color(35, 35, 35));
        pEstado.setRoundBottomLeft(10);
        pEstado.setRoundBottomRight(10);
        pEstado.setRoundTopLeft(10);
        pEstado.setRoundTopRight(10);

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "Inactivo" }));
        comboEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pEstadoLayout = new javax.swing.GroupLayout(pEstado);
        pEstado.setLayout(pEstadoLayout);
        pEstadoLayout.setHorizontalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEstado))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pInicio.setBackground(new java.awt.Color(35, 35, 35));
        pInicio.setRoundBottomLeft(10);
        pInicio.setRoundBottomRight(10);
        pInicio.setRoundTopLeft(10);
        pInicio.setRoundTopRight(10);

        txtInicio.setForeground(new java.awt.Color(255, 255, 255));
        txtInicio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jlbInicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbInicio.setForeground(new java.awt.Color(255, 255, 255));
        jlbInicio.setText("Inicio");

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbInicio))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pFinal.setBackground(new java.awt.Color(35, 35, 35));
        pFinal.setRoundBottomLeft(10);
        pFinal.setRoundBottomRight(10);
        pFinal.setRoundTopLeft(10);
        pFinal.setRoundTopRight(10);

        txtFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtFinal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jlbFinal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbFinal.setForeground(new java.awt.Color(255, 255, 255));
        jlbFinal.setText("Final");

        javax.swing.GroupLayout pFinalLayout = new javax.swing.GroupLayout(pFinal);
        pFinal.setLayout(pFinalLayout);
        pFinalLayout.setHorizontalGroup(
            pFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFinalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbFinal))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pFinalLayout.setVerticalGroup(
            pFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFinalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pInputsLayout = new javax.swing.GroupLayout(pInputs);
        pInputs.setLayout(pInputsLayout);
        pInputsLayout.setHorizontalGroup(
            pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputsLayout.createSequentialGroup()
                        .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputsLayout.createSequentialGroup()
                        .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInputsLayout.setVerticalGroup(
            pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pBotones.setBackground(new java.awt.Color(35, 35, 35));
        pBotones.setRoundBottomLeft(10);
        pBotones.setRoundBottomRight(10);
        pBotones.setRoundTopLeft(10);
        pBotones.setRoundTopRight(10);

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

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnAgregar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        btnDescargar.setForeground(new java.awt.Color(0, 0, 0));
        btnDescargar.setText("Descargar");
        btnDescargar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescargar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnDescargar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnDescargar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        pConteo.setBackground(new java.awt.Color(40, 40, 40));
        pConteo.setRoundBottomLeft(10);
        pConteo.setRoundBottomRight(10);
        pConteo.setRoundTopLeft(10);
        pConteo.setRoundTopRight(10);

        tablaConteo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "Benjamin"},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Aplicacion", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaConteo.setColorBackGround1(new java.awt.Color(40, 40, 40));
        tablaConteo.setColorBackGround2(new java.awt.Color(40, 40, 40));
        tablaConteo.setColorSelected1(new java.awt.Color(40, 40, 40));
        tablaConteo.setColorSelected2(new java.awt.Color(40, 40, 40));
        tablaConteo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tablaConteo);

        javax.swing.GroupLayout pConteoLayout = new javax.swing.GroupLayout(pConteo);
        pConteo.setLayout(pConteoLayout);
        pConteoLayout.setHorizontalGroup(
            pConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConteoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        pConteoLayout.setVerticalGroup(
            pConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConteoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pConteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pConteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pSuperiorLayout = new javax.swing.GroupLayout(pSuperior);
        pSuperior.setLayout(pSuperiorLayout);
        pSuperiorLayout.setHorizontalGroup(
            pSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSuperiorLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        pSuperiorLayout.setVerticalGroup(
            pSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSuperiorLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        controlador.editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        controlador.agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        controlador.filtrar();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        controlador.descargar();
    }//GEN-LAST:event_btnDescargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnAgregar;
    public com.sm.componet.Button btnDescargar;
    public com.sm.componet.Button btnEditar;
    public com.sm.componet.Button btnEliminar;
    public com.sm.componet.Button btnFiltrar;
    public com.sm.componet.Button btnLimpiar;
    public com.sm.componet.ComboBoxSuggestion comboEstado;
    public com.raven.datechooser.DateChooser dateChooserFinal;
    public com.raven.datechooser.DateChooser dateChooserInicio;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlbAplicacion;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbFinal;
    public javax.swing.JLabel jlbInicio;
    public javax.swing.JLabel jlbPassword;
    public javax.swing.JLabel jlbUsuario;
    public com.sm.componet.Panel pAplicacion;
    public com.sm.componet.PanelRound pBotones;
    public com.sm.componet.PanelRound pConteo;
    public com.sm.componet.Panel pEstado;
    public com.sm.componet.Panel pFinal;
    public com.sm.componet.Panel pInicio;
    public com.sm.componet.PanelRound pInputs;
    public com.sm.componet.Panel pPassword;
    public com.sm.componet.PanelRound pSuperior;
    public com.javaswingdev.RoundPanel pTabla;
    public com.sm.componet.Panel pUsuario;
    public javax.swing.JScrollPane scroll;
    public com.javaswingdev.Table tabla;
    public com.sm.componet.TableCustom tablaConteo;
    public com.sm.componet.TextFieldSuggestion txtAplicacion;
    public com.sm.componet.TextFieldSuggestion txtFinal;
    public com.sm.componet.TextFieldSuggestion txtInicio;
    public com.sm.componet.TextFieldSuggestion txtPassword;
    public com.sm.componet.TextFieldSuggestion txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pAplicacion, pBotones, pConteo, pEstado, pFinal, pInicio, pInputs, pPassword, pSuperior, pUsuario);
        BOTON1(btnAgregar, btnDescargar, btnEditar, btnEliminar, btnFiltrar, btnLimpiar);
        TEXT2(btnAgregar, btnDescargar, btnEditar, btnEliminar, btnFiltrar, btnLimpiar);
        TEXT1(jlbAplicacion, jlbEstado, jlbFinal, jlbInicio, jlbPassword, jlbUsuario);
        TEXT1(txtAplicacion, txtFinal, txtInicio, txtPassword, txtPassword);
    }
}
