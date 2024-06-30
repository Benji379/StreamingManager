package TestLoad;

import com.sm.modelo.Accion;
import javax.swing.*;

public class CargarConAccion {

    public static void cargar(Accion accionPrincipal, Accion pantallaCarga) {
        // Crear un nuevo hilo para ejecutar la acci�n principal
        Thread hilo = new Thread(() -> {
            // Mostrar la pantalla de carga
            SwingUtilities.invokeLater(pantallaCarga::ejecutar);

            // Ejecutar la acci�n principal
            accionPrincipal.ejecutar();

        });

        // Iniciar el hilo
        hilo.start();
    }

    public static void main(String[] args) {
        // Acci�n principal a realizar (ejemplo)
        Accion accionPrincipal = () -> {
            try {
                // Simular una tarea que toma tiempo (5 segundos)
                Thread.sleep(1000);
                System.out.println("ACCION TERMINADA");
            } catch (InterruptedException e) {
                System.out.println("ERROR:");
            }
        };

        // Acci�n para mostrar la pantalla de carga (ejemplo)
        Accion pantallaCarga = () -> {

            System.out.println("CARGANDO");

        };

        // Llamar al m�todo cargar con las dos acciones
        cargar(accionPrincipal, pantallaCarga);
    }

}
