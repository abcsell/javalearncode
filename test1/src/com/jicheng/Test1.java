package com.jicheng;

public class Test1 {
	int x=2;
	public static void main(String[] args)
	{
		int a =10;
		int b=a;//��ֵ����
		System.out.println("�����¸�a��ֵǰa��ֵ:"+a+"  "+"b��ֵ��"+b);
		a=30;
		System.out.println("�����¸�a��ֵ��a��ֵ:"+a+"  "+"b��ֵ��"+b);
		System.out.println("---------------------------");
		Test1 t=new Test1();
		Test1 t1=t;
		System.out.println("����ǰ�����ݣ�");
		System.out.println("����������ݵ�ֵ");
		System.out.println("t.x="+t.x);
		System.out.println("t1.x="+t1.x);
		System.out.println("���Ժ������");
		t.x=3;
		System.out.println("����������ݵ�ֵ��");
		System.out.println("t.x="+t.x);
		System.out.println("t1.x="+t1.x);
		
	}
}
