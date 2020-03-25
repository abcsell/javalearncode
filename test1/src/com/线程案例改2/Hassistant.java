package com.线程案例改2;
//两个营业员同时卖汉堡包
public class Hassistant extends Thread{
	public void sell1() {		//营业员卖汉堡包的方法
		if(Ham.production1==(Ham.sales11+Ham.sales12)) {	//当没有汉堡包时
			System.out.println("营业员"+getName()+"：顾客朋友们，请稍等一下，A类汉堡包没有了！！");
		Ham.sales11=0;
		Ham.sales21=0;
		Ham.production1=0;
		
		try {
			Ham.box1.wait();//使线程暂停
		}catch (Exception e) {
		}
		}else{
			
		if(Ham.production1>(Ham.sales11 +Ham.sales12)) {
			(Ham.sales11)++;
			(Ham.sales12)++;
			System.out.println("营业员"+getName()+"：顾客好，汉堡包上来了，(总共卖了A类汉堡包"+Ham.sales11+"个）,总共卖了B类汉堡包"+Ham.sales21 +"个)");
		
		}
		}	
	
}
	public void sell2() {
		if(Ham.production2==(Ham.sales21+Ham.sales22)) {	//当没有汉堡包时
			System.out.println("营业员"+getName()+"：顾客朋友们，请稍等一下，B类汉堡包没有了！！");
		Ham.sales21=0;
		Ham.sales22=0;
		Ham.production2=0;
		
		try {
			Ham.box2.wait();//使线程暂停
		}catch (Exception e) {
		}
		}else {
			if(Ham.production2 >(Ham.sales21 +Ham.sales22)) {
				
			
			(Ham.sales21)++;
			(Ham.sales22)++;
			System.out.println("营业员"+getName()+"：顾客好，汉堡包上来了，(总共卖了A类汉堡包"+Ham.sales12+"个）,总共卖了B类汉堡包"+Ham.sales22 +"个)");
		}
		}
	}
	
	public void run() {			//重写run方法
		//当箱子里面有汉堡包的情况下不断的卖
		while((Ham.sales12+Ham.sales11)<Ham.production1) {
		
			try {
				sleep(1000);//线程休眠1秒
			}catch(Exception e) {
			
			}
			sell1();//调用方法
		}
			while((Ham.sales12+Ham.sales22)<Ham.production2) {
				
				try {
					sleep(1000);//线程休眠1秒
				}catch(Exception e) {
					
				}
				sell2();//调用sell2方法
		}
			//输出相应信息
			System.out.println("还剩下A类汉堡包："+(Ham.production1-Ham.sales11-Ham.sales12)+"个");
			System.out.println("还剩下B类汉堡包："+(Ham.production2-Ham.sales21-Ham.sales22)+"个");
	}
	}

























