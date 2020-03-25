package com.反射;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		// TODO 自动生成的方法存根
		String s1="1234";		//创建一个字符串变量s1
		//获取关于s1和String类的字节码
		@SuppressWarnings("rawtypes")
		Class c1=s1.getClass();
		@SuppressWarnings("rawtypes")
		Class c2=String.class;
		@SuppressWarnings("rawtypes")
		Class c3=Class.forName("java.lang.String");
		//比较字节码是否相同
		System.out.println("-----------------------");
		System.out.println("c1和c2是否是同一个对象"+(c1==c2));
		System.out.println("c1和c3是否是同一个对象"+(c1==c3));
		System.out.println(c1);
		System.out.println("-----------------------");
		//检测是否为基本类型
		System.out.println("String是否是基本类型"+String.class.isPrimitive());
		System.out.println("int是否是基本类型"+int.class.isPrimitive());
		//检测int 和Integer是否指向同一字节码
		System.out.println("int与Integer的字节码是否是同一个对象     "+(int.class==Integer.class));
		System.out.println("int与Integer.Type的字节码是否是同一个对象     "+(int.class==Integer.TYPE));
		//关于数组方面的字节码
		System.out.println("-----------------------");
		System.out.println("int[]是否是基本类型"+int[].class.isPrimitive());
		System.out.println("int[]是否是数组类型"+int[].class.isArray());
		
		
		
	}

}




















