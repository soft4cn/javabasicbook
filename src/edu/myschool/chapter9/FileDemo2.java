package edu.myschool.chapter9;

import java.io.File;
import java.io.RandomAccessFile;

public class FileDemo2 {
    public static void main(String[] args) throws Exception {
        File f = new File("info.txt");
        RandomAccessFile rdf = new RandomAccessFile(f, "r");
        String name = "";
        int age = 0;
        byte[] b = new byte[4];
        rdf.skipBytes(7);//跳过7个字节,即跳过第一个人的信息
        for (int i = 0; i < b.length; i++) {
            b[i] = rdf.readByte();
        }
        name = new String(b);
        age = rdf.readInt();
        System.out.println("第二个人信息--->姓名:" + name + ";年龄:" + age);
        rdf.seek(0);//指针回到文件开始
        b = new byte[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = rdf.readByte();
        }
        name = new String(b);
        age = rdf.readInt();
        System.out.println("第一个人信息--->姓名:" + name + ";年龄:" + age);
        rdf.close();
    }

}
