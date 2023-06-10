package edu.myschool.chapter9;

public class TestEncoded {
    public static void main(String[] args) throws Exception {
        String str = "我喜欢Java";
        byte[] byte1 = str.getBytes("GBK");
        byte[] byte2 = str.getBytes("UTF-8");
        System.out.println(new String(byte1, "GBK"));
        System.out.println(new String(byte2, "UTF-8"));
        System.out.println(new String(byte1, "UTF-8"));
        System.out.println(new String(byte2, "GBK"));
    }
}