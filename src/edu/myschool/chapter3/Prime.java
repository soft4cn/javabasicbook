package edu.myschool.chapter3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = input.nextInt();
        boolean flag = true;
        //验证是否为质数
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        //输出结果
        if (flag == true)
            System.out.printf("%d为质数", num);
        else
            System.out.printf("%d为非质数", num);
    }
}
