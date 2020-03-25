package com.线程;
//线程让步
public class Thread7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute10 t= new Compute10();
		Compute11 t1= new Compute11();
		t.start();//启动线程
		t1.start();//线程的唤醒
	}

}
//创建一个线程类，在这个类中，通过休眠来输出不同结果
class Compute10 extends Thread{
	int i=0;//创建成员变量
	public void run() {
		//输出相应信息
		for(int i=0; i<10; i++) {
			System.out.println(i);
			yield();//让线程暂停
		}
	}
}
//创建通过循环语句输出数字的类
class Compute11 extends Thread {	//创建继承线程的类compute1
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("这个数字是："+i);
		}
	}
}