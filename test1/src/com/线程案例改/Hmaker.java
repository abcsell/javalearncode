package com.�̰߳�����;

public class Hmaker extends Thread{	//��ʦ�߳���
	//make����ʹ����һ��ͬ���飬�����������᲻������������
	public void make() {
		synchronized (Ham.box) {//����ͬ����
			(Ham.production)++;
			//�����Ӧ��Ϣ
			System.out.println("��ʦ"+getName()+":"+"����������(�ܹ�"+(Ham.production-Ham.sales1-Ham.sales2)+"��)");
			try {
				Ham.box.notify();
			}catch(Exception e) {
				
			}
		}
	}
	public void run() {	//��дrun����
		//ʹ��ѭ���������֤�ں�������������֮ǰ����������������
		while(Ham.production< Ham.totalmaterial){
		
			make();//����make����
			try {
				sleep(3000);//����3��
			}catch(Exception e) {
				
			}
			make();//����make����
		}
		
	}

}
