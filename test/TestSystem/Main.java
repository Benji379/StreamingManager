package TestSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {
        try {
            // Obtener el nombre del host
            String hostName = InetAddress.getLocalHost().getHostName();
            System.out.println("Nombre del host: " + hostName);
            
            // Obtener información adicional sobre el sistema
            String osName = System.getProperty("os.name");
            String osVersion = System.getProperty("os.version");
            String osArch = System.getProperty("os.arch");
            String javaVersion = System.getProperty("java.version");

            System.out.println("Sistema operativo: " + osName);
            System.out.println("Versión del sistema operativo: " + osVersion);
            System.out.println("Arquitectura del sistema operativo: " + osArch);
            System.out.println("Versión de Java: " + javaVersion);

            // Obtener la dirección IP pública utilizando un servicio web externo
            URL url = new URL("http://checkip.amazonaws.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String ipAddress = br.readLine().trim();
            System.out.println("Dirección IP pública: " + ipAddress);

        } catch (UnknownHostException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
