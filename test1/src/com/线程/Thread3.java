package com.�߳�;

public class Thread3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		// TODO �Զ����ɵķ������
		Compute6 t=new Compute6();
		Compute7 t1=new Compute7();
	
		t.start();//�����̶߳���t
		t1.start();//����
	
	}

}
//����ͨ��ѭ�����������ֵ���
 class Compute6 extends Thread{  //����ʵ���̵߳���
	int i=0;
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
			try {
				sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
//����ͨ��ѭ�����������ֵ���
 class Compute7 extends Thread{  //����ʵ���̵߳���
	
	public void run() {		//ʵ�ַ���run
		for(int i=0;i<10; i++) {
			System.out.println("��������ǣ�"+(i+1));
			try {
				sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}