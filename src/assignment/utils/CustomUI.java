package assignment.utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
public class CustomUI {
    static String fontFamily = "Serif";
    public static Font fontExtraSmallMonospaced = new Font(fontFamily, Font.PLAIN, 12);
    public static Font fontSmallMonospaced = new Font(fontFamily, Font.BOLD, 16);
    public static Font fontMediumMonospaced = new Font(fontFamily, Font.BOLD, 22);
    public static Font fontLargeMonospaced = new Font(fontFamily, Font.BOLD, 32);

    //TODO: CustomColor
    public static Color primaryColor = new Color(0xFF04133B, true);
    public static Color secondaryColor = new Color(0xFF24316C, true);
    public static Color backgroundColor = new Color(0x80042050, true);
    public static Color cyanColor = new Color(0x8005c5f5, true);
    public static Color blueColor = new Color(0xFF02BEF6, true);
    public static Color whiteColors = new Color(0x80FFFFFF, true);
    public static Color grayColors = new Color(0x80858585, true);

    //TODO: CustomPaddingSize
    public static int systemW = 1300;
    public static int systemH = 800;
    public static int buttonW = 200;
    public static int buttonH = 40;
    public static int labelX = 20;
    public static int labelW = 150;
    public static int labelH = 30;
    public static int textFieldX = 190;
    public static int textFieldW = 250;
    public static int textFieldH = 30;

    static public void customLabel(Label label, int x, int y, int w, int h, int alignment,JFrame jFrame, Font font, Color color, Color textColor, String text){
        label.setBounds(x,y,w,h);
        label.setAlignment(alignment);
        label.setText(text);
        label.setFont(font);
        label.setBackground(color);
        label.setForeground(textColor);
        jFrame.add(label);
    }
    static public void customContainer(Label label, int x, int y, int w, int h,JFrame jFrame,Color color){
        label.setBounds(x,y,w,h);
        label.setBackground(color);
        jFrame.add(label);
    }
    public static void customTextField(JTextField textField, int x, int y, int w, int h,JFrame jFrame,Font font){
        textField.setBounds(x,y,w,h);
        textField.setFont(font);
        textField.setHorizontalAlignment(JTextField.LEFT);
        jFrame.add(textField);
    }
    public static void customButton(Button button, int x, int y,int w,int h,JFrame jFrame,Font font,Color color,String text){
        button.setBounds(x,y,w,h);
        button.setFont(font);
        button.setLabel(text);
        button.setForeground(whiteColors);
        button.setBackground(color);
        jFrame.add(button);
    }
    public static void customSelected(Choice choice,JFrame jPanel, Font font, int x, int y, int w, int h, List<String> list){
        choice.setBounds(x,y,w,h);
        for (String s : list) {
            choice.add(s);
        }
        choice.setFont(font);
        jPanel.add(choice);
    }
    public static void customDisplayData(TextArea textArea,JPanel jPanel){
        textArea.setEditable(false);
        textArea.setBounds(510,190,750,500);
        textArea.setForeground(Color.black);
        textArea.setFont(fontSmallMonospaced);
        textArea.setText("");
        jPanel.add(textArea);
    }

    public static JLabel loadImage(JLabel label, int x, int y, int w, int h,JFrame jFrame,String fileName) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File(fileName));
            label = new JLabel(new ImageIcon(image));
            h = image.getHeight();
            w = image.getWidth();
            image.setAccelerationPriority(0.5F);
            label.setBackground(backgroundColor);
            label.setBounds(x,y,w,h);
            jFrame.add(label);
        } catch (Exception e) {
            label.setBounds(x,y,w,h);
            label.setText("!");
            label.setFont(fontLargeMonospaced);
            label.setForeground(Color.RED);
            label.setAlignmentX(0);
            jFrame.add(label);
            System.out.println("Error loading image: " + e.getMessage());
        }
        return label;
    }

     public static JFrame getjFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(secondaryColor);
        frame.setSize(systemW, systemH);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x,y);
        return frame;
    }
}
