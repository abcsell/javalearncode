package com.线程案例改;
//两个营业员同时卖汉堡包
public class Hassistant extends Thread{
	public void sell1() {		//营业员卖汉堡包的方法
		if(Ham.production==(Ham.sales1+Ham.sales2)) {	//当没有汉堡包时
			System.out.println("营业员"+getName()+"：顾客朋友们，请稍等一下，汉堡包没有了！！");
		Ham.sales1=0;
		Ham.production=0;
		
		try {
			Ham.box.wait();//使线程暂停
		}catch (Exception e) {
		}
		}
		(Ham.sales1)++;
		System.out.println("营业员"+getName()+"：顾客好，汉堡包上来了，(总共卖了"+Ham.sales1+"个）");
	
	
}
	public void sell2() {
		if(Ham.production==(Ham.sales1+Ham.sales2)) {	//当没有汉堡包时
			System.out.println("营业员"+getName()+"：顾客朋友们，请稍等一下，汉堡包没有了！！");
		Ham.sales2=0;
		Ham.production=0;
		
		try {
			Ham.box.wait();//使线程暂停
		}catch (Exception e) {
		}
		}
		(Ham.sales2)++;
		System.out.println("营业员"+getName()+"：顾客好，汉堡包上来了，(总共卖了"+Ham.sales2+"个）");
	}
	
	public void run() {			//重写run方法
		//当箱子里面有汉堡包的情况下不断的卖
		while((Ham.sales1+Ham.sales2)<Ham.production) {
			sell1();//调用sell1方法
			try {
				sleep(1000);//线程休眠1秒
			}catch(Exception e) {
			
			}
		}
			while((Ham.sales1+Ham.sales2)<Ham.production) {
				
				try {
					sleep(1000);//线程休眠1秒
				}catch(Exception e) {
					
				}
				sell2();//调用sell2方法
		}
	}
	}
