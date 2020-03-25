package com.线程;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute2 c=new Compute2();
		Compute3 c1=new Compute3();
		//创建线程对象t和t1
		Thread t = new Thread(c);
		Thread t1=new Thread(c1);
		t.start();//启动线程对象t
		t1.start();//启动
	}

}
//创建通过循环语句输出数字的类
class Compute2 extends Thread{ //创建继承线程的类
	int i=0;//创建成员变量i
	public void run() {//实现方法run()
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
//创建通过循环语句输出数字的类
class Compute3 extends Thread{  //创建实现线程的类
	
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println("这个数字是："+i);
		}
	}
}
