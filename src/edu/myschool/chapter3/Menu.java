package edu.myschool.chapter3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choose = 0;
        Scanner input = new Scanner(System.in);             //创建键盘输入对象
        System.out.println("\t欢迎进入电子商务系统");      //打印出提示信息
        System.out.println("************************************");
        System.out.println("\t1.查看商品");
        System.out.println("\t2.我的购物车");
        System.out.println("\t3.购物结算");
        System.out.println("\t4.注销");
        System.out.println("************************************");
        System.out.print("请输入选项：");
        choose = input.nextInt();  //接收键盘输入的整数选择
        //使用多重if结构对多种不同的结果进行判断，并作出不同的响应
        if (choose == 1) {
            System.out.println("查看商品>进入查看商品界面！");
        } else if (choose == 2) {
            System.out.println("查看商品>进入我的购物车界面！");
        } else if (choose == 3) {
            System.out.println("查看商品>进入购物结算界面！");
        } else if (choose == 4) {
            System.out.println("系统已注销！");
        } else {
            System.out.println("输入错误！");
        }
    }
}
