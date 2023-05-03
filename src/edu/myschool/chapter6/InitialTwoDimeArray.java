package edu.myschool.chapter6;

import java.util.Scanner;

public class InitialTwoDimeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //声明一个2行3列的二维数组
        int[][] scores = new int[2][3];
        //为数组赋值
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "个班级第" + (j + 1)
                        + "个学生的成绩");
                scores[i][j] = input.nextInt();
            }
        }

        //输出学生成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个班级学生的成绩如下：");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
