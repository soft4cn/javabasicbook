package edu.myschool.chapter3;

import java.util.Scanner;

public class GetMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //声明变量
        int num1, num2, max;
        //输入数字
        System.out.println("输入第一个数字：");
        num1 = input.nextInt();
        System.out.println("输入第二个数字：");
        num2 = input.nextInt();
        //判断后获得最大值
        if (num1 >= num2) {
            max = num1;
        } else {
            max = num2;
        }
        //输出最大值
        System.out.println("最大值为：" + max);
    }
}
