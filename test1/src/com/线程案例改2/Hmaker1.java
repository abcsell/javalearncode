package com.线程案例改2;

public class Hmaker1 extends Thread{	//厨师线程类
	//make方法使用了一个同步块，在这个函数里会不短生产汉堡包
	public void make() {
		synchronized (Ham.box1) {//创建同步块
			(Ham.production1)++;
			//输出相应信息
			System.out.println("厨师"+getName()+":"+"汉堡包来了(总共"+(Ham.production1-Ham.sales11-Ham.sales12)+"个A类汉堡包)");
			try {
				Ham.box1.notify();
			}catch(Exception e) {
				
			}
		}
	}
	public void run() {	//重写run方法
		//使用循环语句来保证在汉堡包材料用完之前，不断生产汉堡包
		while(Ham.production1< Ham.totalmaterial1){
		
			make();//调用make方法
			try {
				sleep(3000);//休眠3秒
			}catch(Exception e) {
				
			}
			if(Ham.production1==Ham.totalmaterial1) {
				System.out.println("所有的材料用完了");
			}
		}
		
	}

}
