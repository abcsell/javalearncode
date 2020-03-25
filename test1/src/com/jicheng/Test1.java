package com.jicheng;

public class Test1 {
	int x=2;
	public static void main(String[] args)
	{
		int a =10;
		int b=a;//传值引用
		System.out.println("在重新给a赋值前a的值:"+a+"  "+"b的值："+b);
		a=30;
		System.out.println("在重新给a赋值后a的值:"+a+"  "+"b的值："+b);
		System.out.println("---------------------------");
		Test1 t=new Test1();
		Test1 t1=t;
		System.out.println("测试前的数据：");
		System.out.println("输出两个数据的值");
		System.out.println("t.x="+t.x);
		System.out.println("t1.x="+t1.x);
		System.out.println("测试后的数据");
		t.x=3;
		System.out.println("输出两个数据的值：");
		System.out.println("t.x="+t.x);
		System.out.println("t1.x="+t1.x);
		
	}
}
