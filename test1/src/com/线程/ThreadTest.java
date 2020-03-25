package com.线程;

public class ThreadTest {	//测试两个线程类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute c=new Compute();
		Compute1 c1=new Compute1();
		//创建线程对象t和t1
		Thread t = new Thread(c);
		Thread t1=new Thread(c1);
		t.start();//启动线程对象t
		t1.start();//启动
	}

}
//创建通过循环语句输出数字的类
 class Compute implements Runnable{  //创建实现线程的类
	int i=0;
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
		}
	}
}
//创建通过循环语句输出数字的类
 class Compute1 implements Runnable{  //创建实现线程的类
	
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println("这个数字是："+(i+1));
		}
	}
}
