package edu.myschool.chapter3;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生成绩：");   //提示输入学生成绩
        int score = input.nextInt();    //从控制台接收输入的成绩
        if (score >= 60) {            //判断成绩是否及格
            System.out.println("成绩合格，获得软件工程师证书！");
        }
    }
}
