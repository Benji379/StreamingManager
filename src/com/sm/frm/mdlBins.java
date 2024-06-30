package com.sm.frm;

import com.sm.controladores.CBins;
import com.sm.utils.UIController;
import static com.sm.modelo.SystemConfig.*;

public class mdlBins extends javax.swing.JPanel {

    CBins controlador;

    public mdlBins() {
        initComponents();
        controlador = new CBins(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new com.javaswingdev.RoundPanel();
        scroll = new javax.swing.JScrollPane();
        tabla = new com.javaswingdev.Table();
        pDatos = new com.sm.componet.PanelRound();
        pBotones = new com.sm.componet.PanelRound();
        btnLimpiar = new com.sm.componet.Button();
        btnEditar = new com.sm.componet.Button();
        btnAgregar = new com.sm.componet.Button();
        btnEliminar = new com.sm.componet.Button();
        btnFiltrar = new com.sm.componet.Button();
        btnDescargar = new com.sm.componet.Button();
        jlbTitulo = new javax.swing.JLabel();
        tarjetaCredito = new com.sm.frm.TarjetaCredito();
        pDatos2 = new com.sm.componet.PanelRound();
        pBin = new com.sm.componet.Panel();
        txtBin = new com.sm.componet.TextFieldSuggestion();
        jlbBin = new javax.swing.JLabel();
        pMes = new com.sm.componet.Panel();
        jlbMes = new javax.swing.JLabel();
        comboMes = new com.sm.componet.ComboBoxSuggestion();
        pAnio = new com.sm.componet.Panel();
        jlbAnio = new javax.swing.JLabel();
        comboAnio = new com.sm.componet.ComboBoxSuggestion();
        pCcv = new com.sm.componet.Panel();
        txtCvv = new com.sm.componet.TextFieldSuggestion();
        jlbCcv = new javax.swing.JLabel();
        pZip = new com.sm.componet.Panel();
        txtZip = new com.sm.componet.TextFieldSuggestion();
        jlbZip = new javax.swing.JLabel();
        pAplicacion = new com.sm.componet.Panel();
        txtAplicacion = new com.sm.componet.TextFieldSuggestion();
        jlbAplicacion = new javax.swing.JLabel();
        pEstado = new com.sm.componet.Panel();
        jlbEstado = new javax.swing.JLabel();
        comboEstado = new com.sm.componet.ComboBoxSuggestion();
        pPais = new com.sm.componet.Panel();
        jlbPais = new javax.swing.JLabel();
        comboPaises = new com.sm.componet.ComboBoxSuggestion();

        setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(255, 255, 255));
        pTabla.setRound(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BIN", "Mes", "Anio", "CCV", "ZIP", "Aplicacion", "Estado", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
            tabla.getColumnModel().getColumn(0).setMaxWidth(130);
        }

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );

        pDatos.setBackground(new java.awt.Color(35, 35, 35));
        pDatos.setRoundBottomLeft(10);
        pDatos.setRoundBottomRight(10);
        pDatos.setRoundTopLeft(10);
        pDatos.setRoundTopRight(10);

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

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbTitulo.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("Mis BIN's");

