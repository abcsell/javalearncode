package com.inputoutput;
import java.io.*;
public class File15 {

	public static void main(String[] args)throws Exception {
		// TODO 自动生成的方法存根
		File f = new File("d:\\filetest","2.txt");
		//创建一个输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个字符输出流对象osw，并且以fos作为参数
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//创建要给带缓冲的输出流对象bw，利用此对象写入数据
		BufferedWriter bw = new BufferedWriter(osw);
		//输出相应内容和空格
		bw.write("小明是一个好学生。");
		bw.newLine();
		bw.write("他是一个三好学生。");
		bw.newLine();
		bw.write("今天天气很好，美国股市又熔断了");
		bw.close();
	}

}
