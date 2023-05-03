package edu.myschool.chapter6.movie;

import java.util.Scanner;

public class Menu {
    //开始菜单
    public int startMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("1.新增电影");
        System.out.println("2.查看电影");
        System.out.println("3.放映设置");
        System.out.println("4.影票销售");
        System.out.println("5.退出系统");
        System.out.println("-----------------------------");
        System.out.print("请选择输入:");
        int choose = input.nextInt();
        return choose;
    }

    //运行系统
    public void startRun() {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入影院售票系统!");
        Menu menu = new Menu();
        Cinema cinema = new Cinema();
        cinema.initial(); //初始化
        int choose = 0;
        do {
            choose = menu.startMenu();
            switch (choose) {
                case 1:
                    cinema.addMovie();
                    break;
                case 2:
                    cinema.showAllMovie();
                    break;
                case 3:
                    cinema.setMovieRoom();
                    break;
                case 4:
                    cinema.saleTicket();
                    break;
                default:
                    System.out.println("谢谢使用！再见！");
                    System.exit(0);
                    break;
            }
            System.out.print("输入r返回主菜单:");
            if (!"r".equals(input.next())) {
                System.out.println("输入错误！程序结束！");
                break;
            }
        } while (true);
    }
}
