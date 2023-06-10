package edu.myschool.chapter7;
import java.util.*;
public class MapDemo {
    public static void main(String args[]){
        Map map = new HashMap();
        map.put("bookName","Java OOP");
        map.put("author", "Jack");
        map.put("price", 50);//自动装箱
        map.put("price", 80);//出现重复的键:price
        map.put(null,"nothing");//空键
        Collection col = map.values();//取出Map中全部的value
        Iterator iterator = col.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
