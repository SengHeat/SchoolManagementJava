package assignment.utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.function.Function;

public class CustomUI {
    static String fontFamily = "Serif";
    public static Font fontExtraSmallMonospaced = new Font(fontFamily, Font.PLAIN, 12);
    public static Font fontSmallMonospaced = new Font(fontFamily, Font.BOLD, 16);
    public static Font fontMediumMonospaced = new Font(fontFamily, Font.BOLD, 22);
    public static Font fontLargeMonospaced = new Font(fontFamily, Font.BOLD, 32);

    public static JFrame frame = new JFrame();
    public static JFrame jframe = new JFrame();

    //TODO: CustomColor
    public static Color primaryColor = new Color(0xFF444457, true);
    public static Color secondaryColor = new Color(0xFF24316C, true);
    public static Color backgroundColor = new Color(0xFF04133B, true);
    public static Color cyanColor = new Color(0x8005c5f5, true);
    public static Color blueColor = new Color(0xFF02BEF6, true);
    public static Color whiteColors = new Color(0x80FFFFFF, true);
    public static Color grayColors = new Color(0x80858585, true);

    //TODO: CustomPaddingSize
    public static int systemW = 1300;
    public static int systemH = 800;
    public static int buttonW = 200;
    public static int buttonH = 35;
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
    public static void customTextField(JTextField textField,JTextField next, int x, int y, int w, int h,JFrame jFrame,Font font){
        textField.setBounds(x,y,w,h);
        textField.setFont(font);
        textField.setHorizontalAlignment(JTextField.LEFT);
        try{
            if(next != null){
                textField.addKeyListener(new KeyAdapter() {
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            next.requestFocus();
                        }
                    }
                });
            }
        } catch (Exception exception){
            try {
                throw new Exception(exception.toString());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        jFrame.add(textField);
    }
    public static void customButton(Button button, int x, int y,int w,int h,JFrame jFrame,Color color,String text){
        button.setBounds(x,y,w,h);
        button.setFont(fontSmallMonospaced);
        button.setLabel(text);
        button.setForeground(whiteColors);
        button.setBackground(color);
        jFrame.add(button);
    }
    public static void customButtonColor(Button button, int x, int y,int w,int h,JFrame jFrame,Color colors,Color color,String text,boolean current){
        button.setBounds(x,y,w,h);
        button.setFont(fontSmallMonospaced);
        button.setLabel(text);
        button.setForeground(whiteColors);
        button.setBackground(current ? colors : color);
        jFrame.add(button);
    }
    public static void customSelected(Choice choice,JFrame jPanel, Font font, int x, int y, int w, int h, List<String> list,int index){
        choice.setBounds(x,y,w,h);
        choice.removeAll();
        for (String s : list) {
            choice.add(s);
        }
        choice.select(index);
        choice.setFont(font);
        jPanel.add(choice);
    }
    public static void customDisplayData(TextArea textArea, JFrame jFrame, int x, int y, int w, int h){
        textArea.setEditable(false);
        textArea.setBounds(x,y,w,h);
        textArea.setForeground(Color.black);
        textArea.setFont(fontSmallMonospaced);
        jFrame.add(textArea);

    }

    public static void customCheckBox(JFrame jFrame,CheckboxGroup checkboxGroup, Checkbox checkbox1,Checkbox checkbox2,boolean male,boolean female){
        checkbox1 = new Checkbox("Male",checkboxGroup,male);
        checkbox2 = new Checkbox("Female",checkboxGroup,female);
        checkbox1.setBounds(labelX,260,70,30);
        checkbox2.setBounds(150,260,70,30);
        checkbox1.setFont(fontExtraSmallMonospaced);
        checkbox2.setFont(fontExtraSmallMonospaced);
        checkbox1.setForeground(whiteColors);
        checkbox2.setForeground(whiteColors);

        jFrame.add(checkbox1);
        jFrame.add(checkbox2);
    }

    public static JLabel loadImage(JLabel label, int x, int y, int w, int h,JFrame jFrame,String fileName) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File(fileName));
            label = new JLabel(new ImageIcon(image));
            image.setAccelerationPriority(0.5F);
            label.setPreferredSize(new Dimension(w, h));
            label.setBackground(backgroundColor);
            image.setAccelerationPriority(2);
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
    public static JLabel customImageLabel(JLabel jButton, int x, int y, int w, int h, JFrame jFrame, String fileName) {
        ImageIcon originalIcon = new ImageIcon(fileName);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jButton.setIcon(scaledIcon);
        jButton.setBounds(x, y, w, h);
        jButton.setPreferredSize(new Dimension(w, h));

        // Optional: If you want to set a text label directly on the button
        jButton.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton.setVerticalTextPosition(SwingConstants.BOTTOM);

        jFrame.add(jButton);

        return jButton;
    }

    public static JButton customImageButton(JButton jButton, int x, int y, int w, int h, JFrame jFrame, String fileName,String text) {
        ImageIcon originalIcon = new ImageIcon(fileName);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jButton.setIcon(scaledIcon);
        jButton.setBounds(x, y, w, h);
        jButton.setPreferredSize(new Dimension(w, h));

        // Optional: If you want to set a text label directly on the button
        jButton.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton.setVerticalTextPosition(SwingConstants.BOTTOM);

        JLabel label = new JLabel(text);
        label.setBounds(x, y + h, w, 30);
        label.setFont(fontMediumMonospaced);  // Assuming fontLargeMonospaced is defined elsewhere
        label.setForeground(Color.white);  // Assuming whiteColors is Color.WHITE
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBackground(backgroundColor);
        frame.add(jButton);
        frame.add(label);

        return jButton;
    }

//    public static JButton v(Function<String> stringFunction){
//        return null;
//    }

     public static JFrame getFrameOffAll() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
     public static JFrame getjFrame() {
        JFrame frame = new JFrame();
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
     public static JFrame getFrameClose() {
         JFrame jframe = new JFrame();
         jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         jframe.getContentPane().setBackground(secondaryColor);
         jframe.setSize(600, 700);
         jframe.setVisible(true);
         jframe.setLayout(null);
         jframe.setResizable(false);
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         int x = (screenSize.width - jframe.getWidth()) / 2;
         int y = (screenSize.height - jframe.getHeight()) / 2;
         jframe.setLocation(x,y);
        return jframe;
    }
}
