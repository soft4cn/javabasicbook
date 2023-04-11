package edu.myschool.chapter4;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 90, num2 = 75;
        int sum = calc.add(num1, num2);     //调用方法求和
//输出平均值
        System.out.println(num1 + "和" + num2 + "的平均值为：" + (sum / 2.0));
    }

    //计算两个数的和
    public int add(int num1, int num2) {
        return num1 + num2;
    }

}
