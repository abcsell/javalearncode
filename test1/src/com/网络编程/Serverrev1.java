package com.������;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverrev1 {
//������Ա����
	private DataInputStream reader1;//������
	private DataOutputStream writer1;//�����
	private ServerSocket server;
	private Socket socket1;
	public void serverrev1() {//�޲ι��캯��
		
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
				reader1 = new DataInputStream(socket1.getInputStream());
				writer1 = new DataOutputStream(socket1.getOutputStream());
				getrev();//��ͻ�������ͨ��
			}
		}catch(Exception e) {
			
		}
	}
	//��ȡ���ӷ���
	void getrev() {
		try {
			while(true) {//ͨ��ѭ������
				String filename = reader1.readUTF();
				writer1.writeUTF(getfileinfo(filename));
				writer1.flush();
				System.out.println(filename + "����Ϣ�������");
			}
		}catch(Exception e) {
			
		}finally {
			System.out.println("�ͻ����ж�����");
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
	String getfileinfo(String filename) {//��ȡ�ļ���Ϣ����
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
