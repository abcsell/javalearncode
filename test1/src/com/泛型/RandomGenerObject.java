package com.����;

import java.util.Vector;

public class RandomGenerObject {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Vector<Integer> v = new Vector<Integer>(); //����Integer���͵ķ��Ͷ���
		Vector<Object> v1= new Vector<Object>(); 	//����Object���ͷ��Ͷ���
		//���þ�̬����radomMeth
		radomMeth1(v);
		radomMeth(v1);
		
		
	}
	public static void radomMeth(Vector<Object> vector) {	//�����������ͷ��ͷ���
		vector.add("cjg");
		vector.add(156);
		for (Object obj:vector) {							//ͨ��ѭ��ʵ�ֱ���
			System.out.println(obj);
		}
		
	}
	
	public static void radomMeth1(Vector<Integer> vector) {	//����int���ͷ��ͷ���
		vector.add(134);
		vector.add(125);
		vector.add(156);
	
		for (Object obj:vector) {							//ͨ��ѭ��ʵ�ֱ���
			System.out.println(obj);
		}
		
	}

}
