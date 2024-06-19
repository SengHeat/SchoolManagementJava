package assignment.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static assignment.utils.CustomUI.*;

public class MainSystemPage extends JFrame implements ActionListener {
    static Label labelTitle = new Label();
    static Label labelBg = new Label();
    static Label labelContainer = new Label();
    static Button buttonStudent = new Button("Student");
    static Button buttonCourse = new Button("Course NO");
    static Button buttonScore = new Button("Score NO");
    static Button buttonMark = new Button("Mark and Sheet");
    static Button buttonSearch = new Button("Search");
    static public void mainSystemPage() {
        JFrame frame = getjFrame();

        customLabel(labelTitle,0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"School Management System");

        //TODO: For Button
//        loadImage(new JLabel(),20,50,1,2,frame,"assets/RUPP_logo.png");

        customButton(new Button(), labelX, 80, buttonW, buttonH, frame, fontMediumMonospaced, backgroundColor,"Admin DashBord");
        customButton(buttonStudent, labelX+buttonW, 80, buttonW, buttonH, frame, fontMediumMonospaced, backgroundColor,"Student");
        customButton(new Button(), labelX+buttonW*2, 80, buttonW, buttonH, frame, fontMediumMonospaced, backgroundColor,"Teacher");
        customButton(buttonCourse, labelX+buttonW*3, 80, buttonW, buttonH, frame, fontMediumMonospaced, backgroundColor,"Major");
        customButton(new Button(), labelX+buttonW*4, 80, buttonW, buttonH, frame, fontMediumMonospaced, backgroundColor,"Staff");
        customButton(new Button(), labelX+buttonW*5, 80, buttonW+40, buttonH, frame, fontMediumMonospaced, backgroundColor,"Setting");
        loadImage(new JLabel(),0,130,1,1,frame,"assets/celestial-1.png");
        //TODO: For Background

        customContainer(labelContainer,labelX,122,1240,2,frame,grayColors);
        customContainer(labelBg,0,0,1300,800,frame,backgroundColor);

        buttonStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                StudentSystemPage.studentSystem();
            }
        });
    }

    public static void main(String[] args) {
//        LoginSystemPage.getLoginPage();
        MainSystemPage.mainSystemPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
}
