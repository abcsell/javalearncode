package com.线程案例改;

public class Ham {						//创建把装汉堡包的箱子作为监视器类
	static Object box = new Object(); //对象box
	static int totalmaterial = 10;//关于制作汉堡包的材料属性
	static int sales1 = 0;			//关于销售多少个汉堡包的属性
	static int sales2 = 0;			//关于销售多少个汉堡包的属性
	static int production = 5;			//关于一共有多少个汉堡包属性
}
