package com.sm.frm;

import com.sm.utils.UIController;
import javax.swing.JLabel;
import static com.sm.modelo.SystemConfig.*;

public class TarjetaCredito extends javax.swing.JPanel {

    private String tarjet_bin = "1234567890123456";
    private String tarjet_aplicacion = "Aplicacion+";
    private String tarjet_cvv = "123";
    private String tarjet_dateMes = "00";
    private String tarjet_dateAnio = "00";
    private String tarjet_zip = "12345";
    private String tarjet_urlImagenTarjeta = "config/resources/img/logosTarjeta/visa.png";

    public TarjetaCredito() {
        initComponents();
        this.setOpaque(false);
        paint();
        initDesing();
    }

    private void paint() {
        txtAplicacion.setText(tarjet_aplicacion);
        txtCVV.setText(tarjet_cvv);
        if (tarjet_dateMes.equalsIgnoreCase("random") && tarjet_dateAnio.equalsIgnoreCase("random")) {
            txtFechaVencimiento.setText("Random");
        } else {
            txtFechaVencimiento.setText(tarjet_dateMes + "/" + tarjet_dateAnio);
        }
        txtZip.setText(tarjet_zip);
        txtBin.setText(tarjet_bin);
        remplazarNumerosEnLabel(tarjet_bin, txtBin);
        logoTarjeta.setImage(UIController.imagenIcon(tarjet_urlImagenTarjeta));
        loadFonts();
    }

    private void loadFonts() {

        UIController.applyCustomFont(txtBin, "config/resources/fuentes/OPTIBankGothic-Medium.otf", 22);
        UIController.applyCustomFont(txtAplicacion, "config/resources/fuentes/zing-rust-demo-base.otf", 20);
        UIController.applyCustomFont(txtCVV, "config/resources/fuentes/GlacialIndifference-Regular.otf", 20);
        UIController.applyCustomFont(txtFechaVencimiento, "config/resources/fuentes/GlacialIndifference-Regular.otf", 17);
        UIController.applyCustomFont(txtZip, "config/resources/fuentes/GlacialIndifference-Regular.otf", 16);

        UIController.applyCustomFont(jlbCvv, "config/resources/fuentes/GlacialIndifference-Regular.otf", 20);
        UIController.applyCustomFont(jlbZip, "config/resources/fuentes/GlacialIndifference-Bold.otf", 16);

        jlbValidoHasta.setText("<html><div style='text-align: center;'>Valido<br>hasta</div></html>");

//        bandera.setImage(UIController.cargarImagenInternet("https://flagsapi.com/BE/flat/64.png"));
    }

    private void remplazarNumerosEnLabel(String numerosTexto, JLabel label) {
        // Si el texto tiene menos de 16 caracteres, completamos con X
        label.setText(tarjet_bin);
        if (numerosTexto.length() < 16) {
            numerosTexto += "XXXXXXXXXXXXXXXX".substring(numerosTexto.length());
        }
        // Creamos un StringBuilder para construir el nuevo texto del JLabel
        StringBuilder nuevoTexto = new StringBuilder();
        int indexNumeros = 0;
        for (char c : "XXXX  XXXX  XXXX  XXXX".toCharArray()) {
            if (c == 'X') {
                // Si encontramos una X, la reemplazamos con el siguiente número
                nuevoTexto.append(numerosTexto.charAt(indexNumeros));
                indexNumeros++;
            } else {
                // Si no es una X, mantenemos el carácter original
                nuevoTexto.append(c);
            }
        }
        // Establecemos el nuevo texto en el JLabel
        label.setText(nuevoTexto.toString());
    }

    public String getTarjet_bin() {
        return tarjet_bin;
    }

    public void setTarjet_bin(String tarjet_bin) {
        this.tarjet_bin = tarjet_bin;
        paint();
    }

    public String getTarjet_aplicacion() {
        return tarjet_aplicacion;
    }

    public void setTarjet_aplicacion(String tarjet_aplicacion) {
        this.tarjet_aplicacion = tarjet_aplicacion;
        paint();
    }

    public String getTarjet_cvv() {
        return tarjet_cvv;
    }

    public void setTarjet_cvv(String tarjet_cvv) {
        this.tarjet_cvv = tarjet_cvv;
        paint();
    }

    public String getTarjet_dateMes() {
        return tarjet_dateMes;
    }

