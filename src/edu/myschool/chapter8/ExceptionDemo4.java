package edu.myschool.chapter8;

public class ExceptionDemo4 {
    public static void main(String args[]) {
        try {
            int a = 50;
            int result = a / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("没有找到匹配的异常");
        }
    }

}
