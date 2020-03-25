package com.泛型;

import java.util.Vector;

public class RandomGener {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector<Integer> v =new Vector<Integer>();  //创建相应类型的泛型的对象
		//添加成员
		v.add(1);
		v.add(2);
		Vector<Object> v1 = new Vector<Object>();
		//添加成员
		v1.add("aa");
		v1.add(2.2);
		radomMeth(v);
		radomMeth(v1);
		
	}
public static void radomMeth(Vector<?> vector) { //接受任意类型参数的方法
	System.out.println("输出"+vector+"各个成员------------------------");
	for(Object obj :vector) {	//通过循环遍历  增强for循环
		System.out.println(obj);
	}
	System.out.println("对象的大小"+vector.size());
}
}
