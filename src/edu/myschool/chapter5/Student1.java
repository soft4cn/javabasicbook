package edu.myschool.chapter5;

public class Student1 extends Person {
    public String schoolName;
    public String studentNumber;
    public String grade;

    public void introduce() {
        System.out.println("我是" + name + ",就读于" + schoolName + ",我的学号是" + studentNumber);
    }
}
