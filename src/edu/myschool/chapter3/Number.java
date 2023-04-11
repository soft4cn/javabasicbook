package edu.myschool.chapter3;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入一个整数：");
            num = input.nextInt();
            //判断输入的数据
            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            } else {
                System.out.println("输入的数字：" + num);
            }
        }
        System.out.println("程序结束！");
    }

}
