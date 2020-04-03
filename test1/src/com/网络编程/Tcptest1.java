package com.网络编程;

import java.net.ServerSocket;
import java.net.Socket;

public class Tcptest1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			//创建要给服务器套接字对象server
			ServerSocket server = new ServerSocket(3002);
			//输出象印个信息
			System.out.println("服务器的套接字已经创建成功！！！");
			System.out.println("正在等待客户机链接————————");
			//通过循环遍历
			for(int i=0;i<10;i++) {
				//创建套接字对象s连接到服务器套接字上
				Socket s = new Socket("127.0.0.1",3002);
				System.out.println("已经与第"+i+"和客户机链接！！！");
			}
		}catch(Exception e) {
			
		}
	}

}