    public void setTarjet_dateMes(String tarjet_dateMes) {
        this.tarjet_dateMes = tarjet_dateMes;
        paint();
    }

    public String getTarjet_dateAnio() {
        return tarjet_dateAnio;
    }

    public void setTarjet_dateAnio(String tarjet_dateAnio) {
        this.tarjet_dateAnio = tarjet_dateAnio;
        paint();
    }

    public String getTarjet_zip() {
        return tarjet_zip;
    }

    public void setTarjet_zip(String tarjet_zip) {
        this.tarjet_zip = tarjet_zip;
        paint();
    }

    public String getTarjet_urlImagenTarjeta() {
        return tarjet_urlImagenTarjeta;
    }

    public void setTarjet_urlImagenTarjeta(String tarjet_urlImagenTarjeta) {
        this.tarjet_urlImagenTarjeta = tarjet_urlImagenTarjeta;
        paint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.sm.componet.PanelRound();
        fondo = new com.sm.componet.Imagen();
        txtBin = new javax.swing.JLabel();
        txtAplicacion = new javax.swing.JLabel();
        jlbValidoHasta = new javax.swing.JLabel();
        txtFechaVencimiento = new javax.swing.JLabel();
        txtZip = new javax.swing.JLabel();
        jlbZip = new javax.swing.JLabel();
        txtCVV = new javax.swing.JLabel();
        jlbCvv = new javax.swing.JLabel();
        logoTarjeta = new com.sm.componet.Imagen();

        panelRound1.setBackground(new java.awt.Color(30, 30, 30));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        fondo.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/sm/img/fonoTarjeta1.png"))); // NOI18N

        txtBin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtBin.setForeground(new java.awt.Color(255, 255, 255));
        txtBin.setText("XXXX  XXXX  XXXX  XXXX");
        fondo.add(txtBin);
        txtBin.setBounds(60, 130, 370, 50);

        txtAplicacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        txtAplicacion.setText("Disney +");
        fondo.add(txtAplicacion);
        txtAplicacion.setBounds(30, 190, 170, 23);

        jlbValidoHasta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlbValidoHasta.setForeground(new java.awt.Color(255, 255, 255));
        jlbValidoHasta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbValidoHasta.setText("Valido hasta");
        fondo.add(jlbValidoHasta);
        jlbValidoHasta.setBounds(190, 190, 60, 60);

        txtFechaVencimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFechaVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaVencimiento.setText("12/09");
        fondo.add(txtFechaVencimiento);
        txtFechaVencimiento.setBounds(260, 210, 120, 20);

        txtZip.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtZip.setForeground(new java.awt.Color(255, 255, 255));
        txtZip.setText("10020");
        fondo.add(txtZip);
        txtZip.setBounds(400, 20, 60, 20);

        jlbZip.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbZip.setForeground(new java.awt.Color(255, 255, 255));
        jlbZip.setText("ZIP:");
        fondo.add(jlbZip);
        jlbZip.setBounds(360, 20, 40, 20);

        txtCVV.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(255, 255, 255));
        txtCVV.setText("Random");
        fondo.add(txtCVV);
        txtCVV.setBounds(80, 220, 90, 20);

        jlbCvv.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbCvv.setForeground(new java.awt.Color(255, 255, 255));
        jlbCvv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCvv.setText("CVV");
        fondo.add(jlbCvv);
        jlbCvv.setBounds(30, 220, 50, 20);
        fondo.add(logoTarjeta);
        logoTarjeta.setBounds(360, 200, 90, 50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initDesing() {
        BACKGROUND3(panelRound1);
        TEXT1(txtBin, txtAplicacion, jlbValidoHasta, txtFechaVencimiento, txtZip, jlbZip, txtCVV, jlbCvv);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.sm.componet.Imagen fondo;
    private javax.swing.JLabel jlbCvv;
    private javax.swing.JLabel jlbValidoHasta;
    private javax.swing.JLabel jlbZip;
    private com.sm.componet.Imagen logoTarjeta;
    private com.sm.componet.PanelRound panelRound1;
    private javax.swing.JLabel txtAplicacion;
    private javax.swing.JLabel txtBin;
    private javax.swing.JLabel txtCVV;
    private javax.swing.JLabel txtFechaVencimiento;
    private javax.swing.JLabel txtZip;
    // End of variables declaration//GEN-END:variables

}
