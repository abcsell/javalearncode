package com.�̰߳���;
//   ����ӪҵԱ���߳���
 class Hassistant extends Thread{
	public void sell() {		//ӪҵԱ���������ķ���
		if(Ham.production==0) {	//��û�к�����ʱ
			System.out.println("ӪҵԱ���˿������ǣ����Ե�һ�£�������û����");
		}
		try {
			Ham.box.wait();//ʹ�߳���ͣ
		}catch (Exception e) {
			
		}
		Ham.sales++;
		System.out.println("ӪҵԱ���˿ͺã������������ˣ�(�ܹ�����"+Ham.sales+"����");
	}
	public void run() {			//��дrun����
		//�����������к�����������²��ϵ���
		while(Ham.sales<Ham.production) {
			try {
				sleep(1000);//�߳�����1��
			}catch(Exception e) {
				
			}
			sell();//����sell����
		}
	}
}
public class Thread13{//����������
	public static void main(String[] args) {//������
		Hmaker maker = new Hmaker();//��������maker
		Hassistant assistant =new Hassistant();//��������assistant
		//�Զ���maker��������
		maker.setName("��");
		//�����߳�
		maker.start();
		assistant.start();
	}
}
