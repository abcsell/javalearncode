package com.�߳�;

public class Thread5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute8 t = new Compute8();
		t.start();
	}

}
//����һ���߳��࣬��������ͨ�������������ͬ���
class Compute8 extends Thread{
	int i=0;		//������Ա����i
	public void run() {	//ʵ��run()����
		//�����Ӧ��Ϣ
		System.out.println("�ڹ����У���Ҫ����");
		try {
			sleep(10000);
		}catch(Exception e) {
			System.out.println("�ۣ����绰�ˣ�");//�����Ӧ��Ϣ
		}
	}
}
