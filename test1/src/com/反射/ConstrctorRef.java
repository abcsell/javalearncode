package com.����;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstrctorRef {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, IllegalAccessException, InvocationTargetException {
		// TODO �Զ����ɵķ������
		//�����ַ����ĳ��÷���
		String s1=new String(new StringBuffer("cjgong"));
		//��ȡ����String��Ĺ��캯������
		Constructor<String> cs1=String.class.getConstructor(StringBuffer.class);
		//ͨ��Constructor�����ķ��������ַ���
		String s11=(String) cs1.newInstance(new StringBuffer("cjgong"));
		
		System.out.println("------------------------");
		//����ַ�����һЩ��Ϣ
		System.out.println("s1����ĵ�5��Ԫ��Ϊ"+s1.charAt(4));
		System.out.println("s11����ĵ����Ԫ��Ϊ"+s11.charAt(4));
		System.out.println("------------------------");
	}

}
