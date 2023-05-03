package edu.myschool.chapter5;

public class Student1 extends Person {
    public String schoolName;
    public String studentNumber;
    public String grade;

    public Student1( ) {

    }
    public Student1(String name, int age,String schoolName,String studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.schoolName = schoolName;
        System.out.println("Student构造函数被调用！");
    }

    public void introduce() {
        System.out.println("我是" + name + ",就读于" + schoolName + ",我的学号是" + studentNumber);
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1("Jack", 21, "软件学院" ,"2023010001");
        student1.introduce();
    }
}
