package com.�߳�;

public class Thread10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute13 t= new Compute13('a');
		Compute13 t1= new Compute13('b');
		Compute13 t2= new Compute13('c');
		t.start();
		t1.start();
		t2.start();
	}

}
//����ͨ��ѭ�����������ֵ���
class Compute13 extends Thread{//�����̳��̵߳���
	char ch;//������Ա����
	static Object obj = new Object();//������̬����
	Compute13(char ch){			//���캯��
		this.ch=ch;
	}
	public void print(char ch) {
		for (int i=0;i<10;i++) {
			System.out.print(ch);
		}
	}
	public void run() {			//ʵ�ַ���
		synchronized(obj) {		//������̬��
			for(int i=1;i<10;i++) {//ʵ��ѭ��
				print(ch);//���÷���print
				System.out.println();
			}
		}
	}
}