package edu.myschool.chapter9;

import java.io.*;

public class TestConvert {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        FileOutputStream fos = new FileOutputStream("target.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        int str;
        while ((str = isr.read()) != -1) {
            osw.write(str);
        }
        osw.close();
        isr.close();
    }
}