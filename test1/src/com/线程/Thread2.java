package com.线程;

public class Thread2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute4 t=new Compute4();
		Compute5 t1=new Compute5();
		//创建线程对象t和t1
		t.setPriority(10);
		t1.setPriority(1);
		t.start();//启动线程对象t
		t1.start();//启动
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
	}

}
//创建通过循环语句输出数字的类
 class Compute4 extends Thread{  //创建实现线程的类
	int i=0;
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
		}
	}
}
//创建通过循环语句输出数字的类
 class Compute5 extends Thread{  //创建实现线程的类
	
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println("这个数字是："+(i+1));
		}
	}
}