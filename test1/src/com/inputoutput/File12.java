package com.inputoutput;
import java.io.*;
public class File12 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		File f=new File("d:\\filetest\\1.txt");//创建文件类对象f
		//创建一个输入流对象fis，并且以f作为参数
		FileInputStream fis=new FileInputStream(f);
		//创建一个字符输入流对象isr，并且以fis作为参数
		@SuppressWarnings("resource")
		InputStreamReader isr = new InputStreamReader(fis);
		char st = (char)isr.read();//将读出的数据放入字符st中
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
	}

}
