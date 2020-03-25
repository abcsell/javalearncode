package com.jicheng;

 class Inhert1 {
	int a ;
	void hi()
	{
		System.out.println("我是无敌的人");
	}
}
public class Inhert extends Inhert1{
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Inhert ob =new Inhert();
		ob.a=10;
		ob.hi();
	}
}

