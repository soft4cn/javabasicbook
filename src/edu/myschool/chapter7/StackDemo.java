package edu.myschool.chapter7;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");//入栈
        stack.push("b");//入栈
        stack.push("c");//入栈
        System.out.print(stack.pop()+",");//出栈
        System.out.print(stack.pop()+",");//出栈
        System.out.println(stack.pop());//出栈
    }

}
