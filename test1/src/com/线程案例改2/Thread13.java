package com.线程案例改2;

 
public class Thread13{//创建测试类
	public static void main(String[] args) {//主方法
		Hmaker1 maker1 = new Hmaker1();//创建对象maker
		Hmaker1 maker2 = new Hmaker1();//创建对象maker
		Hassistant assistant1 =new Hassistant();//创建对象assistant1
		Hassistant assistant2 =new Hassistant();//创建对象assistant2
		//对对象maker进行设置
		maker1.setName("甲");
		maker2.setName("乙");
		//设置对象 
		assistant1.setName("甲");
		assistant2.setName("乙");
		//启动线程
		maker1.start();
		maker2.start();
		assistant1.start();
		assistant2.start();
	}
}
