package assignment.views;


import assignment.utils.CustomUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import static assignment.utils.CustomUI.*;


public class LoginSystemPage extends JFrame implements ActionListener {
    static Label labelTitle = new Label();
    static Label labelContainer = new Label();
    static Label labelBg = new Label();
    static Button buttonLogin = new Button();
    static Button buttonExit = new Button();
    static JLabel label = new JLabel();
    static JRadioButton jRadioButton = new JRadioButton();
    static public void getLoginPage(){
        frame = getjFrame();
        customLabel(labelTitle,0,0,1300,50,1,frame,fontLargeMonospaced,secondaryColor,whiteColors,"Student Management System");
        customLabel(new Label(),650,179,400,50,1,frame,fontLargeMonospaced,backgroundColor,whiteColors,"Login");
        customLabel(new Label(),670,320,labelW-5,labelH,0,frame,fontSmallMonospaced,backgroundColor,whiteColors,"Username");
        customLabel(new Label(),670,360,labelW-5,labelH,0,frame,fontSmallMonospaced,backgroundColor,whiteColors,"Password");
        jRadioButton.setBounds(670,405,20,20);
        jRadioButton.setBackground(backgroundColor);
        customLabel(new Label(),690,400,150,labelH,0,frame,fontExtraSmallMonospaced,backgroundColor,whiteColors,"Show Password");
        frame.add(jRadioButton);
        JTextField textFieldUser = new JTextField();
        customTextField(textFieldUser,null,670+labelW,320,200,textFieldH,frame,fontSmallMonospaced);
        JPasswordField jPasswordField = new JPasswordField();
        textFieldUser.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    jPasswordField.requestFocus();
                }
            }
        });
        textFieldUser.requestFocus();
        textFieldUser.setCaretPosition(0);
        textFieldUser.setInheritsPopupMenu(true);
        jPasswordField.setEchoChar('*');
        jPasswordField.setInheritsPopupMenu(true);
        jPasswordField.setBounds(670+labelW,360,200,labelH);
        jPasswordField.setFont(fontSmallMonospaced);
        frame.add(jPasswordField);
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setBounds(670,400,20,20);
        showPasswordCheckBox.setBackground(backgroundColor);
        showPasswordCheckBox.setForeground(whiteColors);
        showPasswordCheckBox.setText("Show Password");


        customButton(buttonLogin,650,530,199,labelH,frame,grayColors,"Login");
        customButton(buttonExit,850,530,199,labelH,frame,grayColors,"Exit");
        customContainer(labelContainer,650,230,400,300,frame,backgroundColor);
        customImageLabel(label,250,179,400,383,frame,"assets/6_a52d3d34c0.png");
        customContainer(labelBg,0,51,1600,900,frame,primaryColor);

        showPasswordCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    jPasswordField.setEchoChar((char) 0); // Show password
                } else {
                    jPasswordField.setEchoChar('\u2022'); // Hide password (use bullet character)
                }
            }
        });
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jRadioButton.isSelected()){
                    jPasswordField.setEchoChar((char) 0);
                } else {
                    jPasswordField.setEchoChar('*');
                    jPasswordField.setInheritsPopupMenu(true);
                }

            }
        });
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int error = 0;
                if (ae.getSource() == buttonLogin) {
                    if (textFieldUser.getText().equals("Admin") && new String(jPasswordField.getPassword()).equals("12345678")) {
                        JOptionPane.showMessageDialog(null, "Login Successfully");
                        frame.dispose();
                        MainSystemPage.mainSystemPage();
                    } else {
                        error += 1;
                        String password = Arrays.toString(jPasswordField.getPassword());
                        if(!textFieldUser.getText().equals("Admin") && !password.equals("12345678")){
                            JOptionPane.showMessageDialog(null, "User and Password is Validate");
                            return;
                        }
                        if (!textFieldUser.getText().equals("Admin")){
                            JOptionPane.showMessageDialog(null, "User is Validate");
                        }
                        jPasswordField.getPassword();
                        {
                            JOptionPane.showMessageDialog(null, "Password is Validate");
                        }
                    }
                }
            }
        });
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
