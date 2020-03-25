package com.泛型;

import java.util.ArrayList;

public class AdvancedGeneric {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> arry1 = new ArrayList<String>();
		arry1.add("cjg");									//创建对象arry1
		ArrayList<Integer> arry2 = new ArrayList<Integer>();
		arry2.add(27);											//创建对象arry2
		System.out.println(arry1.getClass());
		System.out.println(arry2.getClass());
		System.out.println("array1对象与array2对象是否指向同一份字节码？"+(arry1.getClass()==arry2.getClass()));
		
	}

}
