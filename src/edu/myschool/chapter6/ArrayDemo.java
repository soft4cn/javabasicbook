package edu.myschool.chapter6;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] scores = new int[5]; //成绩数组
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5位学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt(); //为数组元素赋值
            sum = sum + scores[i]; //累加成绩求和
        }
        //计算平均分
        double avg = (double) sum / scores.length;
        System.out.println("学生的平均成绩是：" + avg);
    }
}
