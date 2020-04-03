package com.网络编程;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverrev1 {
//创建成员变量
	private DataInputStream reader1;//输入流
	private DataOutputStream writer1;//输出流
	private ServerSocket server;
	private Socket socket1;
	public void serverrev1() {//无参构造函数
		
	}
	//创建服务器套接字server，并且其端口为6000
	void startserver() {
		try {
			server = new ServerSocket(6000);//为对象赋值
			System.out.println("服务器套接字创建完成了！");
			//若客户及提出请求，则与套接字链接
			while(true) {
				System.out.println("等待客户机的链接*******");
				socket1 = server.accept();
				System.out.println("完成与客户机的链接");
				reader1 = new DataInputStream(socket1.getInputStream());
				writer1 = new DataOutputStream(socket1.getOutputStream());
				getrev();//与客户机进行通信
			}
		}catch(Exception e) {
			
		}
	}
	//获取链接方法
	void getrev() {
		try {
			while(true) {//通过循环遍历
				String filename = reader1.readUTF();
				writer1.writeUTF(getfileinfo(filename));
				writer1.flush();
				System.out.println(filename + "的信息传送完毕");
			}
		}catch(Exception e) {
			
		}finally {
			System.out.println("客户机中断连接");
		}
		try {
			if(reader1 !=null)
				reader1.close();
			if(writer1 !=null)
				writer1.close();
			if(socket1 !=null)
				socket1.close();
		}catch(Exception e) {
			
		}
	}
	String getfileinfo(String filename) {//获取文件信息方法
		String fileinfo = "";
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String temp;
			while((temp = br.readLine())!=null)
				fileinfo +=temp + "\n";
			br.close();
		}catch(Exception e) {
			
		}
		return fileinfo;
	}
	public static void main(String[] args) {
		Serverrev1 server = new Serverrev1();;
		server.startserver();
	}
}
