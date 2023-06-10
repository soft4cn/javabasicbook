package edu.myschool.chapter8;

import java.util.Scanner;

public class ExceptionDemo1 {
    public int div(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public static void main(String args[]) {
        ExceptionDemo1 demo = new ExceptionDemo1();
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        System.out.println(demo.div(firstNum, secondNum));
    }

}
