package com.�̰߳�����;

 
public class Thread13{//����������
	public static void main(String[] args) {//������
		Hmaker maker = new Hmaker();//��������maker
		Hassistant assistant1 =new Hassistant();//��������assistant1
		Hassistant assistant2 =new Hassistant();//��������assistant2
		//�Զ���maker��������
		maker.setName("��");
		//���ö��� 
		assistant1.setName("��");
		assistant2.setName("��");
		//�����߳�
		maker.start();
		assistant1.start();
		assistant2.start();
	}
}
