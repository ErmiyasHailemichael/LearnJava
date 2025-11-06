package com.pluralsight.OOPReview.classReview;

public class StudentApp {
    public static void main(String[] args) {
        Student ermi = new Student("Ermiyas",12,"2019");
        Student messi = new Student("Mishael",5,"4567");
        Student nao = new Student("Naomi",4,"2345");

        // introduce
        System.out.println("*********************");
        System.out.println(ermi.introduce());
        System.out.println(messi.introduce());
        System.out.println(nao.introduce());

        System.out.println("*********** UPDATE GRADE **********");

//        nao.updateGrade(13);
         nao.updateGrade(13); // first update the grade
        // System.out.println(nao.getGrade()); // call the grade using the get method
        System.out.println(nao.introduce()); // print it to the console to the updated value in the object
        messi.updateGrade(6);
        System.out.println(messi.introduce());
        ermi.updateGrade(11);
        System.out.println(ermi.introduce());


        System.out.println("********** GET STUDENT INFO ***********");

        messi.getStudentInfo();
        System.out.println(messi.getStudentInfo());
        System.out.println(ermi.getStudentInfo());
        System.out.println(nao.getStudentInfo());

    }



}
