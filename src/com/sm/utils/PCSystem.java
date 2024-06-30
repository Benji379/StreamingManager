package com.sm.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PCSystem {

    public static String getHost() {
        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
//            System.out.println("Nombre del host: " + hostName);
        } catch (UnknownHostException ex) {
            Logger.getLogger(PCSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hostName;
    }

    public static String getIP() {
        String ip = null;
        try {
            // Obtener la dirección IP pública utilizando un servicio web externo
            URL url = new URL("http://checkip.amazonaws.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            ip = br.readLine().trim();
//            System.out.println("Dirección IP pública: " + ip);
        } catch (UnknownHostException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return ip;
    }

    public static void main(String[] args) throws MalformedURLException, IOException {
        try {
            // Obtener el nombre del host
            String hostName = InetAddress.getLocalHost().getHostName();
//            System.out.println("Nombre del host: " + hostName);

            // Obtener la dirección IP pública utilizando un servicio web externo
            URL url = new URL("http://checkip.amazonaws.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String ipAddress = br.readLine().trim();
//            System.out.println("Dirección IP pública: " + ipAddress);

        } catch (UnknownHostException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
