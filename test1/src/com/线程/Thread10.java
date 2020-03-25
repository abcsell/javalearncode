package com.线程;

public class Thread10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute13 t= new Compute13('a');
		Compute13 t1= new Compute13('b');
		Compute13 t2= new Compute13('c');
		t.start();
		t1.start();
		t2.start();
	}

}
//创建通过循环语句输出数字的类
class Compute13 extends Thread{//创建继承线程的类
	char ch;//创建成员变量
	static Object obj = new Object();//创建静态对象
	Compute13(char ch){			//构造函数
		this.ch=ch;
	}
	public void print(char ch) {
		for (int i=0;i<10;i++) {
			System.out.print(ch);
		}
	}
	public void run() {			//实现方法
		synchronized(obj) {		//创建静态块
			for(int i=1;i<10;i++) {//实现循环
				print(ch);//调用方法print
				System.out.println();
			}
		}
	}
}