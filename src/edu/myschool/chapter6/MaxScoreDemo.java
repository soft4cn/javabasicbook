package edu.myschool.chapter6;

import java.util.Scanner;

public class MaxScoreDemo {
    public static void main(String[] args) {
        int[] scores = new int[5]; //成绩数组
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5位学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt(); //为数组元素赋值
        }
        //计算最大值
        int max = scores[0];			//假设第一个最大，则后续的与其相比
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {		//如果后面的更大，那么max就应该改变为当前的最大的
                max = scores[i];
            }
        }
        System.out.println("考试成绩最高分为:" + max);
    }

}
