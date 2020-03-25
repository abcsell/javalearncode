package com.线程案例改2;

public class Ham {						//创建把装汉堡包的箱子作为监视器类
	static Object box1 = new Object(); //对象box1
	static Object box2 = new Object(); //对象box2
	static int totalmaterial1 = 10;//关于制作汉堡包的材料属性
	static int totalmaterial2 = 10;//关于制作汉堡包的材料属性
	//关于销售多少个汉堡包的属性
	static int sales11 = 0;			
	static int sales12 = 0;			//关于销售多少个汉堡包的属性
	static int sales21 = 0;			//关于销售多少个汉堡包的属性
	static int sales22 = 0;			//关于销售多少个汉堡包的属性
	static int production1 = 5;			//关于一共有多少个汉堡包属性
	static int production2 = 5;			//关于一共有多少个汉堡包属性
}
