package com.封装实例;

public class Teacherask extends Thread {
//创建一个教师提问的线程类
	//创建关于教师提问的属性
	private String name;
	private int x;
	//关于name属性设置器和服务器
	public void set(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	//关于x属性设置器和服务器
	public void setint(int x) {
		this.x=x;
	}
	public int getint() {
		return x;
	}
	private void said() {  //关于教师提问的方法
		switch(x) {     		//通过分支语句来提供提问的步骤
		case 0:
			System.out.println(name+"说：你叫什么名字？");
			break;
		case 1:
			System.out.println(name+"说：你在那所学校读书？");
			break;
		case 2:
			System.out.println(name+"说：你读什么系哪一个年级？");
			break;
		case 3:
			System.out.println(name+"说：你今年多大了？");
			break;
		case 4:
			System.out.println(name+"说：你学计算机软件开发几年了？");
			break;
		case 5:
			System.out.println(name+"说：你几月放假？");
			break;
		case 6:
			System.out.println(name+"说：放假大概有多少天？");
			break;
		case 7:
			System.out.println(name+"说：谢谢你回答我的问题");
			break;
		
		}
	}
	public void run() //重写run()方法
	{
		said ();
	try {
		sleep(2000);			//线程休眠两秒
	}catch(Exception e) {
		
	}
	}
}
