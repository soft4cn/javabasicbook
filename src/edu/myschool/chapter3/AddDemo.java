package edu.myschool.chapter3;

import java.util.Scanner;

public class AddDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = input.nextInt();
        System.out.println("数字" + num + "的加法表如下:");
        for (int i = 0, j = num - 1; i < num; i++, j--) {
            System.out.printf("%d + %d = %d\n", i, j, num);
        }
    }
}
