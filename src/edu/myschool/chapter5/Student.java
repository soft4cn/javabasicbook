package edu.myschool.chapter5;

public class Student {
    private String name;
    private int age;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("我的姓名：" + this.name + ", 年龄：" + age + ", 考试成绩：" + score);
    }
}
