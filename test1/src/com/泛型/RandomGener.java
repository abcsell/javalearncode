package com.����;

import java.util.Vector;

public class RandomGener {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Vector<Integer> v =new Vector<Integer>();  //������Ӧ���͵ķ��͵Ķ���
		//��ӳ�Ա
		v.add(1);
		v.add(2);
		Vector<Object> v1 = new Vector<Object>();
		//��ӳ�Ա
		v1.add("aa");
		v1.add(2.2);
		radomMeth(v);
		radomMeth(v1);
		
	}
public static void radomMeth(Vector<?> vector) { //�����������Ͳ����ķ���
	System.out.println("���"+vector+"������Ա------------------------");
	for(Object obj :vector) {	//ͨ��ѭ������  ��ǿforѭ��
		System.out.println(obj);
	}
	System.out.println("����Ĵ�С"+vector.size());
}
}
