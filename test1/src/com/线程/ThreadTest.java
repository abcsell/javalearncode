package com.�߳�;

public class ThreadTest {	//���������߳���

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute c=new Compute();
		Compute1 c1=new Compute1();
		//�����̶߳���t��t1
		Thread t = new Thread(c);
		Thread t1=new Thread(c1);
		t.start();//�����̶߳���t
		t1.start();//����
	}

}
//����ͨ��ѭ�����������ֵ���
 class Compute implements Runnable{  //����ʵ���̵߳���
	int i=0;
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
		}
	}
}
//����ͨ��ѭ�����������ֵ���
 class Compute1 implements Runnable{  //����ʵ���̵߳���
	
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println("��������ǣ�"+(i+1));
		}
	}
}
