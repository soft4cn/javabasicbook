package edu.myschool.chapter2;

public class LogicOp {
    public static void main(String[] args) {
        int writtenScore = 86; //笔试成绩
        int practiceScore = 58; //机试成绩
        //判定笔试成绩与机试成绩是否都合格
        boolean result = (writtenScore >= 60) && (practiceScore >= 60);
        System.out.println("能够获得软件工程师证书的判定结果为：" + result);
    }
}
