package com.����.��Ա����;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import com.����.��Ա����.StaticMain;

public class StaticMainRef {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������
		//������ľ�ͷ��ʽ
		StaticMain.main(new String[] {"111","222","333","444"});
		//ͨ�����������ľ�̬����
		startClass("com.����.��Ա����.StaticMain");  //�����о����֣�����������Ƕ�Ӧ���࣬
	}
	//ͨ�����������ľ�̬�����ķ���
	public static void startClass(String className) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//��ȡ��Ӧ�����main����
		Method mainMethod =Class.forName(className).getMethod("main", String[].class);
		//ִ��main����
		mainMethod.invoke(null, new Object[] {new String[] {"111","222","333","444"}});
		mainMethod.invoke(null, (Object) new String[] {"111","222","333","444"});
	}
}
