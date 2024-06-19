package assignment.utils;

import assignment.views.LoginSystemPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static assignment.utils.CustomUI.*;
public class DrawerUI extends JFrame implements ActionListener {
    static Button buttonDashBord = new Button();
    static Button buttonStudent = new Button();
    static Button buttonParent = new Button();
    static Button buttonTeacher = new Button();
    static Button buttonAccount = new Button();
    static Button buttonSubject = new Button();
    static Button buttonSetting = new Button();
    static JButton buttonSettings = new JButton();
//    public static void Drawer() {
//        JFrame frame = getjFrame();
//        customButton(buttonDashBord,frame,0,90,fontMediumMonospaced,backgroundColor,"DashBord");
//        customButton(buttonStudent,frame,0,160,fontMediumMonospaced,backgroundColor,"Students");
//        customButton(buttonParent,frame,0,230,fontMediumMonospaced,backgroundColor,"Parent");
//        customButton(buttonTeacher,frame,0,300,fontMediumMonospaced,backgroundColor,"Teacher");
//        customButton(buttonAccount,frame,0,370,fontMediumMonospaced,backgroundColor,"Account");
//        customButton(buttonSubject,frame,0,440,fontMediumMonospaced,backgroundColor,"Subject");
//        customButton(buttonSetting,frame,0,510,fontMediumMonospaced,backgroundColor,"Setting");
//        customButtonUI.buttonRadius(frame,buttonSettings,"Button",0,580,backgroundColor.darker());
//        customContainer(new Label(),frame,systemW/5,0,systemW-systemW/5,90,whiteColors);
//        customContainer(new Label(),frame,0,0,systemW/5,systemH,backgroundColor);
//        buttonStudent.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        frame.dispose();
//                        LoginSystemPage.LoginPage();
//                    }
//                });
//            }
//        });
//    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}
