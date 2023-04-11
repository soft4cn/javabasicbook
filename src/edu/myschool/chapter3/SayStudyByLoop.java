package edu.myschool.chapter3;

public class SayStudyByLoop {
    public static void main(String[] args) {
        int count = 1;           //定义计数器起始值1
        while (count <= 10) {       //定义重复的条件区间
            System.out.println("说第" + count + "遍:我要学好Java！"); //重复的内容
            count++;           //计数器累加，使其能够达到区间的极限，否则会死循环
        }
    }
}
