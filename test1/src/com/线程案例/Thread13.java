package com.线程案例;
//   关于营业员的线程类
 class Hassistant extends Thread{
	public void sell() {		//营业员卖汉堡包的方法
		if(Ham.production==0) {	//当没有汉堡包时
			System.out.println("营业员：顾客朋友们，请稍等一下，汉堡包没有了");
		}
		try {
			Ham.box.wait();//使线程暂停
		}catch (Exception e) {
			
		}
		Ham.sales++;
		System.out.println("营业员：顾客好，汉堡包上来了，(总共卖了"+Ham.sales+"个）");
	}
	public void run() {			//重写run方法
		//当箱子里面有汉堡包的情况下不断的卖
		while(Ham.sales<Ham.production) {
			try {
				sleep(1000);//线程休眠1秒
			}catch(Exception e) {
				
			}
			sell();//调用sell方法
		}
	}
}
public class Thread13{//创建测试类
	public static void main(String[] args) {//主方法
		Hmaker maker = new Hmaker();//创建对象maker
		Hassistant assistant =new Hassistant();//创建对象assistant
		//对对象maker进行设置
		maker.setName("甲");
		//启动线程
		maker.start();
		assistant.start();
	}
}
