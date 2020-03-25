package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 输入流和输出流结合使用
 * @author kls
 *其实就是读取file.txt中的内容，写到file2.txt中
 */
public class File6 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		//创建文件类对象f和f1
		File f = new File("d:\\filetest\\file.txt");//文件类对象
		File f1 = new File("d:\\filetest\\file2.txt");//文件类对象
		//创建文件输入流对象fis和文件输出流对象fos
		FileInputStream fis = new FileInputStream(f);//文件输出流对象
		FileOutputStream fos = new FileOutputStream(f1);//文件输出流对象
		//创建字节数组对象b
		byte[] b =new byte[(int)f.length()];
		fis.read(b);
		//使用循环语句将字节数组中的数据往f中写
		for(int i=0; i<f.length();i++) {
			fos.write(b[i]);
		}
		//关闭输入输出流
		fis.close();
		fos.close();
	}

}
