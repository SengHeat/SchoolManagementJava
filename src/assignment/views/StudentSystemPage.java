package assignment.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import static assignment.utils.CustomUI.*;

public class StudentSystemPage extends JFrame implements ActionListener {

    static Label labelTitle = new Label();
    static Label labelBg = new Label();
    static Label labelContainer = new Label();
    static Label labelId = new Label();
    static Label labelName = new Label();
    static Label labelBirth = new Label();
    static Label labelGender = new Label();
    static Label labelEmail = new Label();
    static Label labelPhone = new Label();
    static Label labelAddress = new Label();
    static Label labelCourse = new Label();
    static Label labelSearch = new Label();
    static JTextField textFieldId = new JTextField();
    static JTextField textFieldName = new JTextField();
    static JTextField textFieldDate = new JTextField();
    static JTextField textFieldPhone = new JTextField();
    static JTextField textFieldEmail = new JTextField();
    static JTextField textFieldAddress = new JTextField();
    static JTextField textFieldSearch = new JTextField();
    static JButton buttonStudent = new JButton("Student");
    static Button buttonCourse = new Button("Course NO");
    static Button buttonScore = new Button("Score NO");
    static Button buttonMark = new Button("Mark and Sheet");
    static Button buttonSearch = new Button("Search");
    Button buttonImage = new Button("Pick Image");
    static Button buttonRefresh = new Button("Refresh");
    static Button buttonAdd = new Button("Add New");
    static Button buttonUpdate = new Button("Update NO");
    static Button buttonDelete = new Button("Delete");
    static Button buttonSort = new Button("Sort");
    static Button buttonClear = new Button("Clear");
    static Button buttonLogout = new Button("Logout NO");
    static Choice choiceGender= new Choice();
    static Choice choiceCourse= new Choice();
    static  JFrame frame;
    public static void studentSystem() {
        frame = getjFrame();

        //TODO: For Label
        customLabel(labelTitle,0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"Student Management System");
        customLabel(labelId,labelX,250,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Student ID");
        customLabel(labelName,labelX,290,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Student Name");
        customLabel(labelBirth,labelX,330,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Date of Birth");
        customLabel(labelGender,labelX,370,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Gender");
        customLabel(labelEmail,labelX,410,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Email");
        customLabel(labelPhone,labelX,450,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Phone number");
        customLabel(labelAddress,labelX,490,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Address");
        customLabel(labelCourse,labelX,530,labelW,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Course Name");
        customLabel(labelSearch,500,130,labelW+10,labelH,0,frame,fontMediumMonospaced,backgroundColor,whiteColors,"Search Student");

        //TODO: For Button
//        customButton(buttonStudent, labelX, 85, 150, labelH, frame, fontMediumMonospaced, primaryColor);
//        customButton(buttonCourse, 170, 85, 150, labelH, frame, fontMediumMonospaced, grayColors);
//        customButton(buttonScore, 320, 85, 150, labelH, frame, fontMediumMonospaced, grayColors);
//        customButton(buttonMark, 470, 85, 170, labelH, frame, fontMediumMonospaced, grayColors);
//        customButton(buttonSearch,940,130,150,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonRefresh,1110,130,150,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonAdd,510,710,130,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonSort,640,710,125,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonUpdate,765,710,130,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonDelete,890,710,125,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonClear,1015,710,125,labelH,frame,fontMediumMonospaced,grayColors);
//        customButton(buttonLogout,1140,710,125,labelH,frame,fontMediumMonospaced,grayColors);

        //TODO: For Display Data
        /*customTable(jScrollPane,jTable,frame,510,190,750,500);
//        customDisplay(textArea,frame,"daa");*/
//        textArea.setEditable(false);
//        textArea.setBounds(510,190,750,500);
//        textArea.setForeground(Color.black);
//        textArea.setFont(fontSmallMonospaced);
//        textArea.setText("");
//        frame.add(textArea);

//        //TODO: For TextField
        customTextField(textFieldId,textFieldX,250,textFieldW,textFieldH,frame,fontSmallMonospaced);
        customTextField(textFieldName,textFieldX,290,textFieldW,textFieldH,frame,fontSmallMonospaced);
        customTextField(textFieldDate,textFieldX,330,textFieldW,textFieldH,frame,fontSmallMonospaced);
        List<String> listGender = new ArrayList<>();
        customSelected(choiceGender,frame,fontMediumMonospaced,textFieldX,370,textFieldW-80,300,listGender);
        customTextField(textFieldEmail,textFieldX,410,textFieldW,textFieldH,frame,fontSmallMonospaced);
        customTextField(textFieldPhone,textFieldX,450,textFieldW,textFieldH,frame,fontSmallMonospaced);
        customTextField(textFieldAddress,textFieldX,490,textFieldW,textFieldH,frame,fontSmallMonospaced);
        List<String> listCourse = new ArrayList<>();
        customSelected(choiceCourse,frame,fontMediumMonospaced,textFieldX,530,textFieldW-80,300,listCourse);
        customTextField(textFieldSearch,670,130,textFieldW,textFieldH,frame,fontSmallMonospaced);
//
//        //TODO: For Background
        customContainer(labelContainer,labelX,115,1240,2,frame,grayColors);

        customContainer(labelBg,0,0,1300,8000,frame,backgroundColor);

        //TODO: For Button Process
        buttonStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonStudent.setBackground(primaryColor);
                buttonCourse.setBackground(grayColors);
                buttonScore.setBackground(grayColors);
                buttonMark.setBackground(grayColors);
            }
        });
        buttonCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonStudent.setBackground(grayColors);
                buttonCourse.setBackground(primaryColor);
                buttonScore.setBackground(grayColors);
                buttonMark.setBackground(grayColors);
            }
        });
        buttonScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonStudent.setBackground(grayColors);
                buttonCourse.setBackground(grayColors);
                buttonScore.setBackground(primaryColor);
                buttonMark.setBackground(grayColors);
            }
        });
        buttonMark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonStudent.setBackground(grayColors);
                buttonCourse.setBackground(grayColors);
                buttonScore.setBackground(grayColors);
                buttonMark.setBackground(primaryColor);
            }
        });
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                textArea.setText("");
//                for (int i=0; i<arrayList.size(); i++) {
//                    if (arrayList.get(i).getName().equalsIgnoreCase(textFieldSearch.getText())){
//                        textArea.append(arrayList.get(i).display());
//                    }
//                }
            }
        });
        buttonRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                textFieldSearch.setText("");
