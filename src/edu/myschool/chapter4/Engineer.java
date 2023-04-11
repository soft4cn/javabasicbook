package edu.myschool.chapter4;

public class Engineer {
    String name;  //老师的姓名
    int age;//老师的年龄
    String title;   //老师的职称


    //教学的方法
    public void work() {
        System.out.println("做项目");
    }

    //显示自己的信息
    public void showInfo() {
        System.out.printf("我是%s,年龄%d,职称为%s。", name, age, title);
    }
}
