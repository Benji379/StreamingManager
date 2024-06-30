package com.sm.controladores;

import com.sm.frm.ColorChosser;
import com.sm.frm.frmDasboard;
import com.sm.frm.mdlConfiguracion;
import com.sm.utils.Action;
import com.sm.utils.Data;
import com.sm.utils.UIController;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CConfiguracion {

    mdlConfiguracion c;

    public CConfiguracion(mdlConfiguracion c) {
        this.c = c;
    }

    public void init() {
        UIController.scrollInvisible(c.jScrollPane1);
        leerDatos();
    }

    public void btnGuardar() {
        Action.msjC(() -> guardarDatos(), "Guardar Configuracion");
    }

    private void guardarDatos() {
        String colorPrincipal1 = c.ccPrincipal1.getColorHexa();
        String colorPrincipal2 = c.ccPrincipal2.getColorHexa();
        String colorPrincipal3 = c.ccPrincipal3.getColorHexa();

        String colorBackground1 = c.ccBackground1.getColorHexa();
        String colorBackground2 = c.ccBackground2.getColorHexa();
        String colorBackground3 = c.ccBackground3.getColorHexa();

        String colorTexto1 = c.ccTexto1.getColorHexa();
        String colorTexto2 = c.ccTexto2.getColorHexa();

        String colorBoton1 = c.ccBoton1.getColorHexa();
        String colorBoton2 = c.ccBoton2.getColorHexa();

        String colorSelect1 = c.ccSelect1.getColorHexa();
        String colorSelect2 = c.ccSelect2.getColorHexa();

        Data.modificarDato("color", "principal1", colorPrincipal1);
        Data.modificarDato("color", "principal2", colorPrincipal2);
        Data.modificarDato("color", "principal3", colorPrincipal3);

        Data.modificarDato("color", "background1", colorBackground1);
        Data.modificarDato("color", "background2", colorBackground2);
        Data.modificarDato("color", "background3", colorBackground3);

        Data.modificarDato("color", "text1", colorTexto1);
        Data.modificarDato("color", "text2", colorTexto2);

        Data.modificarDato("color", "button1", colorBoton1);
        Data.modificarDato("color", "button2", colorBoton2);

        Data.modificarDato("color", "select1", colorSelect1);
        Data.modificarDato("color", "select2", colorSelect2);

        String tokenGroup = c.txtTokenGroup.getText();
        String correo = c.txtCorreo.getText();
        String tokenCorreo = c.txtTokenCorreo.getText();

        Data.modificarDato("group", "token-group", tokenGroup);
        Data.modificarDato("correo", "direccion", correo);
        Data.modificarDato("correo", "token", tokenCorreo);
        
        revalidarColores();
        closeAndOpenNewFrame();
    }

    private void closeAndOpenNewFrame() {
        // Acceder al JFrame contenedor
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(c);
        if (parentFrame != null) {
            parentFrame.dispose(); // Cierra el JFrame actual

            // Crear y mostrar un nuevo JFrame
            SwingUtilities.invokeLater(() -> {
                frmDasboard abrir = new frmDasboard();
                abrir.setVisible(true);
            });
        }
    }

    private void leerDatos() {

        String colorPrincipal1 = Data.leerDato("color", "principal1");
        String colorPrincipal2 = Data.leerDato("color", "principal2");
        String colorPrincipal3 = Data.leerDato("color", "principal3");

        String colorBackground1 = Data.leerDato("color", "background1");
        String colorBackground2 = Data.leerDato("color", "background2");
        String colorBackground3 = Data.leerDato("color", "background3");

        String colorTexto1 = Data.leerDato("color", "text1");
        String colorTexto2 = Data.leerDato("color", "text2");

        String colorBoton1 = Data.leerDato("color", "button1");
        String colorBoton2 = Data.leerDato("color", "button2");

        String colorSelect1 = Data.leerDato("color", "select1");
        String colorSelect2 = Data.leerDato("color", "select2");

        asignarColor(c.ccPrincipal1, colorPrincipal1);
        asignarColor(c.ccPrincipal2, colorPrincipal2);
        asignarColor(c.ccPrincipal3, colorPrincipal3);

        asignarColor(c.ccBackground1, colorBackground1);
        asignarColor(c.ccBackground2, colorBackground2);
        asignarColor(c.ccBackground3, colorBackground3);

        asignarColor(c.ccTexto1, colorTexto1);
        asignarColor(c.ccTexto2, colorTexto2);

        asignarColor(c.ccBoton1, colorBoton1);
        asignarColor(c.ccBoton2, colorBoton2);

        asignarColor(c.ccSelect1, colorSelect1);
        asignarColor(c.ccSelect2, colorSelect2);

        c.txtCorreo.setText(Data.leerDato("correo", "direccion"));
        c.txtTokenCorreo.setText(Data.leerDato("correo", "token"));

        c.txtTokenGroup.setText(Data.leerDato("group", "token-group"));
    }

    private void asignarColor(ColorChosser co, String color) {
        co.txtColor.setText(color);
        co.setColorSelect(Color.decode(color));
    }

    private void revalidarColores() {
        
//        SystemConfig.MAIN_COLOR_1 = Color.decode(leerDato("color", "principal1"));
//        SystemConfig.MAIN_COLOR_2 = Color.decode(leerDato("color", "principal2"));
//        SystemConfig.MAIN_COLOR_3 = Color.decode(leerDato("color", "principal3"));
//
//        SystemConfig.BOTON1 = Color.decode(leerDato("color", "button1"));
//        SystemConfig.BOTON2 = Color.decode(leerDato("color", "button2"));
//
//        SystemConfig.TEXT1 = Color.decode(leerDato("color", "text1"));
//        SystemConfig.TEXT2 = Color.decode(leerDato("color", "text2"));
//
//        SystemConfig.SELECT1 = Color.decode(leerDato("color", "select1"));
//        SystemConfig.SELECT2 = Color.decode(leerDato("color", "select2"));
//
//        SystemConfig.BACKGROUND1 = Color.decode(leerDato("color", "background1"));
//        SystemConfig.BACKGROUND2 = Color.decode(leerDato("color", "background2"));
//        SystemConfig.BACKGROUND3 = Color.decode(leerDato("color", "background3"));
//
//        SystemConfig.CORREO = leerDato("correo", "direccion");
//        SystemConfig.TOKEN_CORREO = leerDato("correo", "token");

    }

}
