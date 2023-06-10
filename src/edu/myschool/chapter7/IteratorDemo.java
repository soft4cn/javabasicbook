package edu.myschool.chapter7;
import java.util.*;
public class IteratorDemo {
    public static void main(String args[]){
        Set set = new HashSet();
        set.add("apple");//添加元素
        set.add("orange");//添加元素
        set.add("pear");
        set.add("pear");//重复元素只保存一个
        set.add("banana");
        //调用set.iterator方法返回对set 中的元素进行迭代的迭代器
        Iterator iterator = set.iterator();
        //iterator.hasNext是判断迭代器中是否有元素可迭代
        while(iterator.hasNext()){
            //iterator.next()是返回迭代器的下一个元素
            System.out.println(iterator.next());
        }
    }

}
