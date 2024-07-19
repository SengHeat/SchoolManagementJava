package assignment.models;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentModel {
    private String id;
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

    public StudentModel(String id, String firstName, String lastName, String gender, String phone, String email, String address, String majorId, String date, String learnTime) {
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

    public void updateData(String id, String firstName, String lastName, String gender, String phone, String email, String address, String majorId, String date, String learnTime) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setPhone(phone);
        setEmail(email);
        setAddress(address);
        setMajorId(majorId);
        setDate(date);
        setLearnTime(learnTime);
    }
    public void setId(String id) {
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
    public String getId() {
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

    @Override
    public String toString() {
        return String.join(",", id, firstName, lastName, gender, phone, email, address, majorId, date, learnTime);
    }

    public static StudentModel fromString(String line) {
        String[] parts = line.split(",");
        String id = parts.length > 0 ? parts[0] : "";
        String firstName = parts.length > 1 ? parts[1] : "";
        String lastName = parts.length > 2 ? parts[2] : "";
        String gender = parts.length > 3 ? parts[3] : "";
        String phone = parts.length > 4 ? parts[4] : "";
        String email = parts.length > 5 ? parts[5] : "";
        String address = parts.length > 6 ? parts[6] : "";
        String majorId = parts.length > 7 ? parts[7] : "";
        String date = parts.length > 8 ? parts[8] : "";
        String learnTime = parts.length > 9 ? parts[9] : "";

        return new StudentModel(id, firstName, lastName, gender, phone, email, address, majorId, date, learnTime);
    }

    public static void writeFile(String filePath, ArrayList<StudentModel> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (StudentModel studentModel : content) {
                writer.write(studentModel.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<StudentModel> readFile(String filePath) {
        ArrayList<StudentModel> content = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.add(StudentModel.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    static public final ArrayList<String> majorList = new ArrayList<>(Arrays.asList("Select", "Computer Science", "Information Technology Engineering", "History", "Math", "Chemistry", "Physics", "Mo", "JO", "KO", "ll", "LL"));
    static public final ArrayList<String> majorImageList = new ArrayList<>(Arrays.asList("Select", "assets\\it_de.png", "assets\\ite_de.png", "assets\\his.jpg", "assets\\math_de.png", "assets\\c.jpg", "assets\\p.png", "", "", "", "", "", ""));
    static public final ArrayList<String> timeList = new ArrayList<>(Arrays.asList("Morning", "Afternoon", "Evening"));

}
