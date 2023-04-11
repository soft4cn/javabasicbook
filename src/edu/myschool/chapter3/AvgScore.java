package edu.myschool.chapter3;

import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = input.nextLine();
        int sum = 0, score;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "门课程的成绩:");
            score = input.nextInt(); //接收输入的成绩
            sum += score;  //累加成绩求总分
        }
        double avg = sum / 5.0; //计算平均分
        System.out.printf("学生%s考试的平均成绩:%.2f", name, avg);
    }

}
