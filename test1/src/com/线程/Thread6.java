package com.线程;

public class Thread6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute9 t= new Compute9();
		t.start();//启动线程
		t.interrupt();//线程的唤醒
	}

}
//创建一个线程类，在这个类中，通过休眠来输出不同结果
class Compute9 extends Thread{
	int i=0;//创建成员变量
	public void run() {
		//输出相应信息
		System.out.println("在工作中，不要打扰");
		try {
			sleep(10000);
		}catch(Exception e) {
			System.out.println("哇，来电话了！");//输出相应信息
		}
	}
}