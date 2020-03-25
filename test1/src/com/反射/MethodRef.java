package com.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodRef {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException{
		// TODO 自动生成的方法存根
		String s1 = "abcdef"; //定义一个字符串
		//获取类String中关于参数为int 的方法charat
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		//对象s1调用方法charat
		System.out.println("对象s1种第二个字母为"+methodCharAt.invoke(s1, 1));
		System.out.println("对象s1中第二个字母为"+methodCharAt.invoke(s1, new Object[] {1}));
	}

}
