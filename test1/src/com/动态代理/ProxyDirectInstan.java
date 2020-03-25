package com.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyDirectInstan {

	public static void main(String[] args) {
		//通过调用newProxyInstance（）方法实例化动态代理类
		// TODO 自动生成的方法存根
		@SuppressWarnings("rawtypes")
		Collection proxy1=(Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(), new Class[] {Collection.class}, new InvocationHandler() {
			public Object invoke(Object proxy,Method method, Object[] args)throws Throwable{
				return null;
			}
		});
		System.out.println(proxy1);
	}

}























