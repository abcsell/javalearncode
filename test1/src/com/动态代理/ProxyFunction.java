package com.��̬����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyFunction {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ȡ��������ֽ���
		Class proxy1 = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		System.out.println(proxy1.getName());   	//����ֽ��������
		System.out.println("���캯�����б�---------------------------");
		//��ȡ���캯����
		Constructor[] constructors = proxy1.getConstructors();
		for(Constructor constructor:constructors) {	//�������캯��
			String name = constructor.getName();	//��ȡ���캯��������
			//��������name�������ַ���
			StringBuilder sBuilder = new StringBuilder(name);
			sBuilder.append('(');     //�ַ�������ӡ�(��
			//��ȡ���캯������������
			Class[] params =constructor.getParameterTypes();
			for(Class param:params) {		//��������������
				sBuilder.append(param.getName()).append(',');
			}
			if (params !=null && params.length !=0) {
				sBuilder.deleteCharAt(sBuilder.length()-1);
			}
			sBuilder.append(')');
			System.out.println(sBuilder.toString());//����ַ���
		}
		System.out.println("�������б�----------------------------------------------");
		Method[] methods = proxy1.getMethods();//��ȡ������
		for(Method method : methods) {			//��������
			String name = method.getName();
			StringBuilder sBuilder = new StringBuilder(name);
			sBuilder.append('(');
			Class[] params = method.getParameterTypes();
			for(Class param :params) {							//��������������
				sBuilder.append(param.getName()).append(',');
				}
			if (params !=null && params.length !=0) {
				sBuilder.deleteCharAt(sBuilder.length()-1);
			}
			sBuilder.append(')');
			System.out.println(sBuilder.toString());        //�������
		}
	}

}






















