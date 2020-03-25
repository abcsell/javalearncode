package com.泛型;

import java.util.Vector;

public class RandomGenerObject {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector<Integer> v = new Vector<Integer>(); //创建Integer类型的泛型对象
		Vector<Object> v1= new Vector<Object>(); 	//创建Object类型泛型对象
		//调用静态方法radomMeth
		radomMeth1(v);
		radomMeth(v1);
		
		
	}
	public static void radomMeth(Vector<Object> vector) {	//接受任意类型泛型方法
		vector.add("cjg");
		vector.add(156);
		for (Object obj:vector) {							//通过循环实现遍历
			System.out.println(obj);
		}
		
	}
	
	public static void radomMeth1(Vector<Integer> vector) {	//接受int类型泛型方法
		vector.add(134);
		vector.add(125);
		vector.add(156);
	
		for (Object obj:vector) {							//通过循环实现遍历
			System.out.println(obj);
		}
		
	}

}
