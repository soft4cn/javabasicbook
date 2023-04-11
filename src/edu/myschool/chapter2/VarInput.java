package edu.myschool.chapter2;

import java.util.Scanner;

public class VarInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入学生的信息
        System.out.println("请输入学生的成绩：");
        int score = input.nextInt();    //接收键盘输入的整数，存储到score变量中
        System.out.println("请输入学生的姓名：");
        String name = input.next();  //接收键盘输入的文本信息，存储到name变量中
        System.out.println("请输入学生的性别：");
        char sex = input.next().charAt(0); //接收键盘输入的一个字符，存储到sex变量中
        //输出学生的信息
        System.out.println("学生信息如下：");
        System.out.println("--------------------------");
        System.out.println("姓名:" + name);
        System.out.println("性别:" + sex);
        System.out.println("成绩:" + score);
    }
}
