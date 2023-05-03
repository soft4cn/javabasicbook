package edu.myschool.chapter6.movie;

public class Movie {
    String name;//电影名称
    String type;//电影类型
    String actor;//主演
    double price;   //价格

    //返回电影信息
    public String toString() {
        return name + "\t\t" + type + "\t\t" + actor + "\t\t" + price;
    }
}

