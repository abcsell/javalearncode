package com.jicheng;
	
public class Student4
{
	void print()
	{
		System.out.println("�����ҵ�ͬѧ");
	}
	void print(String name)
	{
		System.out.println("����С����ͬѧ"+name);
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
		System.out.println("����С����ͬѧ");
		System.out.println("��˵�������㣡");
	}
}
