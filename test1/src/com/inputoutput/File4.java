package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;

public class File4 {
	public static void main(String[] args) throws Exception{
		File f = new File("d:\\filetest\\file.txt");//创建文件对象f  定义的这个目录下必须有这个文件，主要是读取这个文件中的内容
		FileInputStream fis=new FileInputStream(f);//获取文件对象f的输出流对象
		byte[] b = new byte[(int)f.length()];//定义一个字节数组对象
		//将所有的字节都保存到一个字节数组b中
		fis.read(b);
		for(int i=0; i<f.length();i++) {//通过循环实现文件的读取
			
			System.out.print((char)b[i]);
		}
		fis.close();//关闭输出流
	}
}
