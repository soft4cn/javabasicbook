package edu.myschool.chapter3;

public class GetScore2 {
    public static void main(String[] args) {
        int score = 82;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("中等");
        } else if (score >= 80) {
            System.out.println("良好");
        } else {
            System.out.println("差");
        }
    }

}
