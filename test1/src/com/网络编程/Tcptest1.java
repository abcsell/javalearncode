package com.������;

import java.net.ServerSocket;
import java.net.Socket;

public class Tcptest1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			//����Ҫ���������׽��ֶ���server
			ServerSocket server = new ServerSocket(3002);
			//�����ӡ����Ϣ
			System.out.println("���������׽����Ѿ������ɹ�������");
			System.out.println("���ڵȴ��ͻ������ӡ���������������");
			//ͨ��ѭ������
			for(int i=0;i<10;i++) {
				//�����׽��ֶ���s���ӵ��������׽�����
				Socket s = new Socket("127.0.0.1",3002);
				System.out.println("�Ѿ����"+i+"�Ϳͻ������ӣ�����");
			}
		}catch(Exception e) {
			
		}
	}

}
