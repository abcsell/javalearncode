package com.�߳�;
//ͬ����
public class Thread11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute14 t= new Compute14();//��������
		//���������̶߳���
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}
//����ͨ��ѭ�����������ֵ���
class Compute14 extends Thread{
	int i=10;
	static Object obj =new Object();//��̬����
	public void print() {
		//�����Ӧ��Ϣ
		System.out.println(Thread.currentThread().getName()+":"+i);
		i--;//�Լ�
	}
	public void run() {		//��д����run
		while(i>0) {
			synchronized(obj) {//��̬��
				print();
			}
			try {
				sleep(1000);//����һ��
			}catch(Exception e) {
				
			}
		}
	}
}