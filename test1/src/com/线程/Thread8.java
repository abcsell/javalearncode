package com.�߳�;

public class Thread8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute12 t= new Compute12('a');
		Compute12 t1= new Compute12('b');
		t.start();//�����߳�
		t1.start();//�̵߳Ļ���
	}

}
//����ͨ��ѭ�����������ֵ���
class Compute12 extends Thread{ //�����̳��̵߳���compute12
	char ch;
	Compute12(char ch){//������Ա����ch
		this.ch=ch; //���캯��
	}
	public void print(char ch) {//����print��������
		for(int i=0;i<10;i++) {//ͨ��ѭ���������
			System.out.print(ch);
		}
	}
	public void run() {
		print(ch);				//����print����
		System.out.println();//����س�
	}
}
