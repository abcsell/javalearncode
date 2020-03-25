package com.异常和内存;

import java.io.File;
import java.io.RandomAccessFile;

public class File4 {
	//抛出异常
	public static void main(String[] args ) throws Exception {//主方法
		File f=new File("d://raf.txt");//创建file类对象
		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		String s="这是我们学校最好的学生";
		System.out.println("现在要添加数据了！");
	try {
		long i=raf.length();//读取的长度
		raf.seek(i);
		raf.writeUTF(s);//利用UTF-8编码写入字符
		System.out.println("刚刚加到后面的字符串是：");
		raf.seek(i);//跳过一个字符
		System.out.println(raf.readUTF());
		raf.seek(0);
		System.out.println(raf.readUTF());
		raf.close();
	}catch (Exception e) {
		
	}
	}
}
