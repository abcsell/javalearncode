package com.������;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverrev {
//������Ա����
	private BufferedReader reader1;
	private ServerSocket server;
	private Socket socket1;
	public void serverrev() {//�޲ι��캯��
		
	}
	//�����������׽���server��������˿�Ϊ6000
	void startserver() {
		try {
			server = new ServerSocket(6000);//Ϊ����ֵ
			System.out.println("�������׽��ִ�������ˣ�");
			//���ͻ���������������׽�������
			while(true) {
				System.out.println("�ȴ��ͻ���������*******");
				socket1 = server.accept();
				System.out.println("�����ͻ���������");
				reader1 = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
				getMessage();
			}
		}catch(Exception e) {
			
		}
	}
	//��ȡ�����׽��ֵ�������������Ӷ������������Ļ��
	void getMessage() {
		try {
			while(true) {//ͨ��ѭ������
				System.out.println("�ͻ���:"+reader1.readLine());
			}
		}catch(Exception e) {
			
		}finally {
			System.out.println("�ͻ����ж�����");
		}
		try {
			if(reader1 !=null)
				reader1.close();
			if(socket1 !=null)
				socket1.close();
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		Serverrev server = new Serverrev();;
		server.startserver();
	}
}
