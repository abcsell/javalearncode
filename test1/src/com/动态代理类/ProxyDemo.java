package com.��̬������;

public class ProxyDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//������̬���������
		ProxyHand ProxyHandler = new ProxyHand(new AdviceImp());
		//ʵ������̬���������
		IHello hello = (IHello) ProxyHandler.bind(new HelloImp());
		hello.toHello("world!");//����Ŀ��������Ӧ����
	}

}
