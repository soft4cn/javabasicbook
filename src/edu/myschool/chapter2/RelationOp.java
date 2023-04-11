package edu.myschool.chapter2;

public class RelationOp {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 90;
        boolean result;
        result = num1 > num2;
        System.out.printf("%d > %d的结果为:%b\n", num1, num2, result);
        result = num1 >= num2;
        System.out.printf("%d >= %d的结果为:%b\n", num1, num2, result);
        result = num1 < num2;
        System.out.printf("%d < %d的结果为:%b\n", num1, num2, result);
        result = num1 == num2;
        System.out.printf("%d == %d的结果为:%b\n", num1, num2, result);
        result = num1 != num2;
        System.out.printf("%d != %d的结果为:%b\n", num1, num2, result);

    }
}
