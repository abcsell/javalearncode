package com.动态代理类;

public class AdviceImp implements IAdvice{

	public void beforMethod() {
		System.out.println("before......"); //实现beforMethod()方法
	}
	public void afterMethod() {
		System.out.println("after........");
	}
}
