package com.jicheng;

 class Inhert1 {
	int a ;
	void hi()
	{
		System.out.println("�����޵е���");
	}
}
public class Inhert extends Inhert1{
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Inhert ob =new Inhert();
		ob.a=10;
		ob.hi();
	}
}

