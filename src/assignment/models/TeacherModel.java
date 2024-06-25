package assignment.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TeacherModel {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String date;
    private String age;
    private String phone;
    private String email;
    private String skill;

    public TeacherModel() {}
    public TeacherModel(int id, String firstName, String lastName, String gender, String date, String age, String phone, String email, String skill) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.date = date;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.skill = skill;
    }
    public void updateData(String id, String firstName, String lastName, String gender, String phone, String email, String majorId, String date) {
        setId(Integer.parseInt(id));
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setEmail(email);
        setPhone(phone);
        setSkill(majorId);
        setDate(date);
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public String getDate() {
        return date;
    }
    public String getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getSkill() {
        return skill;
    }
    public String display(){
        return getId()+"\t"+getFirstName()+" "+getLastName()+"\t"+getGender()+"\t"+getSkill()+"\t"+getPhone()+"\t"+getEmail()+"\t"+"\n";
    }
    public static ArrayList<TeacherModel> teacherModels = new ArrayList<>();
    static public final ArrayList<String> subjectList = new ArrayList<>(Arrays.asList("Select","Math","Khmer","Program","Physics","Biology","History"));
}
