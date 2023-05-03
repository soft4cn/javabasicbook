package edu.myschool.chapter6;

import java.util.Scanner;

public class TestAvgAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];        //定义存储10名同学的年龄数组
        int sumAges = 0;
        for (int i = 0; i < 10; i++) {        //循环10次
            System.out.println("请输入第”+i+”位同学的年龄：");
            ages[i] = input.nextInt();        //接收键盘输入的年龄，并存储到数组对应的下标中
            //累加年龄总和
            sumAges += ages[i];
        }
        System.out.println("班上同学的平均年龄是" + (sumAges / 10));
    }

}
