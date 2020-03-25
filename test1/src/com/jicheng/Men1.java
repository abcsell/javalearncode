package com.jicheng;
class Person1
{
	int a;
	Person1()
	{
		a=1;
	}
	Person1(int a)
	{
		this.a=a;
	}
}
public class Men1 extends Person1 {
	int b;
	Men1(int a,int b)
	{
		super(a);
		this.b=b;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Men1 m =new Men1(10,20);
		System.out.println(m.a+" "+m.b);
	}

}
