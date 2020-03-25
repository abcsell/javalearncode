package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;

public class File3 {//文件操作的类
	public static void main(String[] args) throws Exception{
		File f = new File("d:\\filetest\\file.txt");//创建文件对象f  定义的这个目录下必须有这个文件，主要是读取这个文件中的内容
		FileInputStream fis=new FileInputStream(f);//获取文件对象f的输出流对象
		char ch;//定义字符变量ch
		for(int i=0; i<f.length();i++) {//通过循环实现文件的读取
			ch=(char)fis.read();
			System.out.print(ch);
		}
		fis.close();//关闭输出流
	}
}
