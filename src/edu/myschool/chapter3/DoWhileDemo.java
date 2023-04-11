package edu.myschool.chapter3;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        int score;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("学生参加考试！");
            System.out.print("老师请输入学生考试成绩：");
            score = input.nextInt();
        } while (score < 60);
        System.out.println("考试成绩合格！");
    }
}
