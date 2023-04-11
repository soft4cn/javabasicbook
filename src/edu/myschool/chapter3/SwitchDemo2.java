package edu.myschool.chapter3;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int no = 2;   //成绩名次
        switch (no) {
            case 1:
                System.out.println("奖励华为手机");
            case 2:
                System.out.println("奖励移动硬盘");
            case 3:
                System.out.println("奖励鼠标");
            default:
                System.out.println("没有任何奖励");
        }
    }
}
