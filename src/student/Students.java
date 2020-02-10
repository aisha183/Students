/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author PC
 */
public class Students {
    private int id;
    private String name;
    private String major;
    private double grade;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public String toString() {
     
       return "ID = "+ this.id+"\n Name is "+this.name+"\n major"+this.major+ "\n Grade = "+this.grade;
   }
      
    
}
