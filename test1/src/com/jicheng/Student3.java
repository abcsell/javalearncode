package com.jicheng;
public class Student3
{
	void print()
	{
		System.out.println("����С����ͬѧ");
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student3 st=new Student3();
		Student2 st1=new Student2();
		st.print();
		st1.print();
	}
}
  class Student2 extends Student3{
	void print()
	{
		System.out.println("����С����ͬѧ1");
		System.out.println("���������");
	}
	

}
