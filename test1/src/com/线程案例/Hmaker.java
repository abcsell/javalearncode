package com.�̰߳���;

public class Hmaker extends Thread{	//��ʦ�߳���
	//make����ʹ����һ��ͬ���飬�����������᲻������������
	public void make() {
		synchronized (Ham.box) {//����ͬ����
			(Ham.production)++;
			try {
				Ham.box.notify();
			}catch(Exception e) {
				
			}
		}
	}
	public void run() {	//��дrun����
		//ʹ��ѭ���������֤�ں�������������֮ǰ����������������
		while(Ham.production< Ham.totalmaterial){
			//ʹ���ж�����ж�ֻҪ�к���������ʦ��֪ͨӪҵԱ��������
			if(Ham.production>0) {
				System.out.println("��ʦ"+getName()+":"+"����������(�ܹ�"+(Ham.production-Ham.sales)+"��)");
			}
			try {
				sleep(3000);//�߳�����3��
			}catch(Exception e) {
				
			}
			make();//����make����
		}
		
	}

}
