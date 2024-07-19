
import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageFromURL {
    public static void main(String[] args) {
        // URL of the image
        String imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvEtgUpl_S6IjOacpgGmjTPE0PzS3Ba6S4gA&s";

        // Create a JFrame to display the image
        JFrame frame = new JFrame("Display Image from URL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Load the image from the URL
        BufferedImage image = null;
        try {
            URL url = new URL(imageUrl);
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // If image is successfully loaded, display it
        if (image != null) {
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            frame.add(imageLabel);
        } else {
            JLabel errorLabel = new JLabel("Failed to load image.", SwingConstants.CENTER);
            frame.add(errorLabel);
        }

        // Display the frame
        frame.setVisible(true);
    }
}

