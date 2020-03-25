package com.inputoutput;
import java.io.*;
public class File22 {

	public static void main(String[] args)throws Exception {
		// TODO 自动生成的方法存根
		File f = new File("d://filetest//raf.txt");
		//创建一个随机访问类对象raf
		RandomAccessFile raf =new RandomAccessFile(f,"rw");
		String s= "这就是学校最好的学生呢";//创建字符串对象
		//输出相应信息
		System.out.println("现在要添加数据了！");
		//让raf的指针指向内部数据的末端
		try {
			long i = raf.length();
			raf.seek(i);
			raf.writeUTF(s);
			System.out.println("刚刚加到后面的字符串是:");
			raf.seek(i);
			System.out.println(raf.readUTF());
			raf.seek(0);
			System.out.println(raf.readUTF());
			raf.close();
		}catch(Exception e) {
			
		}
	}

}
