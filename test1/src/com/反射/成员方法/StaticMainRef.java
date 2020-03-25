package com.反射.成员方法;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import com.反射.成员方法.StaticMain;

public class StaticMainRef {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的方法存根
		//调用类的镜头方式
		StaticMain.main(new String[] {"111","222","333","444"});
		//通过反射调用类的静态方法
		startClass("com.反射.成员方法.StaticMain");  //经过研究发现，这里的内容是对应的类，
	}
	//通过反射调用类的静态方法的方法
	public static void startClass(String className) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获取相应的类的main方法
		Method mainMethod =Class.forName(className).getMethod("main", String[].class);
		//执行main方法
		mainMethod.invoke(null, new Object[] {new String[] {"111","222","333","444"}});
		mainMethod.invoke(null, (Object) new String[] {"111","222","333","444"});
	}
}
