package com.sm.frm;

import com.sm.utils.CombinacionesTexto;
import com.sm.utils.UIController;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import static com.sm.modelo.SystemConfig.*;

public class ventanaMisCorreos extends javax.swing.JPanel {

    public ventanaMisCorreos() {
        initComponents();
        detectarCambios(txtCantidad, txtCorreo);
        UIController.scrollInvisible(jScrollPane1);
        initDesing();
    }

    private void detectarCambios(JTextField... textFields) {
        for (JTextField text : textFields) {
            text.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    generarCombinaciones();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    generarCombinaciones();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    generarCombinaciones();
                }
            }
            );
        }
    }

    private void existentes() {
        String direccion = txtCorreo.getText();
        CombinacionesTexto com = new CombinacionesTexto(direccion);
        txtExistentes.setText("Existentes: " + com.calcularCantidadCombinaciones());
    }

    private void generarCombinaciones() {
        existentes();
        try {
            String direccion = txtCorreo.getText();
            CombinacionesTexto com = new CombinacionesTexto(direccion);
            String cantidad = txtCantidad.getText();
            int cant = Integer.parseInt(cantidad);
            ArrayList<String> lis = com.generarCombinaciones(cant);
            txtExistentes.setText("Existentes: " + com.calcularCantidadCombinaciones());
            imprimirTabla(lis);
        } catch (NumberFormatException e) {
        }
    }

    private void verificarCantidad(java.awt.event.KeyEvent evt) {
        try {
            String direccion = txtCorreo.getText();
            CombinacionesTexto com = new CombinacionesTexto(direccion);
            String cantidad = txtCantidad.getText();
            int cantDisponible = com.calcularCantidadCombinaciones(); // 9
            int cant = Integer.parseInt(cantidad);
            if (cant > cantDisponible) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
        }
    }

    private void imprimirTabla(ArrayList<String> lista) {
        DefaultTableModel mol = (DefaultTableModel) tabla.getModel();
        mol.setRowCount(0);
        Object datos[] = new Object[2];
        int i = 0;
        for (String k : lista) {
            i++;
            datos[0] = i;
            datos[1] = k + "@gmail.com";
            mol.addRow(datos);
        }
        tabla.setModel(mol);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        pTabla = new com.sm.componet.PanelCustom();
        jScrollPane1 = new com.benjiBK.scroll.ScrollPaneWin11();
        tabla = new com.sm.componet.TableCustom();
        pInput = new com.sm.componet.PanelCustom();
        pCant = new com.sm.componet.Panel();
        txtCantidad = new com.sm.componet.TextFieldSuggestion();
        jlbCant = new javax.swing.JLabel();
        pCorreo = new com.sm.componet.Panel();
        txtCorreo = new com.sm.componet.TextFieldSuggestion();
        jlbCorreo = new javax.swing.JLabel();
        txtExistentes = new javax.swing.JLabel();

        pFondo.setBackground(new java.awt.Color(30, 30, 30));

        pTabla.setBackground(new java.awt.Color(30, 30, 30));
        pTabla.setShadowColor(new java.awt.Color(0, 0, 0));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Correos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setColorBackGround1(com.sm.modelo.SystemConfig.BACKGROUND1);
        tabla.setColorBackGround2(com.sm.modelo.SystemConfig.BACKGROUND2);
        tabla.setColorSelected1(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        tabla.setColorSelected2(com.sm.modelo.SystemConfig.MAIN_COLOR_1);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(60);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabla.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pInput.setBackground(new java.awt.Color(30, 30, 30));
        pInput.setShadowColor(new java.awt.Color(0, 0, 0));

        pCant.setBackground(new java.awt.Color(30, 30, 30));
        pCant.setRoundBottomLeft(10);
        pCant.setRoundBottomRight(10);
        pCant.setRoundTopLeft(10);
        pCant.setRoundTopRight(10);

        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jlbCant.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbCant.setForeground(new java.awt.Color(255, 255, 255));
        jlbCant.setText("Cant");

        javax.swing.GroupLayout pCantLayout = new javax.swing.GroupLayout(pCant);
        pCant.setLayout(pCantLayout);
        pCantLayout.setHorizontalGroup(
            pCantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCantLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbCant, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
            .addGroup(pCantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pCantLayout.setVerticalGroup(
            pCantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCantLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbCant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pCorreo.setBackground(new java.awt.Color(30, 30, 30));
        pCorreo.setRoundBottomLeft(10);
        pCorreo.setRoundBottomRight(10);
        pCorreo.setRoundTopLeft(10);
        pCorreo.setRoundTopRight(10);

        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        jlbCorreo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCorreo.setText("Correo");

        txtExistentes.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        txtExistentes.setForeground(new java.awt.Color(255, 255, 255));
        txtExistentes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtExistentes.setText("Existentes: 0");

        javax.swing.GroupLayout pCorreoLayout = new javax.swing.GroupLayout(pCorreo);
        pCorreo.setLayout(pCorreoLayout);
        pCorreoLayout.setHorizontalGroup(
            pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCorreoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addComponent(txtExistentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pCorreoLayout.setVerticalGroup(
            pCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCorreoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExistentes))
        );

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(pCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        UIController.limitacionCaracteres(txtCorreo, evt, 100, false);
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        verificarCantidad(evt);
        UIController.limitacionNumeros(txtCantidad, evt, 6);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyPressed

    int filaSeleccionada = -1;
    private String correo;

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        filaSeleccionada = tabla.getSelectedRow();
        correo = UIController.datoFilaColumna(tabla, filaSeleccionada, "Correos").toString();
        SwingUtilities.getWindowAncestor(tabla).dispose();
    }//GEN-LAST:event_tablaMouseClicked

    public String getCorreo() {
        return correo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbCant;
    private javax.swing.JLabel jlbCorreo;
    private com.sm.componet.Panel pCant;
    private com.sm.componet.Panel pCorreo;
    private javax.swing.JPanel pFondo;
    private com.sm.componet.PanelCustom pInput;
    private com.sm.componet.PanelCustom pTabla;
    private com.sm.componet.TableCustom tabla;
    private com.sm.componet.TextFieldSuggestion txtCantidad;
    private com.sm.componet.TextFieldSuggestion txtCorreo;
    private javax.swing.JLabel txtExistentes;
    // End of variables declaration//GEN-END:variables

    private void initDesing() {
        BACKGROUND1(this, pFondo);
        BACKGROUND2(pInput, pTabla, pCant, pCorreo);
        TEXT1(txtCantidad, txtCorreo, txtExistentes);
        TEXT1(jlbCant, jlbCorreo);
    }

}
