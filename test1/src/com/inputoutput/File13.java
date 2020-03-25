package com.inputoutput;
import java.io.*;
public class File13 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		File f= new File("d:\\filetest","1.txt");
		//创建一个输入流对象fis，并且以f作为参数
		FileInputStream fis = new FileInputStream(f);
		//创建一个字符输入流对象isr，并且以fis作为参数
		InputStreamReader isr = new InputStreamReader(fis);
		//创建一个带缓冲的输入流对象，利用此对象读取一行数据
		BufferedReader br = new BufferedReader(isr);
		//输出读取到的内容
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		br.close();
	}
	

}
