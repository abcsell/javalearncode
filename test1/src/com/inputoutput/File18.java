package com.inputoutput;
//获取键盘输入的数据
import java.io.*;
public class File18 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		//创建要给多字节输入流对象isr
		InputStreamReader isr = new InputStreamReader(System.in);
		//创建一个带缓冲的输入流对象br
		BufferedReader br = new BufferedReader(isr);
		//通过br对象的方法readline（）读取内容并输出
		System.out.println(br.readLine());
		br.close();
	}

}
