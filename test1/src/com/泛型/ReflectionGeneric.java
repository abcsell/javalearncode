package com.����;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ReflectionGeneric {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO �Զ����ɵķ������
		ArrayList<Integer> arry1=new ArrayList<Integer>();  //��������arry1
		//�����������������
		arry1.add(27);
		arry1.add(29);
		//ͨ�������򼯺�������ַ���abc
		arry1.getClass().getMethod("add", Object.class).invoke(arry1, "abc");
		//��������еĸ���Ԫ��
		System.out.println("��һ��Ԫ��Ϊ��"+arry1.get(0));
		System.out.println("�ڶ���Ԫ��Ϊ��"+arry1.get(1));
		System.out.println("������Ԫ��Ϊ��"+arry1.get(2));
	}

}
