package edu.myschool.chapter3;

import java.util.Scanner;

public class Sport {
    public static void main(String[] args) {
        char gender; //性别
        int age; //年龄
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生性别：");
        gender = input.next().charAt(0);
        System.out.println("请输入学生年龄：");
        age = input.nextInt();
        //判断成绩是否达标
        if (gender == '男') {
            if (age >= 18) {
                System.out.println("可以报A类比赛项目");
            } else {
                System.out.println("可以报B类比赛项目");
            }
        } else {
            System.out.println("可以报C类比赛项目");
        }
    }
}
