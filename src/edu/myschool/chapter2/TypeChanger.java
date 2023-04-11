package edu.myschool.chapter2;

public class TypeChanger {
    public static void main(String[] args) {
        int r = 6;
        int round = (int) (2 * 3.14 * r);//求圆的周长，强制类型转换后会丢失精度
        System.out.println("半径为" + r + "的圆的周长为:" + round);
    }
}
