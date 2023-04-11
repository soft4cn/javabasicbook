package edu.myschool.chapter4;

public class MainMenu {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu(); //创建菜单类
        menu.showMenu();   //调用显示菜单的方法

    }

    //显示主菜单的方法
    public void showMenu() {
        System.out.println("1.开始游戏");
        System.out.println("2.游戏设置");
        System.out.println("3.游戏帮助");
        System.out.println("4.退出游戏");
    }
}
