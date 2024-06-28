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
    static JButton buttonStudent = new JButton();
    static Button buttonDepartment = new Button("Course NO");
    static Button buttonPayment = new Button("Course NO");
    static Button buttonTeacher = new Button();

    static public void mainSystemPage() {
        frame = getFrameOffAll();
        customLabel(labelTitle,0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"School Management System");

        //TODO: For Button
        loadImage(new JLabel(),20,50,1,2,frame,"assets/RUPP_logo.png");
        customButton(new Button(), labelX, 80, buttonW, buttonH, frame, primaryColor,"Admin DashBord");
//        customButton(buttonStudent, labelX+buttonW, 80, buttonW, buttonH, frame, grayColors,"Student");
        customButton(buttonTeacher, labelX+buttonW*2, 80, buttonW, buttonH, frame, grayColors,"Teacher");
        customButton(buttonDepartment, labelX+buttonW*3, 80, buttonW, buttonH, frame, grayColors,"Department");
        customButton(buttonPayment, labelX+buttonW*4, 80, buttonW, buttonH, frame, grayColors,"Payment");
        customImageLabel(new JLabel(),labelX,50,1240,300,frame,"assets/1_z8GxBUFOQOMs8YqCwHLQeQ.jpg");
        customImageButton(buttonStudent,50,350,150,150,frame,"assets/5850276.png","Student");
        //TODO: For Background
        customContainer(labelContainer,labelX,122,1240,2,frame,grayColors);
        customContainer(labelBg,0,0,1300,800,frame,backgroundColor);

        buttonStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentSystemPage.studentSystem();
            }
        });
        buttonTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherSystemPage.teacherPage();
            }
        });
        buttonDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DepartmentSystemPage.departmentSystemPage();
            }
        });
        buttonPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        MainSystemPage.mainSystemPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
}
