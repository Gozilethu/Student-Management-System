
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user pc
 */
//interface of Manageable
public interface Manageable {
    void add();
    void remove();
    String displayAll();
}

//Student class implements Manageable class 
class Student implements Manageable {
    private String studentID;
    private String name;
    private int age;
    private double grade;

    private static List<Student> students = new ArrayList<>();

    //Getter for Student
    public String getStudentID() {
        return studentID;
    }
    
    //Setter for Student
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

    //@Override Add method
    public void add() {
        students.add(this);
    }

    //@Override Remove method
    public void remove() {
        students.remove(this);
    }

    //@Override DisplayAll method
    public String displayAll() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
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

//College Student class extends student class
class CollegeStudent extends Student {
    private String major;

    private static List<Student> students = new ArrayList<>();

    //Getter for Major
    public String getMajor() {
        return major;
    }
    
    //Setter for Major
    public void setMajor(String major) {
        this.major = major;
    }

    //@Override ADD method
    public void add() {
        students.add(this);
    }

    //@Override Remove method
    public void remove() {
        students.remove(this);
    }

    //@Override Display All method
    public String displayAll() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
