package com.jicheng;
public class Student3
{
	void print()
	{
		System.out.println("这是小明的同学");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student3 st=new Student3();
		Student2 st1=new Student2();
		st.print();
		st1.print();
	}
}
  class Student2 extends Student3{
	void print()
	{
		System.out.println("这是小明的同学1");
		System.out.println("他很优秀的");
	}
	

}
