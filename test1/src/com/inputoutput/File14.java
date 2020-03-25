package com.inputoutput;
import java.io.*;
public class File14 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		File f = new File("d:\\filetest","1.txt");
		//创建一个输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个字符输出流对象osw，并且以fos作为参数
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("美");
		osw.close();
	}

}
