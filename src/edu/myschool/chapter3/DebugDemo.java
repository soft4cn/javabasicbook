package edu.myschool.chapter3;

public class DebugDemo {
    public static void main(String[] args) {
        int sum = 0;  //存储相加的和
        for (int i = 1; i < 5; i++) {  //循环累加
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
