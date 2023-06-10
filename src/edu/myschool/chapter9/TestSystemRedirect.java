package edu.myschool.chapter9;

import java.io.*;

public class TestSystemRedirect {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src.txt"));
        System.setOut(new PrintStream("tar.txt"));
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}