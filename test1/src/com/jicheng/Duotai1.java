package com.jicheng;

public class Duotai1 {
	int x;
	int y;
	int z;
	void print(int x)	//����һ��print����
	{
		System.out.println(2*x);
	}
	void print (int x,int y) {
		System.out.println(2*x+y);
	}
	void print(int x,int y,int z)
	{
		System.out.println(2*x+y*z);
	}
	void print(double a) {
		System.out.println(2*a);
	}
	void print(double a,double b)
	{
		System.out.println(2*a+b);
	}
	void print(double a,double b,double c)
	{
		System.out.println(2*a+b+c);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Duotai1 st = new Duotai1();
		st.print(2);
		st.print(2,3);
		st.print(2,3,5);
		st.print(2.1);
		st.print(2.1,1.1);
		st.print(2.1,1.1,2.2);
		st.print(2.6);
	}

}
