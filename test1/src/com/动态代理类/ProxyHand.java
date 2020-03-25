package com.��̬������;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHand implements InvocationHandler{
	//����������Ա�ֶ�
	private Object target; 	//Ŀ�����
	private IAdvice advice; //���ط�������
	public ProxyHand(IAdvice advice) {//���ι��캯��
		super();
		this.advice=advice;
	}
	public Object bind(Object target) { //��ȡ��̬�������ʵ������
		this.target=target;    //��Ŀ�������и�ֵ
		//ͨ��Proxy��ľ�̬����newProxyInstance()��ȡʵ������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	//ʵ��invoke��)����
	public Object invoke(Object proxy, Method method,Object[] obj)throws Throwable{
		advice.beforMethod();//������Ӧ�����ط���
		Object result = method.invoke(target, obj);//����Ŀ��������Ӧ����
		advice.afterMethod();//������Ӧ�����ط���
		return result;
	}
}
