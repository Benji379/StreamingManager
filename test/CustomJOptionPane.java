import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomJOptionPane {

    private JDialog dialog; // Variable de instancia para el JDialog

    public static void main(String[] args) {
        CustomJOptionPane customPane = new CustomJOptionPane();
        customPane.ventanaEmergente("Enviando...", "Correo", "/com/sm/img/gmail.png");

        // Usar un temporizador para cerrar el diálogo después de 2 segundos
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customPane.cerrarVentanaEmergente();
            }
        });
        timer.setRepeats(false); // No repetir el temporizador
        timer.start();
    }

    public void ventanaEmergente(String mensaje, String pieTittle, String urlIcono) {
        // Crear el JOptionPane con el mensaje y el icono
        JOptionPane optionPane = new JOptionPane(
                mensaje,
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                icono(urlIcono),
                new Object[]{}, // Sin botones predeterminados
                null
        );

        // Crear el JDialog que contendrá el JOptionPane
        dialog = new JDialog((Frame) null, pieTittle, true);
        dialog.setContentPane(optionPane);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.pack();
        dialog.setLocationRelativeTo(null);

        // Crear un botón personalizado y agregar un ActionListener
        JButton customButton = new JButton("En curso");
        customButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción personalizada aquí
                System.out.println("Botón presionado, pero el diálogo no se cierra.");
            }
        });

        // Agregar el botón al JOptionPane
        optionPane.setOptions(new Object[]{customButton});

        // Mostrar el JDialog
        dialog.setVisible(true);
    }

    public void cerrarVentanaEmergente() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dispose();
        }
    }

    public Icon icono(String path) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        return img;
    }
}
