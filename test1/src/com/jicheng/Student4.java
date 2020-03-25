package com.jicheng;
	
public class Student4
{
	void print()
	{
		System.out.println("这是我的同学");
	}
	void print(String name)
	{
		System.out.println("这是小明的同学"+name);
	}
	public static void main(String[] args)
	{
		Student4 st=new Student4();
		Student5 st1= new Student5();
		st.print();
		st.print("tom");
		st1.print();
	}
}
class Student5 extends Student4{
	void print()
	{
		System.out.println("这是小明的同学");
		System.out.println("他说他很优秀！");
	}
}
