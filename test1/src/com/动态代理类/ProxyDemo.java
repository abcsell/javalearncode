package com.动态代理类;

public class ProxyDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建动态代理类对象
		ProxyHand ProxyHandler = new ProxyHand(new AdviceImp());
		//实例化动态代理类对象
		IHello hello = (IHello) ProxyHandler.bind(new HelloImp());
		hello.toHello("world!");//调用目标对象的相应方法
	}

}
