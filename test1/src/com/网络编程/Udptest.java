package com.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Udptest {
	public static void rev() {
		try {
			//创建一个数据包套接字对象ds，并且指定链接的端口号
			DatagramSocket ds = new DatagramSocket(6000);
			//指定一个字节数组，用来存储接收的数据
			byte[] buf = new byte[100];
			//创建一个数据包对象dp
			DatagramPacket dp = new DatagramPacket(buf, 100);
			ds.receive(dp);//建立连接
			//输出获取到的字符
			System.out.println(new String(buf,0,dp.getLength()));
			ds.close();//关闭连接
		}catch (Exception e) {
			
		}
	}
	public static void send() {//创建数据发送方法
		try {
			//创建一个数据包套接字对象ds
			DatagramSocket ds = new DatagramSocket();
			//初始化一个字符串，并且将这个字符串通过套接字连接后按照
			//端口号发送出去
			String str = "hello, i am zhanghong,i am a student and i am a best programer!";
			//创建一个数据包对象dp,并且指定其需要链接的端口号
			//链接的主机名称
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("localhost"),6000);
			ds.send(dp);
			ds.close();
		}catch (Exception e) {
			
		}
		
	}
	public static void main(String[] args) {//主方法
		if(args.length>0)//当参数大于0
			rev();//调用方法
		else
			send();
		
	}
}
