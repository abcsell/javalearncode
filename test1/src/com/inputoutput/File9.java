package com.inputoutput;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

//关于文件的类
public class File9 {
	public static void main(String[] args) throws Exception {
	//	String st;
		File f= new File("d:\\filetest\\1.dat");//创建一个文件类对象f,执行后该位置写入数据
		//创建要给文件输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个多字节输出流对象dos，并且以fos作为参数
		DataOutputStream dos= new DataOutputStream(fos);
		//使用dos对象将数据写入到f中
		try {
			dos.writeUTF("明天要下雨了。");
			dos.writeUTF("明天要下雨了。");
			dos.writeUTF("明天要下雨了。");
			dos.writeUTF("明天要下雨了。");
		}catch(Exception e) {
			
		}
		dos.close();
	}
}
