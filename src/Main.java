
import assignment.models.StudentModel;
import assignment.views.LoginSystemPage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel("1","Heat","Female","IT","M","012242912","heat@gmail.com","Kompong cham","02-05-2005","Mo");
        ArrayList<StudentModel> oldData = StudentModel.readFile("d:\\JavaFile\\assignment\\student.txt");
        System.out.println("===========================================");
        oldData.add(studentModel);


       StudentModel.writeFile("d:\\JavaFile\\assignment\\student.txt",oldData);
       for (StudentModel studentModel1 : oldData){
           System.out.println(studentModel1);
       }
        LoginSystemPage.getLoginPage();
    }
}