package com.�̰߳�����2;
//����ӪҵԱͬʱ��������
public class Hassistant extends Thread{
	public void sell1() {		//ӪҵԱ���������ķ���
		if(Ham.production1==(Ham.sales11+Ham.sales12)) {	//��û�к�����ʱ
			System.out.println("ӪҵԱ"+getName()+"���˿������ǣ����Ե�һ�£�A�຺����û���ˣ���");
		Ham.sales11=0;
		Ham.sales21=0;
		Ham.production1=0;
		
		try {
			Ham.box1.wait();//ʹ�߳���ͣ
		}catch (Exception e) {
		}
		}else{
			
		if(Ham.production1>(Ham.sales11 +Ham.sales12)) {
			(Ham.sales11)++;
			(Ham.sales12)++;
			System.out.println("ӪҵԱ"+getName()+"���˿ͺã������������ˣ�(�ܹ�����A�຺����"+Ham.sales11+"����,�ܹ�����B�຺����"+Ham.sales21 +"��)");
		
		}
		}	
	
}
	public void sell2() {
		if(Ham.production2==(Ham.sales21+Ham.sales22)) {	//��û�к�����ʱ
			System.out.println("ӪҵԱ"+getName()+"���˿������ǣ����Ե�һ�£�B�຺����û���ˣ���");
		Ham.sales21=0;
		Ham.sales22=0;
		Ham.production2=0;
		
		try {
			Ham.box2.wait();//ʹ�߳���ͣ
		}catch (Exception e) {
		}
		}else {
			if(Ham.production2 >(Ham.sales21 +Ham.sales22)) {
				
			
			(Ham.sales21)++;
			(Ham.sales22)++;
			System.out.println("ӪҵԱ"+getName()+"���˿ͺã������������ˣ�(�ܹ�����A�຺����"+Ham.sales12+"����,�ܹ�����B�຺����"+Ham.sales22 +"��)");
		}
		}
	}
	
	public void run() {			//��дrun����
		//�����������к�����������²��ϵ���
		while((Ham.sales12+Ham.sales11)<Ham.production1) {
		
			try {
				sleep(1000);//�߳�����1��
			}catch(Exception e) {
			
			}
			sell1();//���÷���
		}
			while((Ham.sales12+Ham.sales22)<Ham.production2) {
				
				try {
					sleep(1000);//�߳�����1��
				}catch(Exception e) {
					
				}
				sell2();//����sell2����
		}
			//�����Ӧ��Ϣ
			System.out.println("��ʣ��A�຺������"+(Ham.production1-Ham.sales11-Ham.sales12)+"��");
			System.out.println("��ʣ��B�຺������"+(Ham.production2-Ham.sales21-Ham.sales22)+"��");
	}
	}

























