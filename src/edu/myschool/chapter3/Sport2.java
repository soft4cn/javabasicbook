package edu.myschool.chapter3;

import java.util.Scanner;

public class Sport2 {
    public static void main(String[] args) {
        char gender; //性别
        int num; //引体向上的个数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生性别：");
        gender = input.next().charAt(0);
        System.out.println("请输入引体向上的个数：");
        num = input.nextInt();
        //判断成绩是否达标
        if (gender == '男') {
            if (num >= 12) {
                System.out.println("该男生引体向上成绩达标!");
            } else {
                System.out.println("该男生引体向上成绩不达标！");
            }
        } else {
            if (num >= 8) {
                System.out.println("该女生引体向上成绩达标!");
            } else {
                System.out.println("该女生引体向上成绩不达标！");
            }
        }
    }

}
