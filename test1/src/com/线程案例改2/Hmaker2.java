package com.�̰߳�����2;

public class Hmaker2 extends Thread{	//��ʦ�߳���
	//make����ʹ����һ��ͬ���飬�����������᲻������������
	public void make() {
		synchronized (Ham.box2) {//����ͬ����
			(Ham.production2)++;
			//�����Ӧ��Ϣ
			System.out.println("��ʦ"+getName()+":"+"����������(�ܹ�"+(Ham.production2-Ham.sales21-Ham.sales22)+"��B�຺����)");
			try {
				Ham.box2.notify();
			}catch(Exception e) {
				
			}
		}
	}
	public void run() {	//��дrun����
		//ʹ��ѭ���������֤�ں�������������֮ǰ����������������
		while(Ham.production2< Ham.totalmaterial2){
		
			make();//����make����
			try {
				sleep(3000);//����3��
			}catch(Exception e) {
				
			}
			if(Ham.production2 ==Ham.totalmaterial2) {
				System.out.println("���еĲ���������");
			}
		}
		
	}

}
