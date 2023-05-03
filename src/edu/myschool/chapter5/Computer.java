package edu.myschool.chapter5;

class Printer {
    public void  print(String str) {
        System.out.println("打印");
    }
}
class ColorPrinter extends  Printer{
    public void print(String str) {
        System.out.println("输出彩色的"+str);
    }
}

class BlackPrinter extends  Printer{
    public void print(String str) {
        System.out.println("输出黑白的"+str);
    }
}

public class Computer {

    private String inputInfo;
    public void print(Printer printer , String inputInfo){
        printer.print(inputInfo);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Printer printer1 = new BlackPrinter();
        Printer printer2 = new ColorPrinter();
        computer.print(printer1,"信息");
        computer.print(printer2,"信息");
    }

    //在类中建立三个名称相同的方法，参数不同
//    public double add(int firstNum,int secondNum) {
//        return firstNum+secondNum;
//    }
//    public double add(float firstNum,float secondNum) {
//        return firstNum+secondNum;
//    }
//    public static void main(String args[]) {
//        Computer computer = new Computer();
//        System.out.println("两个整数的和是:"+computer.add(2,3));
//        System.out.println("两个float类型数的和是:"+computer.add(2.7f,3.3f));
//    }
}

