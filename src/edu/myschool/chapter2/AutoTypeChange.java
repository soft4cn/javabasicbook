package edu.myschool.chapter2;

public class AutoTypeChange {
    public static void main(String[] args) {
        // 自动转换示例1
        int a1 = 12;
        double b1 = 15.5;
        double result1 = a1 + b1; // a1将转换为double类型，最终运算的结果为double类型
        System.out.println(result1);

        // 自动转换示例2
        int a2 = 12;
        float b2 = 15.5f;
        float result2 = a2 + b2; // a2将转换为float类型，最终运算的结果为float类型
        System.out.println(result2);

        // 自动转换示例3
        int a3 = 10;
        long b3 = 1000;
        long result3 = a3 + b3;// a3将转换为long类型，最终运算的结果为long类型
        System.out.println(result3);

        // 自动转换示例4
        byte a4 = 10;
        char b4 = 'a'; // 字母a对应为97
        int result4 = a4 + b4; // a4、b4将转换为int类型，最终运算的结果为int类型
        System.out.println(result4);

    }
}
