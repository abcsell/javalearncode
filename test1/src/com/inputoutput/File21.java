package com.inputoutput;
import java.io.*;
public class File21 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		File f = new File("d://filetest//raf.txt");
		//创建一个随机访问类对象raf
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		//利用raf读取不同的数据类型的数据
		System.out.println(raf.readInt());
		System.out.println(raf.readChar());
		System.out.println(raf.readLong());
		System.out.println(raf.readFloat());
		System.out.println(raf.readDouble());
		System.out.println(raf.readUTF());
		raf.close();
		System.out.println("这就是文件的内容！");
	}

}
