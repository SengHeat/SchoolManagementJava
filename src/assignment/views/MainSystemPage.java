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
    static JButton buttonDepartment = new JButton("Course NO");
    static JButton buttonPayment = new JButton("Course NO");
    static JButton buttonTeacher = new JButton();

    static public void mainSystemPage() {
        frame = getFrameOffAll();
        customLabel(labelTitle,0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"School Management System");

        //TODO: For Button
        customImageButton(buttonStudent,400,150,200,200,frame,"assets/5850276.png","Student");
        customImageButton(buttonTeacher,400,400,200,200,frame,"assets/teacher-illustration-1001x1024-plu4q319.png","Teacher");
        customImageButton(buttonDepartment,650,150,200,200,frame,"assets/download.jpg","Department");
        customImageButton(buttonPayment,650,400,200,200,frame,"assets/payment.png","Payment");
        customImageLabel(new JLabel(),0,0,systemW,systemH,frame,"assets/rupp.jpg");

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