        tarjetaCredito.setTarjet_bin("xxxxxxxxxxxxxxxx");
        tarjetaCredito.setTarjet_cvv("000");
        tarjetaCredito.setTarjet_zip("00000");

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDatosLayout.createSequentialGroup()
                        .addComponent(jlbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pDatos2.setBackground(new java.awt.Color(35, 35, 35));
        pDatos2.setRoundBottomLeft(10);
        pDatos2.setRoundBottomRight(10);
        pDatos2.setRoundTopLeft(10);
        pDatos2.setRoundTopRight(10);

        pBin.setBackground(new java.awt.Color(35, 35, 35));
        pBin.setRoundBottomLeft(10);
        pBin.setRoundBottomRight(10);
        pBin.setRoundTopLeft(10);
        pBin.setRoundTopRight(10);

        txtBin.setForeground(new java.awt.Color(255, 255, 255));
        txtBin.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtBin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBinKeyTyped(evt);
            }
        });

        jlbBin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbBin.setForeground(new java.awt.Color(255, 255, 255));
        jlbBin.setText("BIN");

        javax.swing.GroupLayout pBinLayout = new javax.swing.GroupLayout(pBin);
        pBin.setLayout(pBinLayout);
        pBinLayout.setHorizontalGroup(
            pBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBinLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbBin))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pBinLayout.setVerticalGroup(
            pBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbBin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pMes.setBackground(new java.awt.Color(35, 35, 35));
        pMes.setRoundBottomLeft(10);
        pMes.setRoundBottomRight(10);
        pMes.setRoundTopLeft(10);
        pMes.setRoundTopRight(10);

        jlbMes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbMes.setForeground(new java.awt.Color(255, 255, 255));
        jlbMes.setText("Mes");

        comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Random", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        comboMes.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pMesLayout = new javax.swing.GroupLayout(pMes);
        pMes.setLayout(pMesLayout);
        pMesLayout.setHorizontalGroup(
            pMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbMes))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pMesLayout.setVerticalGroup(
            pMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pAnio.setBackground(new java.awt.Color(35, 35, 35));
        pAnio.setRoundBottomLeft(10);
        pAnio.setRoundBottomRight(10);
        pAnio.setRoundTopLeft(10);
        pAnio.setRoundTopRight(10);

        jlbAnio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbAnio.setForeground(new java.awt.Color(255, 255, 255));
        jlbAnio.setText("Anio");

        comboAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Random", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        comboAnio.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pAnioLayout = new javax.swing.GroupLayout(pAnio);
        pAnio.setLayout(pAnioLayout);
        pAnioLayout.setHorizontalGroup(
            pAnioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pAnioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAnio))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pAnioLayout.setVerticalGroup(
            pAnioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAnioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbAnio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pCcv.setBackground(new java.awt.Color(35, 35, 35));
        pCcv.setRoundBottomLeft(10);
        pCcv.setRoundBottomRight(10);
        pCcv.setRoundTopLeft(10);
        pCcv.setRoundTopRight(10);

        txtCvv.setForeground(new java.awt.Color(255, 255, 255));
        txtCvv.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbCcv.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbCcv.setForeground(new java.awt.Color(255, 255, 255));
        jlbCcv.setText("CCV");

        javax.swing.GroupLayout pCcvLayout = new javax.swing.GroupLayout(pCcv);
        pCcv.setLayout(pCcvLayout);
        pCcvLayout.setHorizontalGroup(
            pCcvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCcvLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pCcvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCcv))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pCcvLayout.setVerticalGroup(
            pCcvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCcvLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbCcv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pZip.setBackground(new java.awt.Color(35, 35, 35));
        pZip.setRoundBottomLeft(10);
        pZip.setRoundBottomRight(10);
        pZip.setRoundTopLeft(10);
        pZip.setRoundTopRight(10);

        txtZip.setForeground(new java.awt.Color(255, 255, 255));
        txtZip.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jlbZip.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbZip.setForeground(new java.awt.Color(255, 255, 255));
        jlbZip.setText("ZIP");

        javax.swing.GroupLayout pZipLayout = new javax.swing.GroupLayout(pZip);
        pZip.setLayout(pZipLayout);
        pZipLayout.setHorizontalGroup(
            pZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pZipLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbZip))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pZipLayout.setVerticalGroup(
            pZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pZipLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbZip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
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

        pPais.setBackground(new java.awt.Color(35, 35, 35));
        pPais.setRoundBottomLeft(10);
        pPais.setRoundBottomRight(10);
        pPais.setRoundTopLeft(10);
        pPais.setRoundTopRight(10);

        jlbPais.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPais.setForeground(new java.awt.Color(255, 255, 255));
        jlbPais.setText("Pais");

        comboPaises.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pPaisLayout = new javax.swing.GroupLayout(pPais);
        pPais.setLayout(pPaisLayout);
        pPaisLayout.setHorizontalGroup(
            pPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPaisLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPais))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pPaisLayout.setVerticalGroup(
            pPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos2Layout.createSequentialGroup()
                        .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pCcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(pDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
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

    private void txtBinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBinKeyTyped
        UIController.limitacionNumeros(txtBin, evt, 16);
    }//GEN-LAST:event_txtBinKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnAgregar;
    public com.sm.componet.Button btnDescargar;
    public com.sm.componet.Button btnEditar;
    public com.sm.componet.Button btnEliminar;
    public com.sm.componet.Button btnFiltrar;
    public com.sm.componet.Button btnLimpiar;
    public com.sm.componet.ComboBoxSuggestion comboAnio;
    public com.sm.componet.ComboBoxSuggestion comboEstado;
    public com.sm.componet.ComboBoxSuggestion comboMes;
    public com.sm.componet.ComboBoxSuggestion comboPaises;
    public javax.swing.JLabel jlbAnio;
    public javax.swing.JLabel jlbAplicacion;
    public javax.swing.JLabel jlbBin;
    public javax.swing.JLabel jlbCcv;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbMes;
    public javax.swing.JLabel jlbPais;
    public javax.swing.JLabel jlbTitulo;
    public javax.swing.JLabel jlbZip;
    public com.sm.componet.Panel pAnio;
    public com.sm.componet.Panel pAplicacion;
    public com.sm.componet.Panel pBin;
    public com.sm.componet.PanelRound pBotones;
    public com.sm.componet.Panel pCcv;
    public com.sm.componet.PanelRound pDatos;
    public com.sm.componet.PanelRound pDatos2;
    public com.sm.componet.Panel pEstado;
    public com.sm.componet.Panel pMes;
    public com.sm.componet.Panel pPais;
    public com.javaswingdev.RoundPanel pTabla;
    public com.sm.componet.Panel pZip;
    public javax.swing.JScrollPane scroll;
    public com.javaswingdev.Table tabla;
    public com.sm.frm.TarjetaCredito tarjetaCredito;
    public com.sm.componet.TextFieldSuggestion txtAplicacion;
    public com.sm.componet.TextFieldSuggestion txtBin;
    public com.sm.componet.TextFieldSuggestion txtCvv;
    public com.sm.componet.TextFieldSuggestion txtZip;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        //<editor-fold defaultstate="collapsed" desc="initDesing">
        BACKGROUND1(this);
        BACKGROUND2(pDatos, pBotones, pDatos2, pBin, pMes, pAnio, pCcv, pZip, pAplicacion, pEstado, pPais);
        TEXT1(jlbTitulo, jlbBin, jlbMes, jlbAnio, jlbCcv, jlbZip, jlbAplicacion, jlbEstado, jlbPais);
        BOTON1(btnLimpiar, btnEliminar, btnAgregar, btnEditar, btnFiltrar, btnDescargar);
        TEXT2(btnLimpiar, btnEliminar, btnAgregar, btnEditar, btnFiltrar, btnDescargar);
        //</editor-fold>
    }

}
