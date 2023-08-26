/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user pc
 */
public class Student {
    private String studentID;
    private String name;
    private int age;
    private double grade;
    
    //Constructor for Student
    public Student(String studentID, String name, int age, double grade){
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //Getter for Student ID
    public String getStudentID() {
        return studentID;
    }

    //Setter for Student ID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    //Getter for Name
    public String getName() {
        return name;
    }

    //Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for Age
    public int getAge() {
        return age;
    }

    //Setter for Age
    public void setAge(int age) {
        this.age = age;
    }

    //Getter for Grade
    public double getGrade() {
        return grade;
    }

    //Setter for Grade
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    //@Override toString method
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
