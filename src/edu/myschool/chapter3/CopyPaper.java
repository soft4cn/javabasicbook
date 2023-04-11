package edu.myschool.chapter3;

public class CopyPaper {
    public static void main(String[] args) {
        int count = 1;                  //循环计数器初始为1
        while (count <= 36) {             //循环终止条件为达到36
            System.out.println("复印第" + count + "份试卷");   //循环内容
            count++;//改变循环条件，已复印试卷加1     //计数器累加
        }
    }

}
