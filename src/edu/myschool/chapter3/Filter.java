package edu.myschool.chapter3;

public class Filter {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0)      //如果是3的倍数则退出本次，继续下一次
                continue;  //跳过其后的语句，直接进入下一次循环
            System.out.println(i);
        }
    }

}