//                textArea.setText("");
//                for (StudentData data : arrayList) {
//                    textArea.append(data.display());
//                }
            }
        });
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if(textFieldId.getText() == null || textFieldId.getText().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"ID is Required");
//                } else {
//                    for(int i = 0; i<arrayList.size(); i++){
//                        if (arrayList.get(i).getId() == Integer.parseInt(textFieldId.getText())) {
//                            JOptionPane.showMessageDialog(null,"ID is has can't Input again");
//                            return;
//                        }
//                    }
//                    StudentData studentData = new StudentData(
//                            textFieldId.getText(),
//                            textFieldName.getText(),
//                            textFieldDate.getText(),
//                            choiceGender.getSelectedItem(),
//                            textFieldEmail.getText(),
//                            textFieldPhone.getText(),
//                            textFieldAddress.getText(),
//                            choiceCourse.getSelectedItem()
//                    );
//                    arrayList.add(studentData);
//                }
//                textArea.setText("");
//                for (StudentData data : arrayList) {
//                    textArea.append(data.display());
//                }
                textFieldId.setText("");
                textFieldName.setText("");
                textFieldDate.setText("");
                choiceGender.select(0);
                textFieldEmail.setText("");
                textFieldPhone.setText("");
                textFieldAddress.setText("");
                choiceCourse.select(0);
                textFieldId.requestFocus();
                textFieldId.setCaretPosition(0);
            }
        });

        buttonSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                arrayList.sort((studentData1, studentData2) -> studentData1.getId() - studentData2.getId());
//                textArea.setText("");
//                for (StudentData data : arrayList) {
//                    textArea.append(data.display());
//                }
            }
        });
        buttonUpdate.addActionListener(new ActionListener() {
            int inputUpdate;
            @Override
            public void actionPerformed(ActionEvent e) {
//                inputUpdate = Integer.parseInt(JOptionPane.showInputDialog("Find ID"));
//                int idUpdate;
//                for(int i = 0; i<arrayList.size(); i++){
//                    if (arrayList.get(i).getId() == inputUpdate) {
//                        /*idUpdate = i;
//                        textFieldId.setText(String.valueOf(arrayList.get(i).getId()));
//                        textFieldName.setText(arrayList.get(i).getName());
//                        textFieldDate.setText(arrayList.get(i).getBirth());
//                        choiceGender.select(arrayList.get(i).getGender());
//                        textFieldEmail.setText(arrayList.get(i).getEmail());
//                        textFieldPhone.setText(arrayList.get(i).getPhone());
//                        textFieldAddress.setText(arrayList.get(i).getAddress());
//                        choiceCourse.select(arrayList.get(i).getCourse());*/
//                        StudentData studentData = new StudentData(
//                                textFieldId.getText(),
//                                textFieldName.getText(),
//                                textFieldDate.getText(),
//                                choiceGender.getSelectedItem(),
//                                textFieldEmail.getText(),
//                                textFieldPhone.getText(),
//                                textFieldAddress.getText(),
//                                choiceCourse.getSelectedItem()
//                        );
//                        arrayList.add(i,studentData);
//                    }
//                }
            }
        });
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                int inputSearch;
//                int count = 0;
//                inputSearch = Integer.parseInt(JOptionPane.showInputDialog("Find ID"));
//                for (int i=0; i<arrayList.size(); i++) {
//                    if(arrayList.get(i).getId() == inputSearch) {
//                        JOptionPane.showConfirmDialog(null, arrayList.get(i).display());
//                        arrayList.remove(i);
//                        count ++;
//                    }
//                    if (inputSearch == 12345678) {
//                        arrayList.clear();
//                        count = 123456789;
//                    }
//                }
//                if(count == 0) {
//                    JOptionPane.showMessageDialog(null,"ID Not Found 404");
//                }
//                textArea.setText("");
//                for (StudentData studentData : arrayList) {
//                    textArea.append(studentData.display());
//                }
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldId.setText("");
                textFieldName.setText("");
                textFieldDate.setText("");
                choiceGender.select(0);
                textFieldEmail.setText("");
                textFieldPhone.setText("");
                textFieldAddress.setText("");
                choiceCourse.select(0);
            }
        });
        buttonLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        frame.dispose();
                        LoginSystemPage.getLoginPage();
                    }
                });
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setDefaultCloseOperation(JOptionPane.showConfirmDialog(null,"Hello"));
    }
}
