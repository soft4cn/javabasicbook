package edu.myschool.chapter5;

public class Test2 {
    public static void main(String[] args) {
        Person person = new Undergraduate(); //向上转型，父类的引用指向子类对象
        person.name = "艾边城";
        person.age = 21;
        person.introduce();

        if (person instanceof Undergraduate) {
            Undergraduate undergraduate = (Undergraduate) person; //向下转型
            undergraduate.schoolName = "计算机学院";
            undergraduate.studentNumber = "2023100001";
            undergraduate.major = "计算机";
            undergraduate.introduce();
        }
    }
}
