package edu.myschool.chapter9;

import java.io.*;

public class TestFileCopyBuffer {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src\\test.jpg");
        FileOutputStream fos = new FileOutputStream("tar\\test.jpg");
        byte[] b = new byte[512];
        int len;
        long begin = System.currentTimeMillis();
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("时间开销:" + (end - begin));
        fos.close();
        fis.close();
    }
}