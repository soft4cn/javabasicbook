package edu.myschool.chapter3;

public class GetScore {
    public static void main(String[] args) {
        int score = 82;
        if (score >= 90) {  //考试成绩>=90
            System.out.println("优秀");
        } else if (score >= 80) {  // 90 >考试成绩>=80
            System.out.println("良好");
        } else if (score >= 60) {   // 80>考试成绩>=60
            System.out.println("中等");
        } else {                //考试成绩<60
            System.out.println("差");
        }
    }
}
