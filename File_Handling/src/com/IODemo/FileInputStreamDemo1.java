package com.IODemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(".//src//com/IODemo/File1.java");
		int n = file.available();
		for(int i=0;i<n;i++) {
			System.out.print((char)file.read());
		}
		
		file.close();
	}
	
}
