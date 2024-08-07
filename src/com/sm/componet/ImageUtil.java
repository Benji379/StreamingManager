package com.sm.componet;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtil {

    public static void setImageToLabel(JLabel label, String imagePath) {
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            System.err.println("Error: The file " + imagePath + " does not exist.");
            return;
        }
        
        try {
            BufferedImage originalImage = ImageIO.read(imageFile);
            int labelWidth = label.getWidth();
            int labelHeight = label.getHeight();
            Image scaledImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(scaledImage);
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Resizable Image Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JLabel imageLabel = new JLabel();
        imageLabel.setSize(300, 300); // Set a preferred size for the label
        
        frame.add(imageLabel);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
        // Adjust image to label size after the frame is visible
//        SwingUtilities.invokeLater(() -> setImageToLabel(imageLabel, "path/to/your/image.jpg"));
//        SwingUtilities.invokeLater(() -> setImageToLabel(imageLabel, "/com/sm/img/anuncio.png"));
        SwingUtilities.invokeLater(() -> setImageToLabel(imageLabel, "?C:\\Users\\benja\\Downloads\\Streaming Manager (2).png"));
    }
}
