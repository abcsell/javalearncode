package com.线程;

public class Thread8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute12 t= new Compute12('a');
		Compute12 t1= new Compute12('b');
		t.start();//启动线程
		t1.start();//线程的唤醒
	}

}
//创建通过循环语句输出数字的类
class Compute12 extends Thread{ //创建继承线程的类compute12
	char ch;
	Compute12(char ch){//创建成员变量ch
		this.ch=ch; //构造函数
	}
	public void print(char ch) {//创建print（）方法
		for(int i=0;i<10;i++) {//通过循环输出数字
			System.out.print(ch);
		}
	}
	public void run() {
		print(ch);				//调用print方法
		System.out.println();//输出回车
	}
}
