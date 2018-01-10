package oot.lab5.test;

public class Student {
    private String name = "";
    private String sid = "";
    private double gpa = 0;
    private Major major = null;
    
    public Student() {
       
    }
    
    public Student (String name, String sid, double gpa){
            this.name = name;
            this.sid = sid;
            this.gpa = gpa;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSid(){
        return sid;
    }
    
    public void setSid(String sid){
        this.sid = sid;
    }
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public Major getMajor(){
        return major;
    }
    
    public void setMajor(Major major){
        this.major = major;
    }
}
