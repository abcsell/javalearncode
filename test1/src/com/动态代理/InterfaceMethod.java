package com.动态代理;

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
		// TODO 自动生成的方法存根
		Class proxy1=Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class); 	//	获取动态类字节码
		Constructor constructor = proxy1.getConstructor(InvocationHandler.class);  		//	获取相关参数构造函数
		//关于invocationHandler类型的类
		class MyInvocationHander1 implements InvocationHandler{
			ArrayList target = new ArrayList();
			
			//编写invoke()方法
			public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
				//获取系统的当前时间
				long beginTime = System.currentTimeMillis();
				System.out.println("开始时间"+beginTime);
				//调用target对象的相应方法
				Object ret =method.invoke(target, args);
				//获取系统的当前时间
				long endTime = System.currentTimeMillis();
				System.out.println("结束时间"+endTime);
				return ret;
			}
		}
		Collection collection= (Collection) constructor.newInstance(new MyInvocationHander1()); //实例化动态代理类
		//调用相应方法
		collection.add("124");
		collection.add("123");
		System.out.println("集合中的元素数"+collection.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
