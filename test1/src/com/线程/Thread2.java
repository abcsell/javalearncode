package com.�߳�;

public class Thread2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Compute4 t=new Compute4();
		Compute5 t1=new Compute5();
		//�����̶߳���t��t1
		t.setPriority(10);
		t1.setPriority(1);
		t.start();//�����̶߳���t
		t1.start();//����
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
	}

}
//����ͨ��ѭ�����������ֵ���
 class Compute4 extends Thread{  //����ʵ���̵߳���
	int i=0;
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
		}
	}
}
//����ͨ��ѭ�����������ֵ���
 class Compute5 extends Thread{  //����ʵ���̵߳���
	
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println("��������ǣ�"+(i+1));
		}
	}
}