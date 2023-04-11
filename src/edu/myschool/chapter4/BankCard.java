package edu.myschool.chapter4;

public class BankCard {
    String cardNO; //卡号
    int balance;   //余额

    public static void main(String[] args) {
        BankCard card = new BankCard();   //创建对象
        card.cardNO = "62225888888888"; //为卡号赋值
        card.deposit(500);  //存款
    }

    //显示余额
    public void show() {
        System.out.println("卡号:" + cardNO + "中的余额为：" + balance);
    }

    //存款
    public void deposit(int money) {
        System.out.println("存入金额:" + money);
        balance += money;//余额增加
        show();//显示余额
    }


}
