package com.线程;

public class Thread5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute8 t = new Compute8();
		t.start();
	}

}
//创建一个线程类，在这个类里，通过休眠来输出不同结果
class Compute8 extends Thread{
	int i=0;		//创建成员变量i
	public void run() {	//实现run()方法
		//输出相应信息
		System.out.println("在工作中，不要打扰");
		try {
			sleep(10000);
		}catch(Exception e) {
			System.out.println("哇，来电话了！");//输出相应信息
		}
	}
}
