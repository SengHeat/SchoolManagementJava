package assignment.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentModel {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
    private String  email;
    private String address;
    private String majorId;
    private String date;
    private String learnTime;
    public StudentModel(){}

    public StudentModel(int id, String firstName, String lastName, String gender, String phone, String email, String address, String majorId, String date, String learnTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.majorId = majorId;
        this.date = date;
        this.learnTime = learnTime;
    }

    public void updateData(String id, String firstName, String lastName, String gender, String phone, String email, String address, String majorId, String date,String learnTime) {
        setId(Integer.parseInt(id));
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setEmail(email);
        setPhone(phone);
        setAddress(address);
        setMajorId(majorId);
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
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }
    public void setLearnTime(String learnTime) {
        this.learnTime = learnTime;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
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
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getMajorId() {
        return majorId;
    }

    public String getLearnTime() {
        return learnTime;
    }

    public String display(){
        return getId()+"\t"+getFirstName()+" "+getLastName()+"\t"+getGender()+"\t"+getMajorId()+"\t"+getLearnTime()+"\t"+getPhone()+"\t"+getEmail()+"\t"+getAddress()+"\n";
    }

    static public final ArrayList<String> majorList = new ArrayList<>(Arrays.asList("Select","Computer Science","Information Technology Engineering","History","Math","Cemistry","Physics"));
    static public final ArrayList<String> timeList = new ArrayList<>(Arrays.asList("Morning","Afternoon","Evening"));

}
