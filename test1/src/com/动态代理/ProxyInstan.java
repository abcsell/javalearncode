package com.��̬����;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyInstan {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������
		Class proxy1 =Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);//��ȡ��̬���ֽ���
		Constructor constructor =proxy1.getConstructor(InvocationHandler.class);	//��ȡ��ز������캯��
		//����InvocationHandler���͵���
	class MyInvocationHander1 implements InvocationHandler{
		public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
			return null;
		}
	}
		Collection collection = (Collection) constructor.newInstance(new MyInvocationHander1());//���ù��캯��ʵ������̬��
	//����������ķ�ʽʵ������̬��
		Collection collection1=(Collection) constructor.newInstance(new InvocationHandler(){
			public Object invoke (Object proxy,Method method, Object[] args) throws Throwable{
				return null;
			}
		});
		//�����̬��ʵ������
		System.out.println(collection);
		System.out.println(collection1);
	}

}






















