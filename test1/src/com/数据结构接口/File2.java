package com.���ݽṹ�ӿ�;

import java.util.Iterator;
import java.util.LinkedList;

public class File2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// ����10��ѧ������
		Student st1 = new Student("����");
		Student st2 = new Student("����");
		Student st3 = new Student("�����");
		Student st4 = new Student("�Խ");
		Student st5 = new Student("�����");
		Student st6 = new Student("������");
		Student st7 = new Student("��С��ͯ");
		Student st8 = new Student("������");
		Student st9 = new Student("����");
		Student st10 = new Student("����");
		//ͨ����������ԣ������������ֵ
		st1.set(20,"��","10000","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st2.set(21,"��","10001","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st3.set(25,"Ů","10002","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st4.set(27,"Ů","10003","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st5.set(24,"Ů","10004","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st6.set(30,"Ů","10005","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st7.set(70,"��","10006","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st8.set(10,"��","10007","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st9.set(50,"��","10008","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		st10.set(31,"Ů","10009","������ӰѧԺ","��ѧһ�꼶","����רҵ","�����к�����666��");
		try {
			@SuppressWarnings("rawtypes")
			LinkedList List1 = new LinkedList();
			//���10��ѧ�����󵽶���list1��
			List1.add(st1);
			List1.add(st2);
			List1.add(st3);
			List1.add(st4);
			List1.add(st5);
			List1.add(st6);
			List1.add(st7);
			List1.add(st8);
			List1.add(st9);
			List1.add(st10);
			//it�ǵ���������ͨ������ָ�������е�Ԫ��
			@SuppressWarnings("rawtypes")
			Iterator it = List1.iterator();
			System.out.println("���¾������е�ͬѧ����Ϣ!");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("�����м���ͬѧ�Ѿ�תѧ��");
			System.out.println("��ô�ʹ����ݿ���ɾ������");
			//�Ƴ���Ӧ��Ϣ
			List1.remove();
			List1.remove();
			List1.remove();
			List1.remove();
			List1.remove();
			@SuppressWarnings("rawtypes")
			Iterator it1 = List1.iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
		}catch(Exception e) {
			
		}finally {
			System.out.println("���ǳ���������");
		}
	}

}
