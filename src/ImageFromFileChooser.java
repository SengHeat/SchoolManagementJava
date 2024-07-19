
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class ImageFromFileChooser {

    public static void main(String[] args) {
        // Create a JFrame to display the image
        JFrame frame = new JFrame("Display Image from File Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        // Create a JButton to trigger the file chooser
        JButton button = new JButton("Choose Image");
        frame.add(button, BorderLayout.NORTH);

        // Create a JLabel to display the image
        JLabel imageLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(imageLabel, BorderLayout.CENTER);

        // Create a JLabel to display the file path
        JLabel pathLabel = new JLabel("File path: ", SwingConstants.CENTER);
        frame.add(pathLabel, BorderLayout.SOUTH);

        // Add an ActionListener to the button
        button.addActionListener(e -> {
            // Create a JFileChooser to select an image file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select an Image File");
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                // Print the file path to the console
                System.out.println("File path: " + selectedFile.getAbsolutePath());

                // Display the file path in the pathLabel
                pathLabel.setText("File path: " + selectedFile.getAbsolutePath());

                // Load the image from the selected file
                BufferedImage image = null;
                try {
                    image = ImageIO.read(selectedFile);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // If image is successfully loaded, display it
                if (image != null) {
                    imageLabel.setIcon(new ImageIcon(image));
                } else {
                    imageLabel.setText("Failed to load image.");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}



