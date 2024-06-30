package com.sm.frm;

import com.sm.controladores.CHitsVTR;
import static com.sm.modelo.SystemConfig.*;

public class mdlHitsOpenBullet extends javax.swing.JPanel {

    CHitsVTR controlador;

    public mdlHitsOpenBullet() {
        initComponents();
        controlador = new CHitsVTR(this);
        controlador.init();
        initDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new com.javaswingdev.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new com.javaswingdev.Table();
        pSuperior = new com.javaswingdev.RoundPanel();
        pLista = new com.sm.componet.PanelRound();
        ScrollLista = new com.benjiBK.scroll.ScrollPaneWin11();
        listaTablasHits = new com.sm.componet.ListBenji<>();
        jlbListaHits = new javax.swing.JLabel();
        btnCarpeta = new com.sm.componet.Button();
        pBotones = new com.sm.componet.PanelRound();
        btnImportar = new com.sm.componet.Button();
        btnExportar = new com.sm.componet.Button();
        btnEliminarLista = new com.sm.componet.Button();
        pInputs = new com.sm.componet.Panel();
        pIncluye = new com.sm.componet.Panel();
        txtIncluye = new com.sm.componet.TextFieldSuggestion();
        jlbIncluye = new javax.swing.JLabel();
        pRut = new com.sm.componet.Panel();
        txtRut = new com.sm.componet.TextFieldSuggestion();
        jlbRut = new javax.swing.JLabel();
        btnActualizarCambioHit = new com.sm.componet.Button();
        btnQuitarHit = new com.sm.componet.Button();
        btnLimpiar = new com.sm.componet.Button();
        btnFiltrar = new com.sm.componet.Button();
        pEstado = new com.sm.componet.Panel();
        txtEstado = new com.sm.componet.TextFieldSuggestion();
        jlbEstado = new javax.swing.JLabel();

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        pSuperior.setBackground(new java.awt.Color(35, 35, 35));
        pSuperior.setRound(10);

        pLista.setBackground(new java.awt.Color(255, 255, 255));
        pLista.setRoundBottomLeft(10);
        pLista.setRoundBottomRight(10);
        pLista.setRoundTopLeft(10);
        pLista.setRoundTopRight(10);

        listaTablasHits.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTablasHits.setEspacioIzquierdo(30);
        listaTablasHits.setFondoResaltado(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        listaTablasHits.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTablasHitsValueChanged(evt);
            }
        });
        ScrollLista.setViewportView(listaTablasHits);

        jlbListaHits.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbListaHits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbListaHits.setText("Lista Hits");

        btnCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sm/img/carpeta.png"))); // NOI18N
        btnCarpeta.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarpeta.setRippleColor(new java.awt.Color(0, 0, 0));
        btnCarpeta.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarpetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pListaLayout = new javax.swing.GroupLayout(pLista);
        pLista.setLayout(pListaLayout);
        pListaLayout.setHorizontalGroup(
            pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pListaLayout.createSequentialGroup()
                        .addComponent(jlbListaHits, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pListaLayout.setVerticalGroup(
            pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pListaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbListaHits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pBotones.setBackground(new java.awt.Color(35, 35, 35));
        pBotones.setRoundBottomLeft(10);
        pBotones.setRoundBottomRight(10);
        pBotones.setRoundTopLeft(10);
        pBotones.setRoundTopRight(10);

        btnImportar.setForeground(new java.awt.Color(0, 0, 0));
        btnImportar.setText("Importar");
        btnImportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnImportar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnExportar.setForeground(new java.awt.Color(0, 0, 0));
        btnExportar.setText("Descargar");
        btnExportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnExportar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnEliminarLista.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarLista.setText("Eliminar");
        btnEliminarLista.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarLista.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarLista.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEliminarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnEliminarLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pInputs.setBackground(new java.awt.Color(35, 35, 35));
        pInputs.setRoundBottomLeft(10);
        pInputs.setRoundBottomRight(10);
        pInputs.setRoundTopLeft(10);
        pInputs.setRoundTopRight(10);

        pIncluye.setBackground(new java.awt.Color(35, 35, 35));
        pIncluye.setRoundBottomLeft(10);
        pIncluye.setRoundBottomRight(10);
        pIncluye.setRoundTopLeft(10);
        pIncluye.setRoundTopRight(10);

        txtIncluye.setForeground(new java.awt.Color(255, 255, 255));
        txtIncluye.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

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
                    .addComponent(txtIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbIncluye))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pIncluyeLayout.setVerticalGroup(
            pIncluyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIncluyeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbIncluye)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pRut.setBackground(new java.awt.Color(35, 35, 35));
        pRut.setRoundBottomLeft(10);
        pRut.setRoundBottomRight(10);
        pRut.setRoundTopLeft(10);
        pRut.setRoundTopRight(10);

        txtRut.setForeground(new java.awt.Color(255, 255, 255));
        txtRut.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

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
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnActualizarCambioHit.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarCambioHit.setText("Actualizar");
        btnActualizarCambioHit.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCambioHit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActualizarCambioHit.setRippleColor(new java.awt.Color(0, 0, 0));
        btnActualizarCambioHit.setShadowColor(new java.awt.Color(0, 0, 0));
        btnActualizarCambioHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCambioHitActionPerformed(evt);
            }
        });

        btnQuitarHit.setForeground(new java.awt.Color(0, 0, 0));
        btnQuitarHit.setText("Quitar");
        btnQuitarHit.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitarHit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnQuitarHit.setRippleColor(new java.awt.Color(0, 0, 0));
        btnQuitarHit.setShadowColor(new java.awt.Color(0, 0, 0));
        btnQuitarHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarHitActionPerformed(evt);
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

        pEstado.setBackground(new java.awt.Color(35, 35, 35));
        pEstado.setRoundBottomLeft(10);
        pEstado.setRoundBottomRight(10);
        pEstado.setRoundTopLeft(10);
        pEstado.setRoundTopRight(10);

        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setText("Estado");

        javax.swing.GroupLayout pEstadoLayout = new javax.swing.GroupLayout(pEstado);
        pEstado.setLayout(pEstadoLayout);
        pEstadoLayout.setHorizontalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEstado))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pInputsLayout = new javax.swing.GroupLayout(pInputs);
        pInputs.setLayout(pInputsLayout);
        pInputsLayout.setHorizontalGroup(
            pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pIncluye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputsLayout.createSequentialGroup()
                                .addComponent(btnQuitarHit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputsLayout.createSequentialGroup()
                                .addComponent(btnActualizarCambioHit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        pInputsLayout.setVerticalGroup(
            pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pIncluye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputsLayout.createSequentialGroup()
                        .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarCambioHit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuitarHit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout pSuperiorLayout = new javax.swing.GroupLayout(pSuperior);
        pSuperior.setLayout(pSuperiorLayout);
        pSuperiorLayout.setHorizontalGroup(
            pSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        pSuperiorLayout.setVerticalGroup(
            pSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSuperiorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(pSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaTablasHitsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTablasHitsValueChanged
        controlador.eventoSeleccionLista();
    }//GEN-LAST:event_listaTablasHitsValueChanged

    private void btnActualizarCambioHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCambioHitActionPerformed
        controlador.btnActualizarSoloHit();
    }//GEN-LAST:event_btnActualizarCambioHitActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        controlador.btnImportar();
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        controlador.btnExportar();
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnEliminarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarListaActionPerformed
        controlador.btnEliminarLista();
    }//GEN-LAST:event_btnEliminarListaActionPerformed

    private void btnQuitarHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarHitActionPerformed
        controlador.btnEliminarHit();
    }//GEN-LAST:event_btnQuitarHitActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.btnLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        controlador.btnFiltrar();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpetaActionPerformed
        controlador.btnAbrirCarpeta();
    }//GEN-LAST:event_btnCarpetaActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane ScrollLista;
    public com.sm.componet.Button btnActualizarCambioHit;
    public com.sm.componet.Button btnCarpeta;
    public com.sm.componet.Button btnEliminarLista;
    public com.sm.componet.Button btnExportar;
    public com.sm.componet.Button btnFiltrar;
    public com.sm.componet.Button btnImportar;
    public com.sm.componet.Button btnLimpiar;
    public com.sm.componet.Button btnQuitarHit;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbIncluye;
    public javax.swing.JLabel jlbListaHits;
    public javax.swing.JLabel jlbRut;
    public com.sm.componet.ListBenji<String> listaTablasHits;
    public com.sm.componet.PanelRound pBotones;
    public com.sm.componet.Panel pEstado;
    public com.sm.componet.Panel pIncluye;
    public com.sm.componet.Panel pInputs;
    public com.sm.componet.PanelRound pLista;
    public com.sm.componet.Panel pRut;
    public com.javaswingdev.RoundPanel pSuperior;
    public com.javaswingdev.RoundPanel pTabla;
    public com.javaswingdev.Table tabla;
    public com.sm.componet.TextFieldSuggestion txtEstado;
    public com.sm.componet.TextFieldSuggestion txtIncluye;
    public com.sm.componet.TextFieldSuggestion txtRut;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pBotones, pEstado, pIncluye, pInputs, pRut, pSuperior);
        BOTON1(btnActualizarCambioHit, btnCarpeta, btnEliminarLista, btnExportar, btnFiltrar, btnImportar, btnLimpiar, btnQuitarHit);
        TEXT2(btnActualizarCambioHit, btnCarpeta, btnEliminarLista, btnExportar, btnFiltrar, btnImportar, btnLimpiar, btnQuitarHit, jlbListaHits);
        TEXT1(jlbEstado, jlbIncluye, jlbRut);
    }
}
