package com.反射;

import java.lang.reflect.Array;
import java.util.Arrays;

//数组反射
public class ArrayRef {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建四种类型的数组
		int[] a1=new int[]{1,2,3};
		int[] a2 = new int[4];
		int[][] a3 = new int[2][3];
		String[] a4 = new String[] {"1","2","3"};
		System.out.println("-----------------");
		//判断数组a1和数组a2的字节码是否相同
		System.out.println("a1与a2数组的字节码是否相同" +(a1.getClass()==a2.getClass()));	//书上加号后面的判断语句没有加括号，导致报错
		//关于Array类的一些方法
		System.out.println("-----------------");
		System.out.println("a3数组的名字"+a3.getClass().getName());
		System.out.println("a1数组超类的名字"+a1.getClass().getSuperclass().getName());
		//关于数组与Object[]的对应关系
		Object obj1 = a1;			//这几行代码似乎没什么用
		Object obj3 = a4;
		Object[] obj4 = a4;
		Object obj5 = a3;
		Object[] obj6 = a3;
		System.out.println("------------------------------");
		System.out.println("无工具类Arrays的输出"+a1);
		System.out.println("无工具类Arrays的输出"+a4);
		//调用工具类arrays的aslist()方法
		System.out.println("有工具类Arrays的输出"+Arrays.asList(a1));
		System.out.println("有工具类Arrays的输出"+Arrays.asList(a4));
		System.out.println("------------------------------");
		//调用printObject()方法
		printObject(a1);
		printObject(1);
	} 
	//打印对象中成员方法
	private static void printObject(Object obj) {
		@SuppressWarnings("rawtypes")
		Class cla = obj.getClass();//获取字节码.
		if(cla.isArray()) {	//判断是否为数组
			System.out.println("调用自定义方法的数组的输出");
			int len = Array.getLength(obj);//获取数组的长度
			for(int i=0;i<len;i++) {				//输出数组中的各个成员
				System.out.println(Array.get(obj, i));
			}
			System.out.println("------------------------");
		}else {
			System.out.println("调用自定义方法的普通对象的输出");
			System.out.println(obj);
			System.out.println("------------------------------");
		}
	}

}
