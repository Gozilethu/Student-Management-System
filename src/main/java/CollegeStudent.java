/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user pc
 */
public class CollegeStudent {
    private String major;
    
    //Constructor
    CollegeStudent(String studentID, String name, int age, double grade, String major) {
        //super(studentID, name, age, grade);
        this.major = major;
    }
    
    //Getter for major
    public String getMajor() {
        return major;
    }
    
    //Setter for major
    public void setMajor(String major) {
        this.major = major;
    }
}
