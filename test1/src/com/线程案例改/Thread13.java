package com.线程案例改;

 
public class Thread13{//创建测试类
	public static void main(String[] args) {//主方法
		Hmaker maker = new Hmaker();//创建对象maker
		Hassistant assistant1 =new Hassistant();//创建对象assistant1
		Hassistant assistant2 =new Hassistant();//创建对象assistant2
		//对对象maker进行设置
		maker.setName("甲");
		//设置对象 
		assistant1.setName("甲");
		assistant2.setName("乙");
		//启动线程
		maker.start();
		assistant1.start();
		assistant2.start();
	}
}
