package com.�̰߳�����;
//����ӪҵԱͬʱ��������
public class Hassistant extends Thread{
	public void sell1() {		//ӪҵԱ���������ķ���
		if(Ham.production==(Ham.sales1+Ham.sales2)) {	//��û�к�����ʱ
			System.out.println("ӪҵԱ"+getName()+"���˿������ǣ����Ե�һ�£�������û���ˣ���");
		Ham.sales1=0;
		Ham.production=0;
		
		try {
			Ham.box.wait();//ʹ�߳���ͣ
		}catch (Exception e) {
		}
		}
		(Ham.sales1)++;
		System.out.println("ӪҵԱ"+getName()+"���˿ͺã������������ˣ�(�ܹ�����"+Ham.sales1+"����");
	
	
}
	public void sell2() {
		if(Ham.production==(Ham.sales1+Ham.sales2)) {	//��û�к�����ʱ
			System.out.println("ӪҵԱ"+getName()+"���˿������ǣ����Ե�һ�£�������û���ˣ���");
		Ham.sales2=0;
		Ham.production=0;
		
		try {
			Ham.box.wait();//ʹ�߳���ͣ
		}catch (Exception e) {
		}
		}
		(Ham.sales2)++;
		System.out.println("ӪҵԱ"+getName()+"���˿ͺã������������ˣ�(�ܹ�����"+Ham.sales2+"����");
	}
	
	public void run() {			//��дrun����
		//�����������к�����������²��ϵ���
		while((Ham.sales1+Ham.sales2)<Ham.production) {
			sell1();//����sell1����
			try {
				sleep(1000);//�߳�����1��
			}catch(Exception e) {
			
			}
		}
			while((Ham.sales1+Ham.sales2)<Ham.production) {
				
				try {
					sleep(1000);//�߳�����1��
				}catch(Exception e) {
					
				}
				sell2();//����sell2����
		}
	}
	}
