package com.sm.controladores;

import com.glasspanepopup.GlassPanePopup;
import com.sm.frm.frmDasboard;
import com.sm.frm.mdlHitsOpenBullet;
import com.sm.utils.UIController;
import java.util.ArrayList;
import com.sm.frm.mdlInicio;
import com.sm.frm.mdlVistaConvertHits;
import com.sm.utils.Action;
import com.sm.frm.mdlBins;
import com.sm.frm.mdlComboList;
import com.sm.frm.mdlConfig;
import com.sm.frm.mdlConfiguracion;
import com.sm.frm.mdlCuentas;
import com.sm.frm.mdlEnvioCorreo;
import com.sm.frm.mdlUsuarios;
import com.sm.frm.mdlVentaCuenta;
import com.sm.frm.ventanaContact;
import java.awt.Point;
import javax.swing.JPanel;
import static com.sm.modelo.SystemConfig.*;

public class CPrincipal {

    private frmDasboard c;
    private ArrayList<JPanel> modulos;

    public CPrincipal(frmDasboard c) {
        this.c = c;
    }

    public void initDiseño() {
//        UIController.MostrarPanel(c.CONTENEDOR, new com.sm.frm.mdlInicio());
        UIController.removerBordeBlanco(c.Scroll);
        GlassPanePopup.install(c);
        c.setLocationRelativeTo(null);
        c.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/sm/img/icono3.png")));
        eventoSeleccion();
        initDesing();
//        initAcciones();
    }

    private void initDesing() {
        BACKGROUND1(c.jPanel1, c.menu, c.CONTENEDOR);
    }

    private void eventoSeleccion() {
        c.menu.addEvent((int index, int indexSubMenu) -> {
            c.Scroll.getViewport().setViewPosition(new Point(0, 0));
            switch (index) {
                case 0://DashBoard
                    Action.cargar(() -> {
                        UIController.MostrarPanel(c.CONTENEDOR, new mdlInicio());
                    });
                    break;
                case 1:
                    Action.cargar(() -> {
                        UIController.ventanaEmergente(c, new mdlEnvioCorreo(), "Enviar Correo", 454, 584);
                    });
                    break;
                case 2:
                    switch (indexSubMenu) {
                        case 1:
                            Action.cargar(() -> {
                                UIController.MostrarPanel(c.CONTENEDOR, new mdlHitsOpenBullet());
                            });
                            break;
                        case 2:
                            UIController.ventanaEmergente(c, new mdlComboList(), "Mis ComboList", 511, 647);
                            break;
                        case 3:
                            UIController.ventanaEmergente(c, new mdlConfig(), "Mis Configs", 511, 647);
                            break;
                    }
                    break;
                case 3:
                    switch (indexSubMenu) {
                        case 1:
                            Action.cargar(() -> {
                                UIController.MostrarPanel(c.CONTENEDOR, new mdlVistaConvertHits());
                            });
                            break;
                        case 2:
                            Action.cargar(() -> {
                                UIController.MostrarPanel(c.CONTENEDOR, new mdlCuentas());
                            });
                            break;
                    }
                    break;
                case 4:
                    Action.cargar(() -> {
                        UIController.MostrarPanel(c.CONTENEDOR, new mdlBins());
                    });
                    break;
                case 5:
                    Action.cargar(() -> {
                        UIController.MostrarPanel(c.CONTENEDOR, new mdlVentaCuenta());
                    });
                    break;
                case 6:
                    Action.cargar(() -> {
                        UIController.MostrarPanel(c.CONTENEDOR, new mdlUsuarios());
                    });
                    break;
                case 7:
                    switch (indexSubMenu) {
                        case 1:

                            break;
                        case 2:

                            break;
                    }
                    break;
                case 8:
                    Action.cargar(() -> {
                        UIController.MostrarPanel(c.CONTENEDOR, new mdlConfiguracion());
                    });
                    break;
                case 9:
                    ventanaContact obj = new ventanaContact();
                    GlassPanePopup.showPopup(obj);
                    break;
                case 10:
                    cerrar();
                    break;
            }
            System.out.println("Modulo: " + index + " - Item: " + indexSubMenu);

        });
        c.menu.setSelectedIndex(0, 0);
    }

    public void cerrar() {
        Action.msjC(() -> System.exit(0), "Confirmar cierre del programa");
    }
}
