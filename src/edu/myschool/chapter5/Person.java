package edu.myschool.chapter5;

public class Person {
    public String name;
    public int age;

    public Person() {
        System.out.println("Person构造函数被调用！");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person有参的构造函数被调用！");
    }

    public void introduce() {
        System.out.println("我是" + name);
    }
}
