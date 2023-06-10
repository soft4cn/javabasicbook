package edu.myschool.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class TestNIO {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("nio.txt");
        FileChannel fc = fos.getChannel();
    }
}
