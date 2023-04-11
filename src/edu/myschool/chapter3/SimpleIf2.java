package edu.myschool.chapter3;

import java.util.Scanner;

public class SimpleIf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int writtenScore;//笔试成绩
        int practiceScore; //机试成绩
        System.out.println("请输入笔试成绩：");
        writtenScore = input.nextInt();
        System.out.println("请输入机试成绩：");
        practiceScore = input.nextInt();
        //判断笔试与机试成绩是否都合格
        if (writtenScore >= 60 && practiceScore >= 60) {
            System.out.println("笔试与机试都合格，获得软件工程师证书！");
        }
    }

}
