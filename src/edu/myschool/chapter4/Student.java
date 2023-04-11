package edu.myschool.chapter4;

public class Student {
    String name;  //姓名
    int age;      //年龄

    public static void main(String[] args) {
        Student axy = new Student();  //创建学生对象
        axy.name = "艾边成";     //为对象的name属性赋值
        int score = axy.test();  //调用学生考试的方法，并使用score接收方法返回的值
        System.out.println(axy.name + "的考试成绩为：" + score);  //输出考试结果
    }

    //考试返回成绩的方法
    public int test() {
        System.out.println("考试...");
        int score = 90;
        return score;
    }

}

