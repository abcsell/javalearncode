package com.�̰߳�����2;

public class Hmaker1 extends Thread{	//��ʦ�߳���
	//make����ʹ����һ��ͬ���飬�����������᲻������������
	public void make() {
		synchronized (Ham.box1) {//����ͬ����
			(Ham.production1)++;
			//�����Ӧ��Ϣ
			System.out.println("��ʦ"+getName()+":"+"����������(�ܹ�"+(Ham.production1-Ham.sales11-Ham.sales12)+"��A�຺����)");
			try {
				Ham.box1.notify();
			}catch(Exception e) {
				
			}
		}
	}
	public void run() {	//��дrun����
		//ʹ��ѭ���������֤�ں�������������֮ǰ����������������
		while(Ham.production1< Ham.totalmaterial1){
		
			make();//����make����
			try {
				sleep(3000);//����3��
			}catch(Exception e) {
				
			}
			if(Ham.production1==Ham.totalmaterial1) {
				System.out.println("���еĲ���������");
			}
		}
		
	}

}
