package com.jicheng;

 class Animal {
	 int a;
	 Animal() 
	 {
		 a=10;
		 System.out.println("这是一个父类的构造函数");
	 }
 }
 public class Person extends Animal{
	 int b;
	 Person()
	 {
		 //super()
		 b=20;
		 System.out.println("这是个子类的构造函数");
	 }
	 public static void main(String[] args) {
			// TODO 自动生成的方法存根
		 	Person p = new Person();
		 	System.out.println(p.a+" "+p.b);
		}
 }
	


