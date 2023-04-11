package edu.myschool.chapter2;

public class FormatShow {
    public static void main(String[] args) {
        String name = "艾边城";
        double money = 220_666_555;
        System.out.printf("%s在2023年拥有财富%12.2f元", name, money);
    }
}
