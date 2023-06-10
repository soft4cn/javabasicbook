package edu.myschool.chapter7;
import java.util.*;
public class HashtableDemo {
    public static void main(String args[]) {
        Map map = new Hashtable();
        map.put("1", null);//空值，编译时将出错
        map.put(null, "Java OOP");//空键，编译时将出错
        Collection col = map.values();
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
