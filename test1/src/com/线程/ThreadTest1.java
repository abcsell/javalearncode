package com.�߳�;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute2 c=new Compute2();
		Compute3 c1=new Compute3();
		//�����̶߳���t��t1
		Thread t = new Thread(c);
		Thread t1=new Thread(c1);
		t.start();//�����̶߳���t
		t1.start();//����
	}

}
//����ͨ��ѭ�����������ֵ���
class Compute2 extends Thread{ //�����̳��̵߳���
	int i=0;//������Ա����i
	public void run() {//ʵ�ַ���run()
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
//����ͨ��ѭ�����������ֵ���
class Compute3 extends Thread{  //����ʵ���̵߳���
	
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println("��������ǣ�"+i);
		}
	}
}
