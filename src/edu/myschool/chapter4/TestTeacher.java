package edu.myschool.chapter4;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher zs = new Teacher();
        zs.teach();

        Teacher ls = new Teacher("李老师", 35);
        ls.teach();
    }
}
