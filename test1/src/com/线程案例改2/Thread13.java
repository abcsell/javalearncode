package com.�̰߳�����2;

 
public class Thread13{//����������
	public static void main(String[] args) {//������
		Hmaker1 maker1 = new Hmaker1();//��������maker
		Hmaker1 maker2 = new Hmaker1();//��������maker
		Hassistant assistant1 =new Hassistant();//��������assistant1
		Hassistant assistant2 =new Hassistant();//��������assistant2
		//�Զ���maker��������
		maker1.setName("��");
		maker2.setName("��");
		//���ö��� 
		assistant1.setName("��");
		assistant2.setName("��");
		//�����߳�
		maker1.start();
		maker2.start();
		assistant1.start();
		assistant2.start();
	}
}
