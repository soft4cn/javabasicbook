package edu.myschool.chapter9;

import java.io.*;

public class TestCopyBuffered {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src.txt");
        FileWriter fw = new FileWriter("tar.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String str;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}