package com.线程;
//同步块
public class Thread11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Compute14 t= new Compute14();//创建对象
		//启动三个线程对象
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}
//创建通过循环语句输出数字的类
class Compute14 extends Thread{
	int i=10;
	static Object obj =new Object();//静态对象
	public void print() {
		//输出相应信息
		System.out.println(Thread.currentThread().getName()+":"+i);
		i--;//自减
	}
	public void run() {		//重写方法run
		while(i>0) {
			synchronized(obj) {//静态块
				print();
			}
			try {
				sleep(1000);//休眠一秒
			}catch(Exception e) {
				
			}
		}
	}
}