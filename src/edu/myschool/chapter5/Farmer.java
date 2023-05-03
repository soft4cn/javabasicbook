package edu.myschool.chapter5;

public class Farmer {
    //定义同名方法plant，参数类型为Apple
    public void plant(Apple apple) {
        System.out.println("plant:" + apple.getName());
    }

    //定义同名方法plant，参数类型为Orange
    public void plant(Orange orange) {
        System.out.println("plant:" + orange.getName());
    }
}

class Apple {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Orange {
    public String name;

    public Orange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class TestFarmer {
    public static void main(String args[]) {
        Farmer farmer = new Farmer();
        //根据传入的参数类型，决定调用哪个plant方法
        farmer.plant(new Apple("apple"));
        farmer.plant(new Orange("orange"));
    }
}

