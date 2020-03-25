package com.inputoutput;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class File10 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		File f = new File("d:\\filetest\\1.dat");
		//创建一个文件输出流对象fis
		FileInputStream fis = new FileInputStream(f);
		//创建要给多字节输入流对象dis，并且以fis作为参数
		DataInputStream dis = new DataInputStream(fis);
		try {
			//使用dis对象从f中读取数据
			System.out.println(dis.readUTF());
		}catch (Exception e) {
			
		}
		dis.close();
	}

}
