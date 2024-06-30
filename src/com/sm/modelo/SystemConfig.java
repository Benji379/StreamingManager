package com.sm.modelo;

import com.sm.componet.Button;
import com.sm.utils.JSONDataOnline;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComponent;

public interface SystemConfig {

    //com.sm.modelo.SystemConfig.MAIN_COLOR_1
    public final static Color MAIN_COLOR_1 = Color.decode("#157f0d");
    public final static Color MAIN_COLOR_2 = Color.decode("#10660a");
    public final static Color MAIN_COLOR_3 = Color.decode("#0b4e07");
    //com.sm.modelo.SystemConfig.BOTON1
    public final static Color BOTON1 = Color.decode("#ffffff");
    public final static Color BOTON2 = Color.decode("#232323");
    //com.sm.modelo.SystemConfig.TEXT1
    public final static Color TEXT1 = Color.decode("#ffffff");
    public final static Color TEXT2 = Color.decode("#000000");
    //com.sm.modelo.SystemConfig.SELECT1
    public final static Color SELECT1 = Color.decode("#157f0d");//0B4E07
    public final static Color SELECT2 = Color.decode("#000000");
    //com.sm.modelo.SystemConfig.BACKGROUND1
    public final static Color BACKGROUND1 = Color.decode("#1E1E1E");
    public final static Color BACKGROUND2 = Color.decode("#232323");
    public final static Color BACKGROUND3 = Color.decode("#282828");

    public final static String CORREO = "";
    public final static String TOKEN_CORREO = "";

    public final static String IP = "";
    public final static String HOST = "";
    public final static String USUARIO = "";
    public final static String TOKEN_USUARIO = "";

    public final static String TOKEN_GROUP = "";
    public final static int SESION = 0;
    public final static JSONDataOnline DATA_ONLINE = new JSONDataOnline();
    public final static int ID_GRUPO = 1;
    
//===========================================================================================
//===========================================================================================
//    public static Color MAIN_COLOR_1 = Color.decode(leerDato("color", "principal1"));
//    public static Color MAIN_COLOR_2 = Color.decode(leerDato("color", "principal2"));
//    public static Color MAIN_COLOR_3 = Color.decode(leerDato("color", "principal3"));
//    //com.sm.modelo.SystemConfig.BOTON1
//    public static Color BOTON1 = Color.decode(leerDato("color", "button1"));
//    public static Color BOTON2 = Color.decode(leerDato("color", "button2"));
//    //com.sm.modelo.SystemConfig.TEXT1
//    public static Color TEXT1 = Color.decode(leerDato("color", "text1"));
//    public static Color TEXT2 = Color.decode(leerDato("color", "text2"));
//    //com.sm.modelo.SystemConfig.SELECT1
//    public static Color SELECT1 = Color.decode(leerDato("color", "select1"));
//    public static Color SELECT2 = Color.decode(leerDato("color", "select2"));
//    //com.sm.modelo.SystemConfig.BACKGROUND1
//    public static Color BACKGROUND1 = Color.decode(leerDato("color", "background1"));
//    public static Color BACKGROUND2 = Color.decode(leerDato("color", "background2"));
//    public static Color BACKGROUND3 = Color.decode(leerDato("color", "background3"));
//
//    public static String CORREO = leerDato("correo", "direccion");
//    public static String TOKEN_CORREO = leerDato("correo", "token");
//
//    public static String IP = getIP();
//
//    public static String HOST = getHost();
//    public static String USUARIO = leerDato("correo", "direccion");
//    public static String TOKEN_USUARIO = leerDato("correo", "direccion");
//
//    public static String TOKEN_GROUP = leerDato("correo", "direccion");
//    public static int SESION = 0;

    public static void TEXT1(JComponent... componet) {
        for (JComponent c : componet) {
            c.setForeground(TEXT1);
        }
    }

    public static void TEXT2(JComponent... componet) {
        for (JComponent c : componet) {
            c.setForeground(TEXT2);
        }
    }

    public static void BACKGROUND1(JComponent... componet) {
        for (JComponent c : componet) {
            c.setBackground(BACKGROUND1);
        }
    }

    public static void BACKGROUND2(JComponent... componet) {
        for (JComponent c : componet) {
            c.setBackground(BACKGROUND2);
        }
    }

    public static void BACKGROUND3(JComponent... componet) {
        for (JComponent c : componet) {
            c.setBackground(BACKGROUND2);
        }
    }

    public static void BOTON1(Button... button) {
        for (Button b : button) {
            b.setBackground(BOTON1);
        }
    }

    public static void BOTON2(Button... button) {
        for (Button b : button) {
            b.setBackground(BOTON2);
        }
    }

}
