import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CustomFrame extends JFrame {

    public CustomFrame() {
        // Configuración básica del JFrame
        setTitle("Custom JFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Para que no cierre toda la aplicación

        // Remover botones de maximizar y minimizar
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);

        // Añadir el icono de cerrar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Mantener siempre en frente
        setAlwaysOnTop(true);

        // Añadir WindowListener para manejar el cierre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Acción al cerrar el JFrame
                int option = JOptionPane.showConfirmDialog(
                        CustomFrame.this,
                        "¿Seguro que quieres cerrar esta ventana?",
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );

                if (option == JOptionPane.YES_OPTION) {
                    dispose(); // Cierra solo este JFrame
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomFrame frame = new CustomFrame();
            frame.setVisible(true);
        });
    }
}
