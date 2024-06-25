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

    public static ArrayList<Button> buttonArrayList = new ArrayList<>();
    public static Button buttonBack = new Button();
    public static int finalI1;


    static public void departmentSystemPage(){
        CustomUI.frame = CustomUI.getjFrame();
        customLabel(new Label(),0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"Department");
        customButton(buttonBack,labelX,700,buttonW,buttonH,frame,grayColors,"Back");
        for (int i = 0; i< majorList.size(); i++){
            Button button = new Button();
            buttonArrayList.add(button);
        }
        for(int i = 0; i< majorList.size(); i++){
            if(i!=0){
                CustomUI.customButton(buttonArrayList.get(i),CustomUI.labelX,40*(i)+60,CustomUI.buttonW,CustomUI.buttonH,CustomUI.frame,CustomUI.grayColors, majorList.get(i));
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
