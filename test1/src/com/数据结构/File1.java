package com.���ݽṹ;

import java.util.Iterator;
import java.util.LinkedList;

public class File1 {
	public void add() {
		LinkedList<String> List = new LinkedList<String>();//����Ҫ�����������list
		//���Ԫ�ص�����list��
		List.add("��Ѹ");
		List.add("�����");
		List.add("����");
		List.add("����ɴ");
		List.add("������");
		List.add("�����");
		List.add("��Ԫ��");
		Iterator<String> it = List.iterator();//����һ������������it
		System.out.println("������������µ�ͬѧ������:");
		//ͨ������������it������list�����е�Ԫ��
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("ɾ��ĳЩͬѧ�������󣬻�ʣ����Щͬѧ�أ�");
		it.remove();//�Ƴ�Ԫ��
		//������һ������������it1�����±���list�����е�Ԫ��
		Iterator<String> it1 = List.iterator();
		for(int i=0;i<List.size(); i++) {
			System.out.println(it1.next());
		}
	}
	public static void main(String[] args) {
		// ������
		File1 f = new File1();//��������f
		f.add();//���ö���add
		

	}

}
