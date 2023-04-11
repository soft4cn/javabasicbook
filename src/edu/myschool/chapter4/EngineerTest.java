package edu.myschool.chapter4;

public class EngineerTest {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer();
        System.out.println("初始化变量前:");
        engineer1.showInfo();
        System.out.println("初始化变量…");
        engineer1.name = "艾边成";
        engineer1.age = 24;
        engineer1.title = "中级软件工程师";
        System.out.println("初始化变量后:");
        engineer1.showInfo();
    }
}
