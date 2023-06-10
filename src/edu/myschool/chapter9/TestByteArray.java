package edu.myschool.chapter9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class TestByteArray {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 1;
        int c = 2;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(a);
        baos.write(b);
        baos.write(c);
        baos.close();
        byte[] buff = baos.toByteArray();
        for (int i = 0; i < buff.length; i++)
            System.out.println(buff[i]);
        System.out.println("***********************");
        ByteArrayInputStream bais = new ByteArrayInputStream(buff);
        while ((b = bais.read()) != -1) {
            System.out.println(b);
        }
        bais.close();
    }
}