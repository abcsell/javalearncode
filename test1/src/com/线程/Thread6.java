package com.�߳�;

public class Thread6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute9 t= new Compute9();
		t.start();//�����߳�
		t.interrupt();//�̵߳Ļ���
	}

}
//����һ���߳��࣬��������У�ͨ�������������ͬ���
class Compute9 extends Thread{
	int i=0;//������Ա����
	public void run() {
		//�����Ӧ��Ϣ
		System.out.println("�ڹ����У���Ҫ����");
		try {
			sleep(10000);
		}catch(Exception e) {
			System.out.println("�ۣ����绰�ˣ�");//�����Ӧ��Ϣ
		}
	}
}