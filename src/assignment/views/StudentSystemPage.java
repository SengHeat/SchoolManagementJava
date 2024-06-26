package assignment.views;
import assignment.models.StudentModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Objects;

import static assignment.utils.CustomUI.*;

public class StudentSystemPage extends JFrame implements ActionListener {

    static Label labelTitle = new Label();
    static JTextField textFieldId = new JTextField();
    static JTextField textFieldFName = new JTextField();
    static JTextField textFieldLName = new JTextField();
    static JTextField textFieldDate = new JTextField();
    
    static JTextField textFieldPhone = new JTextField();
    static JTextField textFieldEmail = new JTextField();
    static JTextField textFieldAddress = new JTextField();
    static JTextField textFieldSearch = new JTextField();
    static TextArea textArea = new TextArea();

    static Button buttonSearch = new Button("Search");
    static Button buttonRefresh = new Button("Refresh");
    static Button buttonAdd = new Button("Add New");
    static Button buttonExits = new Button("Add New");
    static Button buttonAdds = new Button();
    static Button buttonUpdate = new Button("Update NO");
    static Button buttonU = new Button("Update NO");
    static Button buttonBack = new Button("Update NO");
    static Button buttonDelete = new Button("Delete");
    static Button buttonLogout = new Button("Logout NO");
    static Button buttonExit = new Button("Logout NO");
    static Choice choiceCourse= new Choice();
    static Choice choiceTime= new Choice();
    static CheckboxGroup checkboxGroup = new CheckboxGroup();
    static Checkbox checkbox1 = new Checkbox();
    static Checkbox checkbox2 = new Checkbox();
    static ArrayList<StudentModel > studentModels = new ArrayList<>();

