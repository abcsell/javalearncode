package com.������;

import java.net.*;

public class Tcptest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����һ��inetAddress�����ip
		InetAddress ip =null;
		try {
			//��ʼ��IP
			ip = InetAddress.getByName("��������������");
			//���������
			System.out.println("������:"+ip.getHostName());
			//���IP��ַ
			System.out.println("����IP��ַ:"+ip.getHostAddress());
			System.out.println("����IP��ַ:"+InetAddress.getLocalHost().getHostAddress());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
