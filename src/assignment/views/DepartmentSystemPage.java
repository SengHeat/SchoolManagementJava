package assignment.views;

import assignment.models.StudentModel;
import assignment.utils.CustomUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import static assignment.models.StudentModel.*;
import static assignment.utils.CustomUI.*;

public class DepartmentSystemPage extends JFrame implements ActionListener {

    public static ArrayList<JButton> buttonArrayList = new ArrayList<>();
    public static Button buttonBack = new Button();
    public static Button buttonAdd = new Button();
    public static int finalI1;


    static public void departmentSystemPage(){
        CustomUI.frame = CustomUI.getjFrame();
        customLabel(new Label(),0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"Department");
        customButton(buttonBack,labelX,700,buttonW,buttonH,frame,grayColors,"Back");
        customButton(buttonAdd,labelX+buttonW+10,700,buttonW,buttonH,frame,grayColors,"Add Department");
        for (int i = 0; i< majorList.size(); i++){
            JButton button = new JButton();
            buttonArrayList.add(button);
        }
        for(int i = 0; i< majorList.size(); i++){
            if(i!=0){
                CustomUI.customImageButton(buttonArrayList.get(i),systemW/4*(i>8? i-9 : i>4? i-5 : i-1)+100,i > 8 ? 500 : i>4 ? 300 : 120,systemW/majorList.size(),systemW/majorList.size(),CustomUI.frame, majorImageList.get(i),majorList.get(i));
            } else {
                CustomUI.customLabel(new Label(),labelX,40*i+50,systemW,50,0,frame,fontMediumMonospaced,secondaryColor,whiteColors,"ALL Department in School");
            }

        }
        for (int i = 0; i< majorList.size(); i++){
            finalI1 = i;
            int finalI = i;
            buttonArrayList.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CustomUI.jframe.dispose();
                    departmentOnePage(buttonArrayList.get(finalI).getLabel());
                }
            });
        }

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.toBack();
            }
        });
    }
    static public void departmentOnePage(String name){
        CustomUI.jframe = CustomUI.getFrameClose();
        CustomUI.customLabel(new Label(),0,0,600,50,1,CustomUI.jframe,CustomUI.fontMediumMonospaced,CustomUI.primaryColor,CustomUI.whiteColors,name+" Department");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
