package com.��̬����;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

public class InterfaceMethod {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������
		Class proxy1=Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class); 	//	��ȡ��̬���ֽ���
		Constructor constructor = proxy1.getConstructor(InvocationHandler.class);  		//	��ȡ��ز������캯��
		//����invocationHandler���͵���
		class MyInvocationHander1 implements InvocationHandler{
			ArrayList target = new ArrayList();
			
			//��дinvoke()����
			public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
				//��ȡϵͳ�ĵ�ǰʱ��
				long beginTime = System.currentTimeMillis();
				System.out.println("��ʼʱ��"+beginTime);
				//����target�������Ӧ����
				Object ret =method.invoke(target, args);
				//��ȡϵͳ�ĵ�ǰʱ��
				long endTime = System.currentTimeMillis();
				System.out.println("����ʱ��"+endTime);
				return ret;
			}
		}
		Collection collection= (Collection) constructor.newInstance(new MyInvocationHander1()); //ʵ������̬������
		//������Ӧ����
		collection.add("124");
		collection.add("123");
		System.out.println("�����е�Ԫ����"+collection.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
