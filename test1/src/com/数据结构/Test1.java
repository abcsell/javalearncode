package com.���ݽṹ;
import java.util.*;
public class Test1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// ��������
		@SuppressWarnings("rawtypes")
		ArrayList a1 = new ArrayList();
		//����7����ʦ����
		Teacher t = new Teacher("����ң","23452","��","1056-09-14");
		Teacher t1 = new Teacher("���Գ�","234235","��","1856-09-15");
		Teacher t2 = new Teacher("����","1234000","��","1956-09-16");
		Teacher t3 = new Teacher("����","1234001","��","1856-10-17");
		Teacher t4 = new Teacher("����","1234002","��","2056-02-18");
		Teacher t5 = new Teacher("�ƽ���","1234003","��","1865-09-19");
		Teacher t6 = new Teacher("С��","1234004","��","1997-09-20");
		//���ý�ʦ������Ϣ
		t1.setSchoolname("�廪��ѧ");
		t1.setClassname("���������");
		t1.setFamilyaddress("������������");
		t2.setSchoolname("�廪��ѧ");
		t2.setClassname("���������");
		t2.setFamilyaddress("������������");
		t3.setSchoolname("�廪��ѧ");
		t3.setClassname("���������");
		t3.setFamilyaddress("������������");
		t4.setSchoolname("�廪��ѧ");
		t4.setClassname("���������");
		t4.setFamilyaddress("������������");
		t5.setSchoolname("�廪��ѧ");
		t5.setClassname("���������");
		t5.setFamilyaddress("������������");
		t6.setSchoolname("�廪��ѧ");
		t6.setClassname("���������");
		t6.setFamilyaddress("������������");
		t.setSchoolname("�������պ����ѧ");
		t.setClassname("���������");
		t.setFamilyaddress("�����г�����");
		//��ÿ��������ӵ������б���ȥ
		a1.add(t1);
		a1.add(t2);
		a1.add(t3);
		a1.add(t4);
		a1.add(t5);
		a1.add(t6);
		//���
		System.out.println("���С����"+a1.size()+"����ʦ��");
		for(int i=0;i<a1.size();i++) {
			//��������б���Ԫ�أ����ַ�����ʽ
			System.out.println((Teacher) a1.get(i));
		}
		System.out.println("�Բ���ϵͳ�����ˣ��и���ʦ��Ϣ���ˣ���Ҫ����");
		a1.set(5, t);
		System.out.println("�������ǵ���˺󣬽�ʦ��Ϣ����:");
		for(int i=0;i<a1.size();i++) {
			System.out.println((Teacher) a1.get(i));
		}
		//ɾ�������б��е�Ԫ��
		a1.remove(2);
		a1.remove(4);
		System.out.println("��������ʦ��ְ�ˣ�����ʣ�½�ʦ��ϢΪ��");
		for(int i=0;i<a1.size();i++) {
			System.out.println((Teacher) a1.get(i));
		}
	}

}
