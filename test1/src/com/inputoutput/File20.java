package com.inputoutput;
//randomAccessfile
import java.io.*;
public class File20 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		File f = new File("d://filetest//raf.txt");
		//创建一个随机访问类对象raf
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		//创建各种变量
		int x= 4;
		char c= 'a';
		long i=123;
		float f1 = 3.4f;
		double d = 4.222D;
		String str = "这些都是基本 数据类型的数据";
		//利用raf写入不同数据类型的数据到f中
		raf.writeInt(x);
		raf.writeChar(c);
		raf.writeLong(i);
		raf.writeFloat(f1);
		raf.writeDouble(d);
		raf.writeUTF(str);
		raf.close();//关闭对象
		System.out.println("文件已经创建完毕！");
	}

}
