package com.�߳�;
//ͬ��������
public class Thread12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute15 t = new Compute15();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}
class Compute15 extends Thread{   	//�����̳��̵߳���
	int i=10;//������Ա����i
	static Object obj =new Object();//������̬����
	synchronized void print() {		//�����������
		//�����Ӧ��Ϣ
		System.out.println(Thread.currentThread().getName()+":"+i);
		i--;
	}
	public void run() {
		while(i>0) {
			print();
			try {
				sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}