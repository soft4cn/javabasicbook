package edu.myschool.chapter3;

public class GetSum {
    public static void main(String[] args) {
        int count = 1, sum = 0;
        while (count <= 100) {
            sum += count; //累加求和
            count++; //条件改变，被加入sum中的值也会递增
        }
        System.out.println("1~100的整数之间的和为：" + sum);
    }

}
