package com.����;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodRef {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException{
		// TODO �Զ����ɵķ������
		String s1 = "abcdef"; //����һ���ַ���
		//��ȡ��String�й��ڲ���Ϊint �ķ���charat
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		//����s1���÷���charat
		System.out.println("����s1�ֵڶ�����ĸΪ"+methodCharAt.invoke(s1, 1));
		System.out.println("����s1�еڶ�����ĸΪ"+methodCharAt.invoke(s1, new Object[] {1}));
	}

}
