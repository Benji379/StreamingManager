package com.sm.frm;

import com.sm.controladores.CConfiguracion;
import static com.sm.modelo.SystemConfig.*;

public class mdlConfiguracion extends javax.swing.JPanel {

    CConfiguracion controlador;

    public mdlConfiguracion() {
        initComponents();
        controlador = new CConfiguracion(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pColors = new com.sm.componet.PanelCustom();
        jScrollPane1 = new com.benjiBK.scroll.ScrollPaneWin11();
        contenedorColorChosser = new javax.swing.JPanel();
        jlbColores = new javax.swing.JLabel();
        ccPrincipal1 = new com.sm.frm.ColorChosser();
        ccPrincipal2 = new com.sm.frm.ColorChosser();
        ccPrincipal3 = new com.sm.frm.ColorChosser();
        ccBackground1 = new com.sm.frm.ColorChosser();
        ccBackground2 = new com.sm.frm.ColorChosser();
        ccBackground3 = new com.sm.frm.ColorChosser();
        ccTexto1 = new com.sm.frm.ColorChosser();
        ccTexto2 = new com.sm.frm.ColorChosser();
        ccBoton1 = new com.sm.frm.ColorChosser();
        ccBoton2 = new com.sm.frm.ColorChosser();
        ccSelect1 = new com.sm.frm.ColorChosser();
        ccSelect2 = new com.sm.frm.ColorChosser();
        pNombreUsuario = new com.sm.componet.PanelCustom();
        txtUsuario = new javax.swing.JLabel();
        pConfig = new com.sm.componet.PanelCustom();
        jlbConfig = new javax.swing.JLabel();
        pTokenGrupo = new com.sm.componet.Panel();
        txtTokenGroup = new com.sm.componet.TextFieldSuggestion();
        jlbTokenGrupo = new javax.swing.JLabel();
        pCorreo = new com.sm.componet.Panel();
        txtCorreo = new com.sm.componet.TextFieldSuggestion();
        jlbCorreo = new javax.swing.JLabel();
        pTokenCorreo = new com.sm.componet.Panel();
        txtTokenCorreo = new com.sm.componet.TextFieldSuggestion();
        jlbTokenCorreo = new javax.swing.JLabel();
        btnGuardar = new com.sm.componet.Button();

        setBackground(new java.awt.Color(30, 30, 30));

        pColors.setBackground(new java.awt.Color(30, 30, 30));
        pColors.setRound(20);
        pColors.setShadowColor(new java.awt.Color(0, 0, 0));

        contenedorColorChosser.setBackground(new java.awt.Color(30, 30, 30));

        jlbColores.setFont(new java.awt.Font("Russo One", 0, 36)); // NOI18N
        jlbColores.setForeground(new java.awt.Color(255, 255, 255));
        jlbColores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbColores.setText("Colores");

        ccPrincipal1.setColorSelect(new java.awt.Color(0, 204, 204));
        ccPrincipal1.setTitulo("Principal I");

        ccPrincipal2.setTitulo("Principal II");

        ccPrincipal3.setTitulo("Principal III");

        ccBackground1.setColorSelect(new java.awt.Color(0, 204, 204));
        ccBackground1.setTitulo("Background I");

        ccBackground2.setTitulo("Background II");

        ccBackground3.setTitulo("Background III");

        ccTexto1.setColorSelect(new java.awt.Color(0, 204, 204));
        ccTexto1.setTitulo("Texto I");

        ccTexto2.setTitulo("Texto II");

        ccBoton1.setTitulo("Boton I");

        ccBoton2.setColorSelect(new java.awt.Color(0, 204, 204));
        ccBoton2.setTitulo("Boton II");

        ccSelect1.setTitulo("Select I");

        ccSelect2.setTitulo("Select II");

        javax.swing.GroupLayout contenedorColorChosserLayout = new javax.swing.GroupLayout(contenedorColorChosser);
        contenedorColorChosser.setLayout(contenedorColorChosserLayout);
        contenedorColorChosserLayout.setHorizontalGroup(
            contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorColorChosserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ccBoton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ccSelect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ccBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccPrincipal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccSelect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        contenedorColorChosserLayout.setVerticalGroup(
            contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorColorChosserLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlbColores, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ccPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ccBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ccTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contenedorColorChosserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ccBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(contenedorColorChosser);

        javax.swing.GroupLayout pColorsLayout = new javax.swing.GroupLayout(pColors);
        pColors.setLayout(pColorsLayout);
        pColorsLayout.setHorizontalGroup(
            pColorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pColorsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        pColorsLayout.setVerticalGroup(
            pColorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pColorsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pNombreUsuario.setBackground(new java.awt.Color(30, 30, 30));
        pNombreUsuario.setShadowColor(new java.awt.Color(0, 0, 0));

        txtUsuario.setFont(new java.awt.Font("Russo One", 0, 40)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuario.setText("Benji379");

        javax.swing.GroupLayout pNombreUsuarioLayout = new javax.swing.GroupLayout(pNombreUsuario);
        pNombreUsuario.setLayout(pNombreUsuarioLayout);
        pNombreUsuarioLayout.setHorizontalGroup(
            pNombreUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pNombreUsuarioLayout.setVerticalGroup(
            pNombreUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombreUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtUsuario)
                .addGap(30, 30, 30))
        );

        pConfig.setBackground(new java.awt.Color(30, 30, 30));
        pConfig.setShadowColor(new java.awt.Color(0, 0, 0));

        jlbConfig.setFont(new java.awt.Font("Russo One", 0, 36)); // NOI18N
        jlbConfig.setForeground(new java.awt.Color(255, 255, 255));
        jlbConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbConfig.setText("Config");

        pTokenGrupo.setBackground(new java.awt.Color(30, 30, 30));
        pTokenGrupo.setRoundBottomLeft(10);
        pTokenGrupo.setRoundBottomRight(10);
        pTokenGrupo.setRoundTopLeft(10);
        pTokenGrupo.setRoundTopRight(10);

        txtTokenGroup.setForeground(new java.awt.Color(255, 255, 255));
        txtTokenGroup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTokenGroup.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N

        jlbTokenGrupo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlbTokenGrupo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTokenGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTokenGrupo.setText("token-group");

        javax.swing.GroupLayout pTokenGrupoLayout = new javax.swing.GroupLayout(pTokenGrupo);
        pTokenGrupo.setLayout(pTokenGrupoLayout);
        pTokenGrupoLayout.setHorizontalGroup(
            pTokenGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTokenGrupoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtTokenGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addComponent(jlbTokenGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTokenGrupoLayout.setVerticalGroup(
            pTokenGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTokenGrupoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbTokenGrupo)
                .addGap(13, 13, 13)
                .addComponent(txtTokenGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pCorreo.setBackground(new java.awt.Color(30, 30, 30));
        pCorreo.setRoundBottomLeft(10);
        pCorreo.setRoundBottomRight(10);
        pCorreo.setRoundTopLeft(10);
        pCorreo.setRoundTopRight(10);

        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N

        jlbCorreo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCorreo.setText("correo");

        javax.swing.GroupLayout pCorreoLayout = new javax.swing.GroupLayout(pCorreo);
        pCorreo.setLayout(pCorreoLayout);
        pCorreoLayout.setHorizontalGroup(
            pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCorreoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addComponent(jlbCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pCorreoLayout.setVerticalGroup(
            pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCorreoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbCorreo)
                .addGap(13, 13, 13)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pTokenCorreo.setBackground(new java.awt.Color(30, 30, 30));
        pTokenCorreo.setRoundBottomLeft(10);
        pTokenCorreo.setRoundBottomRight(10);
        pTokenCorreo.setRoundTopLeft(10);
        pTokenCorreo.setRoundTopRight(10);

        txtTokenCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtTokenCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTokenCorreo.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N

        jlbTokenCorreo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlbTokenCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTokenCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTokenCorreo.setText("token-correo");

        javax.swing.GroupLayout pTokenCorreoLayout = new javax.swing.GroupLayout(pTokenCorreo);
        pTokenCorreo.setLayout(pTokenCorreoLayout);
        pTokenCorreoLayout.setHorizontalGroup(
            pTokenCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTokenCorreoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtTokenCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addComponent(jlbTokenCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        pTokenCorreoLayout.setVerticalGroup(
            pTokenCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTokenCorreoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbTokenCorreo)
                .addGap(13, 13, 13)
                .addComponent(txtTokenCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnGuardar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnGuardar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pConfigLayout = new javax.swing.GroupLayout(pConfig);
        pConfig.setLayout(pConfigLayout);
        pConfigLayout.setHorizontalGroup(
            pConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConfigLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pTokenGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(pConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTokenCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pConfigLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addGap(44, 44, 44)))
        );
        pConfigLayout.setVerticalGroup(
            pConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfigLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbConfig)
                .addGap(40, 40, 40)
                .addComponent(pTokenGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTokenCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(pConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pConfigLayout.createSequentialGroup()
                    .addGap(500, 500, 500)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(pColors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pColors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        controlador.btnGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnGuardar;
    public com.sm.frm.ColorChosser ccBackground1;
    public com.sm.frm.ColorChosser ccBackground2;
    public com.sm.frm.ColorChosser ccBackground3;
    public com.sm.frm.ColorChosser ccBoton1;
    public com.sm.frm.ColorChosser ccBoton2;
    public com.sm.frm.ColorChosser ccPrincipal1;
    public com.sm.frm.ColorChosser ccPrincipal2;
    public com.sm.frm.ColorChosser ccPrincipal3;
    public com.sm.frm.ColorChosser ccSelect1;
    public com.sm.frm.ColorChosser ccSelect2;
    public com.sm.frm.ColorChosser ccTexto1;
    public com.sm.frm.ColorChosser ccTexto2;
    public javax.swing.JPanel contenedorColorChosser;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlbColores;
    public javax.swing.JLabel jlbConfig;
    public javax.swing.JLabel jlbCorreo;
    public javax.swing.JLabel jlbTokenCorreo;
    public javax.swing.JLabel jlbTokenGrupo;
    public com.sm.componet.PanelCustom pColors;
    public com.sm.componet.PanelCustom pConfig;
    public com.sm.componet.Panel pCorreo;
    public com.sm.componet.PanelCustom pNombreUsuario;
    public com.sm.componet.Panel pTokenCorreo;
    public com.sm.componet.Panel pTokenGrupo;
    public com.sm.componet.TextFieldSuggestion txtCorreo;
    public com.sm.componet.TextFieldSuggestion txtTokenCorreo;
    public com.sm.componet.TextFieldSuggestion txtTokenGroup;
    public javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pColors, pConfig, pCorreo, pNombreUsuario, pTokenCorreo, pTokenGrupo, contenedorColorChosser);
        BACKGROUND3(ccBackground1, ccBackground2, ccBackground3, ccBoton1, ccBoton2, ccPrincipal1, ccPrincipal2, ccPrincipal3, ccTexto1, ccTexto2, ccSelect1, ccSelect2);
        BOTON1(btnGuardar);
        TEXT1(jlbColores, jlbConfig, jlbCorreo, jlbTokenCorreo, jlbTokenGrupo);
        TEXT1(ccBackground1.txtColor, ccBackground2.txtColor, ccBackground3.txtColor, ccBoton1.txtColor, ccBoton2.txtColor, ccPrincipal1.txtColor, ccPrincipal2.txtColor, ccPrincipal3.txtColor, ccTexto1.txtColor, ccTexto2.txtColor, ccSelect1.txtColor, ccSelect2.txtColor);
        TEXT1(ccBackground1.txtTittle, ccBackground2.txtTittle, ccBackground3.txtTittle, ccBoton1.txtTittle, ccBoton2.txtTittle, ccPrincipal1.txtTittle, ccPrincipal2.txtTittle, ccPrincipal3.txtTittle, ccTexto1.txtColor, ccTexto2.txtTittle, ccSelect1.txtTittle, ccSelect2.txtTittle);
    }

}
