package com.sm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;
import static com.sm.utils.Encriptador.*;

public class ConexionSQL {

    public Connection conexion() {
        Connection conectar = null;
        Properties properties = new Properties();

        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("com/sm/dao/config.properties");
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return null;
            }

            // load a properties file
            properties.load(input);

            String clave = "asdkkdsalkasdkalsdkamskxl";
            String url = desencriptar(properties.getProperty("db.url"), clave);
            String user = desencriptar(properties.getProperty("db.user"), clave);
            String password = desencriptar(properties.getProperty("db.password"), clave);
            System.out.println(url);
            System.out.println(user);
            System.out.println(password);
            Class.forName("org.postgresql.Driver");

            conectar = DriverManager.getConnection(url, user, password);
//          conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/streamingmanager", "root", "");
        } catch (ClassNotFoundException | SQLException | IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return conectar;
    }

    public static void main(String[] args) throws Exception {
        ConexionSQL con = new ConexionSQL();
        if (con.conexion() == null) {
            System.out.println("NO UBO CONEXION");
        } else {
            System.out.println("CONEXION EXITOSA");
        }
    }

}
