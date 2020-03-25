package com.chongzai;

public class Overlaod1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Overlaod1 o = new Overlaod1();
		o.print();
		o.print("王华");
		o.print("王华",30);
	}
	void print()
	{
		System.out.println("您好");
	}
	void print(String name)
	{
		System.out.println(name+"，你好");
	}
	void print(String name,  int age)
	{
		System.out.println(name+"，您好，您有"+age+"岁了！！！");
	}
}
