package edu.myschool.chapter5;

public class Undergraduate extends Student1 {
    public String major;

    public void introduce() {
        super.introduce();
        System.out.println("我就读于" + schoolName + ",专业是" + major + ",我的学号是" + studentNumber);
    }
}
