package com.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyDirectInstan {

	public static void main(String[] args) {
		//ͨ������newProxyInstance��������ʵ������̬������
		// TODO �Զ����ɵķ������
		@SuppressWarnings("rawtypes")
		Collection proxy1=(Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(), new Class[] {Collection.class}, new InvocationHandler() {
			public Object invoke(Object proxy,Method method, Object[] args)throws Throwable{
				return null;
			}
		});
		System.out.println(proxy1);
	}

}























