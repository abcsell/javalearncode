package com.chongzai;

public class Overlaod1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Overlaod1 o = new Overlaod1();
		o.print();
		o.print("����");
		o.print("����",30);
	}
	void print()
	{
		System.out.println("����");
	}
	void print(String name)
	{
		System.out.println(name+"�����");
	}
	void print(String name,  int age)
	{
		System.out.println(name+"�����ã�����"+age+"���ˣ�����");
	}
}
