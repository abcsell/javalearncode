package com.�߳�;
//�߳��ò�
public class Thread7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute10 t= new Compute10();
		Compute11 t1= new Compute11();
		t.start();//�����߳�
		t1.start();//�̵߳Ļ���
	}

}
//����һ���߳��࣬��������У�ͨ�������������ͬ���
class Compute10 extends Thread{
	int i=0;//������Ա����
	public void run() {
		//�����Ӧ��Ϣ
		for(int i=0; i<10; i++) {
			System.out.println(i);
			yield();//���߳���ͣ
		}
	}
}
//����ͨ��ѭ�����������ֵ���
class Compute11 extends Thread {	//�����̳��̵߳���compute1
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("��������ǣ�"+i);
		}
	}
}