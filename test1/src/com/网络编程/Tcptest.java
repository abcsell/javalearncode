package com.网络编程;

import java.net.*;

public class Tcptest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建一个inetAddress类对象ip
		InetAddress ip =null;
		try {
			//初始化IP
			ip = InetAddress.getByName("这里输入主机名");
			//输出主机名
			System.out.println("主机名:"+ip.getHostName());
			//输出IP地址
			System.out.println("主机IP地址:"+ip.getHostAddress());
			System.out.println("本机IP地址:"+InetAddress.getLocalHost().getHostAddress());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
