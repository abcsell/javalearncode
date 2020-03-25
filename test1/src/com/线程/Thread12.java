package com.线程;
//同步化方法
public class Thread12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute15 t = new Compute15();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}
class Compute15 extends Thread{   	//创建继承线程的类
	int i=10;//创建成员变量i
	static Object obj =new Object();//创建静态对象
	synchronized void print() {		//创建输出方法
		//输出相应信息
		System.out.println(Thread.currentThread().getName()+":"+i);
		i--;
	}
	public void run() {
		while(i>0) {
			print();
			try {
				sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}