    public static void studentSystem() {
        frame = getjFrame();
        customDisplayData(textArea,frame,450,150,810,500);
        loadImage(new JLabel(),labelX,150,500,500,frame,"assets/EMIS_Homepage_2-e1458668348754-1180x531.jpg");
        customLabel(new Label(),labelX,70,labelW,labelH,0,frame,fontSmallMonospaced,secondaryColor,whiteColors,"Student Page");
        customLabel(new Label(),300,110,labelW-10,labelH,2,frame,fontSmallMonospaced,secondaryColor,whiteColors,"Search Student");
        customTextField(textFieldSearch,null,450,110,490,35,frame,fontSmallMonospaced);
        customButton(buttonSearch,950,110,150,35,frame,grayColors,"Search");
        customButton(buttonRefresh,1110,110,150,35,frame,grayColors,"Refresh");
        customButton(buttonAdd,labelX,110,buttonW,buttonH,frame,grayColors,"+ Add new");
        customButton(buttonBack,labelX,700,buttonW,buttonH,frame,grayColors,"Back");
        customButton(buttonU,labelX+buttonW,700,buttonW,buttonH,frame,grayColors,"Update");
        customButton(buttonDelete,labelX+buttonW*2,700,buttonW,buttonH,frame,grayColors,"Delete");
        customButton(buttonExit,950,700,150,buttonH,frame,grayColors,"Exit");
        customButton(buttonLogout,1110,700,150,buttonH,frame,grayColors,"Logout");

        customLabel(labelTitle,0,0,1300,50,1,frame,fontLargeMonospaced,primaryColor,whiteColors,"Student management system");

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudentPage();
            }
        });
        buttonU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog(null,"Find Id to update");
                for (StudentModel s : studentModels) {
                    if (s.getId() == Integer.parseInt(id)) {
                        updateStudentPage(s.getId(),s.getGender(),s.getFirstName(),s.getLastName(),s.getDate(),s.getEmail(),s.getPhone(),s.getAddress(),s.getMajorId(),s.getLearnTime());
                        return;
                    }
                }
                if(studentModels.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Student isEmpty");
                } else {
                    JOptionPane.showMessageDialog(null,"ID Not found 404!");
                }
            }
        });
        buttonAdds.addActionListener(new ActionListener() {
            static int id = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldId.getText().isEmpty() || checkboxGroup.getSelectedCheckbox() == null || choiceCourse.getSelectedItem() == "Select")
                    JOptionPane.showMessageDialog(null, "Filed is Requieerid");
                else {
                    StudentModel studentModel = new StudentModel(
                            Integer.parseInt(textFieldId.getText()),
                            textFieldFName.getText(),
                            textFieldLName.getText(),
                            checkboxGroup.getCurrent().getLabel(),
                            textFieldPhone.getText(),
                            textFieldEmail.getText(),
                            textFieldAddress.getText(),
                            choiceCourse.getSelectedItem(),
                            textFieldDate.getText(),
                            choiceTime.getSelectedItem()
                    );
                    studentModels.add(studentModel);
                    textArea.setText("");
                    for (StudentModel model : studentModels) {
                        textArea.append(model.display());
                    }
                    id++;
                    textFieldId.setText("");
                    textFieldFName.setText("");
                    textFieldLName.setText("");
                    textFieldPhone.setText("");
                    textFieldEmail.setText("");
                    textFieldAddress.setText("");
                    choiceCourse.select(0);
                    jframe.dispose();
                }
            }
        });
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a;
                a = JOptionPane.showConfirmDialog(null,"Are you sure?");
                if(a==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
                if(a == JOptionPane.NO_OPTION){
                    System.out.println("Mae Hg");
                }

            }
        });
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
               frame.toBack();
            }
        });
        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentModel studentModel = new StudentModel();
                for(int i=0; i<studentModels.size(); i++){
                    if(studentId == studentModels.get(i).getId()){
                        if(textFieldId.getText().isEmpty() || checkboxGroup.getSelectedCheckbox() == null || Objects.equals(choiceCourse.getSelectedItem(), "Select"))
                        JOptionPane.showMessageDialog(null, "Filed is Requieerid");
                        else{
                            studentModel.updateData(
                                    textFieldId.getText(),
                                    textFieldFName.getText(),
                                    textFieldLName.getText(),
                                    checkboxGroup.getCurrent().getLabel(),
                                    textFieldPhone.getText(),
                                    textFieldEmail.getText(),
                                    textFieldAddress.getText(),
                                    choiceCourse.getSelectedItem(),
                                    textFieldDate.getText(),
                                    choiceTime.getSelectedItem()
                            );
                        }
                        studentModels.set(i,studentModel);
                    }
                }
                textArea.setText("");
                for (int i = 0; i<studentModels.size();i++){
                    textArea.append(studentModels.get(i).display());
                }
                textFieldId.setText("");
                textFieldFName.setText("");
                textFieldLName.setText("");
                textFieldPhone.setText("");
                textFieldEmail.setText("");
                textFieldAddress.setText("");
                choiceCourse.select(0);
                jframe.dispose();
            }
        });
        buttonRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldSearch.setText("");
                textArea.setText("");
                for (StudentModel studentModel : studentModels) {
                    textArea.append(studentModel.display());
                }
            }
        });
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for(StudentModel s : studentModels){
                    if(textFieldSearch.getText().equals(s.getFirstName()+" "+ s.getLastName())){
                        textArea.append(s.display());
                    }
                }
            }
        });
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog(null,"Find Id to delete");
                for (int i=0; i<studentModels.size();i++) {
                    if (studentModels.get(i).getId() == Integer.parseInt(id)) {
                        int a = JOptionPane.showConfirmDialog(null,studentModels.get(i).display());
                        if(a == JOptionPane.YES_OPTION){
                            studentModels.remove(i);
                        }
                        textArea.setText("");
                        for (StudentModel model : studentModels) {
                            textArea.append(model.display());
                        }
                        return;
                    }
                }
                if(studentModels.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Student isEmpty");
                } else {
                    JOptionPane.showMessageDialog(null,"ID Not found 404!");
                }

            }
        });
    }
    public static int studentId;
    public static void addStudentPage(){
        jframe = getFrameClose();
        customLabel(new Label(),0,0,systemW/2,50,1,jframe,fontMediumMonospaced,primaryColor,whiteColors,"ADD New Student");
        customLabel(new Label(),labelX,70,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Student ID");
        customLabel(new Label(),300,70,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Department");
        customLabel(new Label(),450,70,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Time");
        customLabel(new Label(),labelX,150,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Firstname");
        customLabel(new Label(),300,150,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Lastname");
        customLabel(new Label(),labelX,230,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Gender");
        customLabel(new Label(),labelX,310,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Date of Birth");
        customLabel(new Label(),labelX,390,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Email");
        customLabel(new Label(),300,390,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Phone number");
        customLabel(new Label(),labelX,470,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Address");

        customTextField(textFieldId,textFieldFName,labelX,110,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldFName,textFieldLName,labelX,190,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldLName,textFieldDate,300,190,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldDate,textFieldEmail,labelX,350,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customCheckBox(jframe,checkboxGroup,checkbox1,checkbox2,false,false);
        customTextField(textFieldEmail,textFieldPhone,labelX,430,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldPhone,textFieldAddress,300,430,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldAddress,null,labelX,510,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customSelected(choiceCourse,jframe,fontSmallMonospaced,300,110,labelW-50,labelH,StudentModel.majorList,0);
        customSelected(choiceTime,jframe,fontSmallMonospaced,450,110,labelW-50,labelH,StudentModel.timeList,0);

        customButton(buttonAdds,labelX,600,buttonW,buttonH,jframe,grayColors,"Done");
        customButton(buttonExits,labelX+buttonW,600,buttonW,buttonH,jframe,grayColors,"Close");

        buttonExits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe.dispose();
            }
        });

    }
    public static void updateStudentPage(int id,String gender,String firstName, String lastName,String date,String email,String phone,String address,String major,String time){
       jframe = getFrameClose();
        int index = 3;
        studentId = id;
        boolean sex = false;
        if(Objects.equals(gender, "Male")){
            sex = true;
        }
        for(int i=0; i<StudentModel.majorList.size(); i++){
            if(Objects.equals(major, StudentModel.majorList.get(i))){
                index = i;
            }
        }
        for(int j=0; j<StudentModel.timeList.size(); j++){
            if(Objects.equals(time, StudentModel.timeList.get(j))){
                index = j;
            }
        }

        customLabel(new Label(),0,0,systemW/2,50,1,jframe,fontMediumMonospaced,primaryColor,whiteColors,"Update Student Data");
        customLabel(new Label(),labelX,70,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Student ID");
        customLabel(new Label(),300,70,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Department");
        customLabel(new Label(),labelX,150,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Firstname");
        customLabel(new Label(),300,150,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Lastname");
        customLabel(new Label(),labelX,230,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Gender");
        customLabel(new Label(),labelX,310,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Date of Birth");
        customLabel(new Label(),labelX,390,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Email");
        customLabel(new Label(),300,390,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Phone number");
        customLabel(new Label(),labelX,470,labelW,labelH,0,jframe,fontSmallMonospaced,secondaryColor,whiteColors,"Address");
        textFieldId.setText(String.valueOf(id));
        textFieldFName.setText(firstName);
        textFieldLName.setText(lastName);
        textFieldEmail.setText(email);
        textFieldEmail.setText(email);
        textFieldPhone.setText(phone);
        textFieldAddress.setText(address);
        textFieldDate.setText(date);
        checkbox1.setFocusable(true);

        customTextField(textFieldId,textFieldFName,labelX,110,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldFName,textFieldLName,labelX,190,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldLName,textFieldDate,300,190,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customCheckBox(jframe,checkboxGroup,checkbox1,checkbox2,sex,!sex);
        customTextField(textFieldDate,textFieldEmail,labelX,350,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldEmail,textFieldPhone,labelX,430,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldPhone,textFieldAddress,300,430,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customTextField(textFieldAddress,null,labelX,510,textFieldW,textFieldH,jframe,fontSmallMonospaced);
        customSelected(choiceCourse,jframe,fontSmallMonospaced,300,110,labelW-50,labelH,StudentModel.majorList,index);
        customSelected(choiceTime,jframe,fontSmallMonospaced,450,110,labelW-50,labelH,StudentModel.timeList,index);

        customButton(buttonUpdate,labelX,600,buttonW,buttonH,jframe,grayColors,"Update");
        customButton(buttonExits,labelX+buttonW,600,buttonW,buttonH,jframe,grayColors,"Close");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public static void main(String[] args) {
        StudentSystemPage.studentSystem();
    }
}
