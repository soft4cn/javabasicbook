package edu.myschool.chapter9;

import java.io.*;
public class TestLineNumberReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("code1.txt");
		FileWriter fw = new FileWriter("code2.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		lnr.setLineNumber(0);
		String str = null;
		while ((str = lnr.readLine()) != null) {
			fw.write(lnr.getLineNumber() + ":" + str);
			fw.write("\r\n");
		}
		fw.close();
		lnr.close();
	}
}