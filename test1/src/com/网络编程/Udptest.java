package com.������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Udptest {
	public static void rev() {
		try {
			//����һ�����ݰ��׽��ֶ���ds������ָ�����ӵĶ˿ں�
			DatagramSocket ds = new DatagramSocket(6000);
			//ָ��һ���ֽ����飬�����洢���յ�����
			byte[] buf = new byte[100];
			//����һ�����ݰ�����dp
			DatagramPacket dp = new DatagramPacket(buf, 100);
			ds.receive(dp);//��������
			//�����ȡ�����ַ�
			System.out.println(new String(buf,0,dp.getLength()));
			ds.close();//�ر�����
		}catch (Exception e) {
			
		}
	}
	public static void send() {//�������ݷ��ͷ���
		try {
			//����һ�����ݰ��׽��ֶ���ds
			DatagramSocket ds = new DatagramSocket();
			//��ʼ��һ���ַ��������ҽ�����ַ���ͨ���׽������Ӻ���
			//�˿ںŷ��ͳ�ȥ
			String str = "hello, i am zhanghong,i am a student and i am a best programer!";
			//����һ�����ݰ�����dp,����ָ������Ҫ���ӵĶ˿ں�
			//���ӵ���������
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("localhost"),6000);
			ds.send(dp);
			ds.close();
		}catch (Exception e) {
			
		}
		
	}
	public static void main(String[] args) {//������
		if(args.length>0)//����������0
			rev();//���÷���
		else
			send();
		
	}
}
