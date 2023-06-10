package edu.myschool.chapter7;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String args[]){
        Set set = new HashSet();
        set.add("apple");//添加元素
        set.add("orange");//添加元素
        set.add("pear");
        set.add("pear");//重复元素只保存一个
        set.add("banana");
        System.out.println(set);
    }
}
