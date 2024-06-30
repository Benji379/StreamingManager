package com.sm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class ConexionBot {

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

            String url = properties.getProperty("db.url_bot");
            String user = properties.getProperty("db.user_bot");
            String password = properties.getProperty("db.password_bot");
            Class.forName("org.postgresql.Driver");

            conectar = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException | IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return conectar;
    }

    public static void main(String[] args) throws Exception {
        ConexionBot con = new ConexionBot();
        if (con.conexion() == null) {
            System.out.println("NO UBO CONEXION");
        } else {
            System.out.println("CONEXION EXITOSA");
        }
    }

}
