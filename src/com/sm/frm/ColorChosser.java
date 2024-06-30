package com.sm.frm;

import com.sm.utils.Action;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ColorChosser extends com.sm.componet.PanelCustom {

    private String titulo = "Titulo";
    private Color colorSelect = new Color(255, 255, 255);
//    private Color colorBackground = new Color(30, 30, 30);
    private Color colorBackground = com.sm.modelo.SystemConfig.BACKGROUND1;
    private Color colorSombra = new Color(0, 0, 0);
    private int redondear = 10;
    private JComponent componet = null;

    public ColorChosser() {
        initComponents();
        detectarCambios();
        paint();
    }

    private void paint() {
        txtTittle.setText(titulo);
        btnColor.setBackground(colorSelect);
        setBackground(colorBackground);
        setRound(redondear);
        setShadowColor(colorSombra);
        String co = colorToHexString(colorSelect);
        System.out.println(co);
//        txtColor.setText(co);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnColor = new com.sm.componet.Button();
        txtColor = new com.sm.componet.TextFieldSuggestion();
        txtTittle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setShadowColor(new java.awt.Color(0, 0, 0));

        btnColor.setBackground(new java.awt.Color(0, 204, 0));
        btnColor.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColor.setRound(50);
        btnColor.setShadowColor(new java.awt.Color(0, 0, 0));
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        txtColor.setForeground(new java.awt.Color(255, 255, 255));
        txtColor.setText("#00000");
        txtColor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        txtTittle.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        txtTittle.setForeground(com.sm.modelo.SystemConfig.TEXT1);
        txtTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTittle.setText("sdasadddddddddd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtTittle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        String colorString = Action.getColorHexString(titulo, btnColor.getBackground());
        if (colorString != null) {
            colorSelect = Color.decode(colorString);
            btnColor.setBackground(colorSelect);
            txtColor.setText(colorString);
        }
    }//GEN-LAST:event_btnColorActionPerformed

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        int key = evt.getKeyChar();
        boolean esLetraONumero = Character.isLetterOrDigit(key) || key == KeyEvent.VK_SPACE;
        boolean esNumeral = key == '#';
        boolean esValido = esLetraONumero || (esNumeral && txtColor.getText().isEmpty());

        String colorEscritoo = txtColor.getText();
        if (txtColor.getText().length() > 0) {
            char primeraLetraa = colorEscritoo.charAt(0);
            boolean condicion = (primeraLetraa == '#');
            if (condicion) {
                if (!esValido) {
                    evt.consume();
                } else {
                    String colorEscrito = txtColor.getText();
                    if (colorEscrito.length() > 0) {
                        char primeraLetra = colorEscrito.charAt(0);
                        if (primeraLetra == '#') {
                            if (colorEscrito.length() >= 7 || !Character.isLetterOrDigit(key)) {
                                evt.consume();
                            }
                        }
                    } else {
                        if (!esNumeral) {
                            evt.consume();
                        }
                    }
                }
            } else {
                if (colorEscritoo.length() < 6) {
                } else {
                    evt.consume();
                }
            }

        }

    }//GEN-LAST:event_txtColorKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.sm.componet.Button btnColor;
    public com.sm.componet.TextFieldSuggestion txtColor;
    public javax.swing.JLabel txtTittle;
    // End of variables declaration//GEN-END:variables

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        paint();
    }

    public Color getColorSelect() {
        return colorSelect;
    }

    public void setColorSelect(Color colorSelect) {
        this.colorSelect = colorSelect;
        paint();
    }

    public String getColorHexa() {
        return colorToHexString(colorSelect);
    }

    private String colorToHexString(Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }

    public Color getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(Color colorBackground) {
        this.colorBackground = colorBackground;
        paint();
    }

    public int getRedondear() {
        return redondear;
    }

    public void setRedondear(int redondear) {
        this.redondear = redondear;
        paint();
    }

    public Color getColorSombra() {
        return colorSombra;
    }

    public void setColorSombra(Color colorSombra) {
        this.colorSombra = colorSombra;
        paint();
    }

    private void detectarCambios() {
        txtColor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                imprimirColor();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                imprimirColor();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                imprimirColor();
            }
        }
        );
    }

    private void imprimirColor() {
        try {
            String colorEscrito = txtColor.getText();
            if (colorEscrito.length() > 0) {
                char primeraLetra = colorEscrito.charAt(0);
                if (primeraLetra == '#' && colorEscrito.length() == 7) {
                    colorSelect = Color.decode(colorEscrito);
                    paint();
                } else {
                    if (primeraLetra != '#' && colorEscrito.length() == 6) {
                        colorSelect = Color.decode("#" + colorEscrito);
                        paint();
                    }
                }
            }
        } catch (NumberFormatException e) {
        }
    }

    public JComponent getComponet() {
        return componet;
    }

    public void setComponet(JComponent componet) {
        this.componet = componet;
    }

}
