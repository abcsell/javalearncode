package com.线程;

public class Thread3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// TODO 自动生成的方法存根
		Compute6 t=new Compute6();
		Compute7 t1=new Compute7();
	
		t.start();//启动线程对象t
		t1.start();//启动
	
	}

}
//创建通过循环语句输出数字的类
 class Compute6 extends Thread{  //创建实现线程的类
	int i=0;
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
			try {
				sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
//创建通过循环语句输出数字的类
 class Compute7 extends Thread{  //创建实现线程的类
	
	public void run() {		//实现方法run
		for(int i=0;i<10; i++) {
			System.out.println("这个数字是："+(i+1));
			try {
				sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}