import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainA {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image
        ImageIcon originalIcon = new ImageIcon("assets/5850276.png");
        Image originalImage = originalIcon.getImage();

        // Scale the image to fit the button's dimensions
        int buttonWidth = 100;
        int buttonHeight = 100;
        Image scaledImage = originalImage.getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Create the button with the scaled icon
        JButton button = new JButton(scaledIcon);
        button.setBounds(200, 200, buttonWidth, buttonHeight);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
