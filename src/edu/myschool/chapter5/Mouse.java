package edu.myschool.chapter5;

class Equipment {
    public void inputInfo() {
        System.out.println("输入信息！");
    }
}

public class Mouse extends Equipment implements IConnection{
    @Override
    public void getConnection() {
        System.out.println("连接鼠标！");
    }
}
