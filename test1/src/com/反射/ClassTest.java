package com.����;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		// TODO �Զ����ɵķ������
		String s1="1234";		//����һ���ַ�������s1
		//��ȡ����s1��String����ֽ���
		@SuppressWarnings("rawtypes")
		Class c1=s1.getClass();
		@SuppressWarnings("rawtypes")
		Class c2=String.class;
		@SuppressWarnings("rawtypes")
		Class c3=Class.forName("java.lang.String");
		//�Ƚ��ֽ����Ƿ���ͬ
		System.out.println("-----------------------");
		System.out.println("c1��c2�Ƿ���ͬһ������"+(c1==c2));
		System.out.println("c1��c3�Ƿ���ͬһ������"+(c1==c3));
		System.out.println(c1);
		System.out.println("-----------------------");
		//����Ƿ�Ϊ��������
		System.out.println("String�Ƿ��ǻ�������"+String.class.isPrimitive());
		System.out.println("int�Ƿ��ǻ�������"+int.class.isPrimitive());
		//���int ��Integer�Ƿ�ָ��ͬһ�ֽ���
		System.out.println("int��Integer���ֽ����Ƿ���ͬһ������     "+(int.class==Integer.class));
		System.out.println("int��Integer.Type���ֽ����Ƿ���ͬһ������     "+(int.class==Integer.TYPE));
		//�������鷽����ֽ���
		System.out.println("-----------------------");
		System.out.println("int[]�Ƿ��ǻ�������"+int[].class.isPrimitive());
		System.out.println("int[]�Ƿ�����������"+int[].class.isArray());
		
		
		
	}

}




















