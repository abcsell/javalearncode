package com.类加载器;

public class InternalLoad {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("-----------------------");
		//internaload类加载器的名字
		System.out.println("InternalLoad类加载器的名字:"+InternalLoad.class.getClassLoader().getClass().getName());
		System.out.println("-----------------------");
		//system类加载器的名字
		System.out.println("System类加载器的名字:"+System.class.getClassLoader());
		//获取Internalload类加载器
		ClassLoader load = InternalLoad.class.getClassLoader();
		System.out.println("------------------------");
		//遍历Internalload类加载器
		while (load !=null) {
			System.out.println(load.getClass().getName());
			load=load.getParent();
		}
		System.out.println(load);
	}

}
