package edu.myschool.chapter2;

public class MathOp {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        int result;
        //加法运算
        result = num1 + num2;
        System.out.printf("%d + %d的结果是%d\n", num1, num2, result);
        //减法运算
        result = num1 - num2;
        System.out.printf("%d - %d的结果是%d\n", num1, num2, result);
        //乘法运算
        result = num1 * num2;
        System.out.printf("%d * %d的结果是%d\n", num1, num2, result);
        //除法运算
        result = num1 / num2;
        System.out.printf("%d / %d的结果是%d\n", num1, num2, result);
        //求余运算
        result = num1 % num2;
        System.out.printf("%d %% %d的结果是%d\n", num1, num2, result);
    }

}
