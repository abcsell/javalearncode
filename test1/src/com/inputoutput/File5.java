package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File5 {
	public static void main(String[] args) throws Exception{
		File f = new File("d:\\filetest\\file.txt");//文件类对象
		FileOutputStream fos = new FileOutputStream(f);//文件输出流对象
		for(int i = 'a';i<='z';i++) {//通过循环语句向f写入
			fos.write(i);
		}
		fos.close();
		FileInputStream fis=new FileInputStream(f);
		char ch;
		for(int i= 0;i<f.length(); i++) {
			ch=(char)fis.read();
			System.out.print(ch);
		}
		
		fis.close();
	}
}

