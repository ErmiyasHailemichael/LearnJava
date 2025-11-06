package com.pluralsight.OOPReview.classReview;

public class Student {
    private String name;
    private int grade;
    private String studentId;

    public Student(String name, int grade, String studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String introduce(){
        return "Hi, I'm " + name + ", and I am in grade " + grade +".";
    }

    public void updateGrade(int newGrade){
        this.grade = newGrade;
        // from my understanding I am returning the newGrade - which is updated
    }

    public String getStudentInfo(){
        return "The student name is " + name + ", " + "grade is " + grade + " and id is " + studentId + ".";

    }
}
