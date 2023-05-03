package edu.myschool.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] scores = new int[5]; //成绩数组
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5位学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt(); //为数组元素赋值
        }
        //数组排序
        Arrays.sort(scores);
        //排序结果
        System.out.print("学生成绩按升序排列:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
