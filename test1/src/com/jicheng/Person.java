package com.jicheng;

 class Animal {
	 int a;
	 Animal() 
	 {
		 a=10;
		 System.out.println("����һ������Ĺ��캯��");
	 }
 }
 public class Person extends Animal{
	 int b;
	 Person()
	 {
		 //super()
		 b=20;
		 System.out.println("���Ǹ�����Ĺ��캯��");
	 }
	 public static void main(String[] args) {
			// TODO �Զ����ɵķ������
		 	Person p = new Person();
		 	System.out.println(p.a+" "+p.b);
		}
 }
	


