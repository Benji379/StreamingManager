package com.sm.frm;

import com.sm.controladores.CVentaCuenta;
import static com.sm.modelo.SystemConfig.*;

public class mdlVentaCuenta extends javax.swing.JPanel {

    CVentaCuenta controlador;

    public mdlVentaCuenta() {
        initComponents();
        controlador = new CVentaCuenta(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserInicio = new com.raven.datechooser.DateChooser();
        dateChooserFinal = new com.raven.datechooser.DateChooser();
        pTabla = new com.javaswingdev.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new com.javaswingdev.Table();
        pInfo = new com.sm.componet.PanelRound();
        pUsuario = new com.sm.componet.Panel();
        jlbUsuario = new javax.swing.JLabel();
        infoTxtUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pPassword = new com.sm.componet.Panel();
        jlbPassword = new javax.swing.JLabel();
        infotxtPassword = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        pAplicacion = new com.sm.componet.Panel();
        jlbAplicacion = new javax.swing.JLabel();
        infoTxtAplicacion = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        pFinaliza = new com.sm.componet.Panel();
        jlbFinaliza = new javax.swing.JLabel();
        infoTxtFinaliza = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jlbInfo = new javax.swing.JLabel();
        btnCopiar = new com.sm.componet.Button();
        pInput = new com.sm.componet.PanelRound();
        jlbAsignar = new javax.swing.JLabel();
        pAsignar = new com.sm.componet.Panel();
        txtAsignado = new com.sm.componet.TextFieldSuggestion();
        jlbAsignado = new javax.swing.JLabel();
        pWhatsApp = new com.sm.componet.Panel();
        txtWhastApp = new com.sm.componet.TextFieldSuggestion();
        jlbWhatsApp = new javax.swing.JLabel();
        pCuenta = new com.sm.componet.Panel();
        txtCuenta = new com.sm.componet.TextFieldSuggestion();
        jlbCuenta = new javax.swing.JLabel();
        pEstado = new com.sm.componet.Panel();
        jlbEstado = new javax.swing.JLabel();
        comboEstado = new com.sm.componet.ComboBoxSuggestion();
        pInicio = new com.sm.componet.Panel();
        txtInicio = new com.sm.componet.TextFieldSuggestion();
        jlbInicio = new javax.swing.JLabel();
        pFin = new com.sm.componet.Panel();
        txtFin = new com.sm.componet.TextFieldSuggestion();
        jlbFin = new javax.swing.JLabel();
        pBotones = new com.sm.componet.PanelRound();
        btnRegistrar = new com.sm.componet.Button();
        btnLimpiar = new com.sm.componet.Button();
        btnActualizar = new com.sm.componet.Button();
        btnEliminar = new com.sm.componet.Button();
        btnDescargar = new com.sm.componet.Button();

        dateChooserInicio.setTextRefernce(txtInicio);

        dateChooserFinal.setTextRefernce(txtFin);

        setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setRound(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Asignado", "WhatsApp", "Inicio", "Fin", "Estado", "Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pInfo.setBackground(new java.awt.Color(35, 35, 35));
        pInfo.setForeground(new java.awt.Color(35, 35, 35));
        pInfo.setRoundBottomLeft(10);
        pInfo.setRoundBottomRight(10);
        pInfo.setRoundTopLeft(10);
        pInfo.setRoundTopRight(10);

        pUsuario.setBackground(new java.awt.Color(35, 35, 35));
        pUsuario.setRoundBottomLeft(10);
        pUsuario.setRoundBottomRight(10);
        pUsuario.setRoundTopLeft(10);
        pUsuario.setRoundTopRight(10);

        jlbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlbUsuario.setText("Usuario");

        infoTxtUsuario.setFont(new java.awt.Font("Kanit Light", 0, 16)); // NOI18N
        infoTxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        infoTxtUsuario.setText("correo@gmail.com");

        javax.swing.GroupLayout pUsuarioLayout = new javax.swing.GroupLayout(pUsuario);
        pUsuario.setLayout(pUsuarioLayout);
        pUsuarioLayout.setHorizontalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jlbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        pUsuarioLayout.setVerticalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTxtUsuario)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pPassword.setBackground(new java.awt.Color(35, 35, 35));
        pPassword.setRoundBottomLeft(10);
        pPassword.setRoundBottomRight(10);
        pPassword.setRoundTopLeft(10);
        pPassword.setRoundTopRight(10);

        jlbPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlbPassword.setText("Password");

        infotxtPassword.setFont(new java.awt.Font("Kanit Light", 0, 16)); // NOI18N
        infotxtPassword.setForeground(new java.awt.Color(255, 255, 255));
        infotxtPassword.setText("1234*#");

        javax.swing.GroupLayout pPasswordLayout = new javax.swing.GroupLayout(pPassword);
        pPassword.setLayout(pPasswordLayout);
        pPasswordLayout.setHorizontalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(infotxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        pPasswordLayout.setVerticalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPasswordLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infotxtPassword)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pAplicacion.setBackground(new java.awt.Color(35, 35, 35));
        pAplicacion.setRoundBottomLeft(10);
        pAplicacion.setRoundBottomRight(10);
        pAplicacion.setRoundTopLeft(10);
        pAplicacion.setRoundTopRight(10);

        jlbAplicacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jlbAplicacion.setText("Aplicacion");

        infoTxtAplicacion.setFont(new java.awt.Font("Kanit Light", 0, 16)); // NOI18N
        infoTxtAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        infoTxtAplicacion.setText("Aplicacion+");

        javax.swing.GroupLayout pAplicacionLayout = new javax.swing.GroupLayout(pAplicacion);
        pAplicacion.setLayout(pAplicacionLayout);
        pAplicacionLayout.setHorizontalGroup(
            pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAplicacionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addComponent(jlbAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoTxtAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        pAplicacionLayout.setVerticalGroup(
            pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAplicacionLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbAplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTxtAplicacion)
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pFinaliza.setBackground(new java.awt.Color(35, 35, 35));
        pFinaliza.setRoundBottomLeft(10);
        pFinaliza.setRoundBottomRight(10);
        pFinaliza.setRoundTopLeft(10);
        pFinaliza.setRoundTopRight(10);

        jlbFinaliza.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbFinaliza.setForeground(new java.awt.Color(255, 255, 255));
        jlbFinaliza.setText("Finaliza");

        infoTxtFinaliza.setFont(new java.awt.Font("Kanit Light", 0, 16)); // NOI18N
        infoTxtFinaliza.setForeground(new java.awt.Color(255, 255, 255));
        infoTxtFinaliza.setText("00/00/0000");

        javax.swing.GroupLayout pFinalizaLayout = new javax.swing.GroupLayout(pFinaliza);
        pFinaliza.setLayout(pFinalizaLayout);
        pFinalizaLayout.setHorizontalGroup(
            pFinalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFinalizaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pFinalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(infoTxtFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        pFinalizaLayout.setVerticalGroup(
            pFinalizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFinalizaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbFinaliza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTxtFinaliza)
                .addGap(2, 2, 2)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jlbInfo.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jlbInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlbInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInfo.setText("Info");

        btnCopiar.setForeground(new java.awt.Color(0, 0, 0));
        btnCopiar.setText("Copiar");
        btnCopiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCopiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCopiar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnCopiar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pFinaliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addComponent(jlbInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlbInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pInput.setBackground(new java.awt.Color(35, 35, 35));
        pInput.setRoundBottomLeft(10);
        pInput.setRoundBottomRight(10);
        pInput.setRoundTopLeft(10);
        pInput.setRoundTopRight(10);

        jlbAsignar.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jlbAsignar.setForeground(new java.awt.Color(255, 255, 255));
        jlbAsignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAsignar.setText("Asignar");

        pAsignar.setBackground(new java.awt.Color(35, 35, 35));
        pAsignar.setRoundBottomLeft(10);
        pAsignar.setRoundBottomRight(10);
        pAsignar.setRoundTopLeft(10);
        pAsignar.setRoundTopRight(10);

        txtAsignado.setForeground(new java.awt.Color(255, 255, 255));
        txtAsignado.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbAsignado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbAsignado.setForeground(new java.awt.Color(255, 255, 255));
        jlbAsignado.setText("Asignado");

        javax.swing.GroupLayout pAsignarLayout = new javax.swing.GroupLayout(pAsignar);
        pAsignar.setLayout(pAsignarLayout);
        pAsignarLayout.setHorizontalGroup(
            pAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAsignarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAsignado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbAsignado, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pAsignarLayout.setVerticalGroup(
            pAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAsignarLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbAsignado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pWhatsApp.setBackground(new java.awt.Color(35, 35, 35));
        pWhatsApp.setRoundBottomLeft(10);
        pWhatsApp.setRoundBottomRight(10);
        pWhatsApp.setRoundTopLeft(10);
        pWhatsApp.setRoundTopRight(10);

        txtWhastApp.setForeground(new java.awt.Color(255, 255, 255));
        txtWhastApp.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbWhatsApp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbWhatsApp.setForeground(new java.awt.Color(255, 255, 255));
        jlbWhatsApp.setText("WhastApp");

        javax.swing.GroupLayout pWhatsAppLayout = new javax.swing.GroupLayout(pWhatsApp);
        pWhatsApp.setLayout(pWhatsAppLayout);
        pWhatsAppLayout.setHorizontalGroup(
            pWhatsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pWhatsAppLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pWhatsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWhastApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbWhatsApp, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pWhatsAppLayout.setVerticalGroup(
            pWhatsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pWhatsAppLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbWhatsApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWhastApp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pCuenta.setBackground(new java.awt.Color(35, 35, 35));
        pCuenta.setRoundBottomLeft(10);
        pCuenta.setRoundBottomRight(10);
        pCuenta.setRoundTopLeft(10);
        pCuenta.setRoundTopRight(10);

        txtCuenta.setEditable(false);
        txtCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtCuenta.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCuentaMouseClicked(evt);
            }
        });

        jlbCuenta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jlbCuenta.setText("Cuenta");

        javax.swing.GroupLayout pCuentaLayout = new javax.swing.GroupLayout(pCuenta);
        pCuenta.setLayout(pCuentaLayout);
        pCuentaLayout.setHorizontalGroup(
            pCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCuentaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pCuentaLayout.setVerticalGroup(
            pCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCuentaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pEstado.setBackground(new java.awt.Color(35, 35, 35));
        pEstado.setRoundBottomLeft(10);
        pEstado.setRoundBottomRight(10);
        pEstado.setRoundTopLeft(10);
        pEstado.setRoundTopRight(10);

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
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
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pInicio.setBackground(new java.awt.Color(35, 35, 35));
        pInicio.setRoundBottomLeft(10);
        pInicio.setRoundBottomRight(10);
        pInicio.setRoundTopLeft(10);
        pInicio.setRoundTopRight(10);

        txtInicio.setForeground(new java.awt.Color(255, 255, 255));
        txtInicio.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbInicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbInicio.setForeground(new java.awt.Color(255, 255, 255));
        jlbInicio.setText("Inicio");

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pFin.setBackground(new java.awt.Color(35, 35, 35));
        pFin.setRoundBottomLeft(10);
        pFin.setRoundBottomRight(10);
        pFin.setRoundTopLeft(10);
        pFin.setRoundTopRight(10);

        txtFin.setForeground(new java.awt.Color(255, 255, 255));
        txtFin.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbFin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbFin.setForeground(new java.awt.Color(255, 255, 255));
        jlbFin.setText("Fin");

        javax.swing.GroupLayout pFinLayout = new javax.swing.GroupLayout(pFin);
        pFin.setLayout(pFinLayout);
        pFinLayout.setHorizontalGroup(
            pFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFinLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbFin, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pFinLayout.setVerticalGroup(
            pFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFinLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addComponent(pAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addComponent(pCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addComponent(jlbAsignar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlbAsignar)
                .addGap(15, 15, 15)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pBotones.setBackground(new java.awt.Color(35, 35, 35));
        pBotones.setRoundBottomLeft(10);
        pBotones.setRoundBottomRight(10);
        pBotones.setRoundTopLeft(10);
        pBotones.setRoundTopRight(10);

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
                .addGap(25, 25, 25)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(pInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.agregar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        controlador.editar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        controlador.descargar();
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        controlador.copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed

    }//GEN-LAST:event_comboEstadoActionPerformed

    private void txtCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCuentaMouseClicked
        controlador.clickTxtCuenta();
    }//GEN-LAST:event_txtCuentaMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnActualizar;
    public com.sm.componet.Button btnCopiar;
    public com.sm.componet.Button btnDescargar;
    public com.sm.componet.Button btnEliminar;
    public com.sm.componet.Button btnLimpiar;
    public com.sm.componet.Button btnRegistrar;
    public com.sm.componet.ComboBoxSuggestion comboEstado;
    public com.raven.datechooser.DateChooser dateChooserFinal;
    public com.raven.datechooser.DateChooser dateChooserInicio;
    public javax.swing.JLabel infoTxtAplicacion;
    public javax.swing.JLabel infoTxtFinaliza;
    public javax.swing.JLabel infoTxtUsuario;
    public javax.swing.JLabel infotxtPassword;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel jlbAplicacion;
    public javax.swing.JLabel jlbAsignado;
    public javax.swing.JLabel jlbAsignar;
    public javax.swing.JLabel jlbCuenta;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbFin;
    public javax.swing.JLabel jlbFinaliza;
    public javax.swing.JLabel jlbInfo;
    public javax.swing.JLabel jlbInicio;
    public javax.swing.JLabel jlbPassword;
    public javax.swing.JLabel jlbUsuario;
    public javax.swing.JLabel jlbWhatsApp;
    public com.sm.componet.Panel pAplicacion;
    public com.sm.componet.Panel pAsignar;
    public com.sm.componet.PanelRound pBotones;
    public com.sm.componet.Panel pCuenta;
    public com.sm.componet.Panel pEstado;
    public com.sm.componet.Panel pFin;
    public com.sm.componet.Panel pFinaliza;
    public com.sm.componet.PanelRound pInfo;
    public com.sm.componet.Panel pInicio;
    public com.sm.componet.PanelRound pInput;
    public com.sm.componet.Panel pPassword;
    public com.javaswingdev.RoundPanel pTabla;
    public com.sm.componet.Panel pUsuario;
    public com.sm.componet.Panel pWhatsApp;
    public com.javaswingdev.Table tabla;
    public com.sm.componet.TextFieldSuggestion txtAsignado;
    public com.sm.componet.TextFieldSuggestion txtCuenta;
    public com.sm.componet.TextFieldSuggestion txtFin;
    public com.sm.componet.TextFieldSuggestion txtInicio;
    public com.sm.componet.TextFieldSuggestion txtWhastApp;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pAplicacion, pAsignar, pBotones, pCuenta, pEstado, pFin, pFinaliza, pInfo, pInicio, pPassword, pUsuario, pWhatsApp, pInput);
        BOTON1(btnActualizar, btnCopiar, btnDescargar, btnEliminar, btnLimpiar, btnRegistrar);
        TEXT2(btnActualizar, btnCopiar, btnDescargar, btnEliminar, btnLimpiar, btnRegistrar);
        TEXT1(jlbAplicacion, jlbAsignado, jlbAsignar, jlbCuenta, jlbEstado, jlbFin, jlbFinaliza, jlbInfo, jlbInicio, jlbPassword, jlbUsuario, jlbWhatsApp);
        TEXT1(txtAsignado, txtCuenta, txtFin, txtInicio, txtWhastApp);

    }

}
