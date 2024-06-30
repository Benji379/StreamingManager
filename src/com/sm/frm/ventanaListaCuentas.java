package com.sm.frm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sm.data.DataCuentas;
import com.sm.utils.FiltroTabla;
import com.sm.utils.UIController;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import static com.sm.modelo.SystemConfig.*;

public class ventanaListaCuentas extends javax.swing.JPanel {

    private DataCuentas data;
    private DefaultTableModel modelo;
    private String idCuenta;
    private int filaSeleccionada = -1;

    public ventanaListaCuentas() {
        initComponents();
        data = new DataCuentas();
        cargarJSONReferencias();
        txtEstado.addItemSuggestion("Disponible", "Inactivo", "Ocupado");
        detectarCambios(txtUsuario, txtPassword, txtAplicacion, txtEstado, txtInicio, txtFinal);
        limpiar();
        initDesing();
    }

    private void llenarTabla() {
        modelo = data.consultar();
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserInicio = new com.raven.datechooser.DateChooser();
        dateChooserFinal = new com.raven.datechooser.DateChooser();
        pTabla = new com.sm.componet.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new com.sm.componet.TableCustom();
        pInput = new com.sm.componet.PanelRound();
        pPassword = new com.sm.componet.Panel();
        txtPassword = new com.sm.componet.TextFieldSuggestion();
        jlbPassword = new javax.swing.JLabel();
        pUsuario = new com.sm.componet.Panel();
        txtUsuario = new com.sm.componet.TextFieldSuggestion();
        jlbUsuario = new javax.swing.JLabel();
        pEstado = new com.sm.componet.Panel();
        txtEstado = new com.sm.componet.TextFieldSuggestion();
        jlbEstado = new javax.swing.JLabel();
        pAplicacion = new com.sm.componet.Panel();
        txtAplicacion = new com.sm.componet.TextFieldSuggestion();
        jlbAplicacion = new javax.swing.JLabel();
        pInicio = new com.sm.componet.Panel();
        txtInicio = new com.sm.componet.TextFieldSuggestion();
        jlbInicio = new javax.swing.JLabel();
        pFinal = new com.sm.componet.Panel();
        txtFinal = new com.sm.componet.TextFieldSuggestion();
        jlbFinal = new javax.swing.JLabel();

        dateChooserInicio.setTextRefernce(txtInicio);

        dateChooserFinal.setTextRefernce(txtFinal);

        setBackground(new java.awt.Color(30, 30, 30));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        pTabla.setBackground(new java.awt.Color(30, 30, 30));
        pTabla.setRoundBottomLeft(10);
        pTabla.setRoundBottomRight(10);
        pTabla.setRoundTopLeft(10);
        pTabla.setRoundTopRight(10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
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
        tabla.setColorBackGround1(com.sm.modelo.SystemConfig.BACKGROUND2);
        tabla.setColorBackGround2(com.sm.modelo.SystemConfig.BACKGROUND3);
        tabla.setColorSelected1(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        tabla.setColorSelected2(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pInput.setBackground(new java.awt.Color(35, 35, 35));
        pInput.setRoundBottomLeft(10);
        pInput.setRoundBottomRight(10);
        pInput.setRoundTopLeft(10);
        pInput.setRoundTopRight(10);

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
                .addGap(20, 20, 20)
                .addGroup(pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
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
                .addGap(20, 20, 20)
                .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pUsuarioLayout.setVerticalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pEstado.setBackground(new java.awt.Color(35, 35, 35));
        pEstado.setRoundBottomLeft(10);
        pEstado.setRoundBottomRight(10);
        pEstado.setRoundTopLeft(10);
        pEstado.setRoundTopRight(10);

        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setText("Estado");

        javax.swing.GroupLayout pEstadoLayout = new javax.swing.GroupLayout(pEstado);
        pEstado.setLayout(pEstadoLayout);
        pEstadoLayout.setHorizontalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pAplicacion.setBackground(new java.awt.Color(35, 35, 35));
        pAplicacion.setRoundBottomLeft(10);
        pAplicacion.setRoundBottomRight(10);
        pAplicacion.setRoundTopLeft(10);
        pAplicacion.setRoundTopRight(10);

        txtAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        txtAplicacion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbAplicacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jlbAplicacion.setText("Aplicacion");

        javax.swing.GroupLayout pAplicacionLayout = new javax.swing.GroupLayout(pAplicacion);
        pAplicacion.setLayout(pAplicacionLayout);
        pAplicacionLayout.setHorizontalGroup(
            pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAplicacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pAplicacionLayout.setVerticalGroup(
            pAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAplicacionLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbAplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
                .addGap(20, 20, 20)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pFinal.setBackground(new java.awt.Color(35, 35, 35));
        pFinal.setRoundBottomLeft(10);
        pFinal.setRoundBottomRight(10);
        pFinal.setRoundTopLeft(10);
        pFinal.setRoundTopRight(10);

        txtFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtFinal.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N

        jlbFinal.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbFinal.setForeground(new java.awt.Color(255, 255, 255));
        jlbFinal.setText("Final");

        javax.swing.GroupLayout pFinalLayout = new javax.swing.GroupLayout(pFinal);
        pFinal.setLayout(pFinalLayout);
        pFinalLayout.setHorizontalGroup(
            pFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFinalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jlbFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pFinalLayout.setVerticalGroup(
            pFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFinalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getClickCount() == 2) {
            limpiar();
        }
    }//GEN-LAST:event_formMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        filaSeleccionada = tabla.getSelectedRow();
        idCuenta = UIController.datoFilaColumna((DefaultTableModel) tabla.getModel(), filaSeleccionada, "ID").toString();
        setIdCuenta(idCuenta);
        SwingUtilities.getWindowAncestor(tabla).dispose();
    }//GEN-LAST:event_tablaMouseClicked

    private void limpiar() {
        llenarTabla();
        txtUsuario.setText("");
        txtPassword.setText("");
        txtAplicacion.setText("");
        txtEstado.setText("");
        txtInicio.setText("");
        txtFinal.setText("");
        filaSeleccionada = -1;
    }

    private void filtrar() {
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();
        String aplicacion = txtAplicacion.getText();
        String estado = txtEstado.getText();
        String fechaInicio = txtInicio.getText();
        String fechaFinal = txtFinal.getText();
        String nombresColumnas[] = {"Usuario", "Password", "Aplicacion", "Estado", "Inicio", "Final"};
        String datosFiltrar[] = {usuario, password, aplicacion, estado, fechaInicio, fechaFinal};
        tabla.setModel(FiltroTabla.filterTable(modelo, datosFiltrar, nombresColumnas));
    }

    private void detectarCambios(JTextField... textFields) {
        for (JTextField text : textFields) {
            text.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    filtrar();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    filtrar();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    filtrar();
                }
            }
            );
        }
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    private void cargarJSONReferencias() {
        //https://chat.openai.com/share/52d1c214-4cf3-48e2-ac31-10adb5d5a264
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(new File("config/backup/Configuracion/StreamingReferencias.json"));
            Iterator<String> fieldNames = rootNode.fieldNames();
            while (fieldNames.hasNext()) {
                String fieldName = fieldNames.next();
                txtAplicacion.addItemSuggestion(fieldName);
            }
        } catch (IOException e) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooserFinal;
    private com.raven.datechooser.DateChooser dateChooserInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbAplicacion;
    private javax.swing.JLabel jlbEstado;
    private javax.swing.JLabel jlbFinal;
    private javax.swing.JLabel jlbInicio;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbUsuario;
    private com.sm.componet.Panel pAplicacion;
    private com.sm.componet.Panel pEstado;
    private com.sm.componet.Panel pFinal;
    private com.sm.componet.Panel pInicio;
    private com.sm.componet.PanelRound pInput;
    private com.sm.componet.Panel pPassword;
    private com.sm.componet.PanelRound pTabla;
    private com.sm.componet.Panel pUsuario;
    private com.sm.componet.TableCustom tabla;
    private com.sm.componet.TextFieldSuggestion txtAplicacion;
    private com.sm.componet.TextFieldSuggestion txtEstado;
    private com.sm.componet.TextFieldSuggestion txtFinal;
    private com.sm.componet.TextFieldSuggestion txtInicio;
    private com.sm.componet.TextFieldSuggestion txtPassword;
    private com.sm.componet.TextFieldSuggestion txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this);
        BACKGROUND2(pAplicacion, pEstado, pFinal, pInicio, pInput, pPassword, pTabla, pUsuario);
        TEXT1(txtAplicacion, txtEstado, txtFinal, txtInicio, txtPassword, txtUsuario);
        TEXT1(jlbAplicacion, jlbEstado, jlbFinal, jlbInicio, jlbPassword, jlbUsuario);
    }

}
