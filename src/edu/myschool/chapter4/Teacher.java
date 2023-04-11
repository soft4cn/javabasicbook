package edu.myschool.chapter4;

public class Teacher {
    String name;
    int age;

    public Teacher() {
        System.out.println("无参的构造方法被调用！");
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("在构造函数中为当前对象的属性赋值！");
    }

    public void teach() {
        System.out.println(this.name + "上课");
    }
}
