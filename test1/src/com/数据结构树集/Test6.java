package com.���ݽṹ����;
//����һ������İ�����������
import java.util.Iterator;
import java.util.TreeSet;

import com.���ݽṹ.Teacher;

public class Test6 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet ts = new TreeSet();//����һ����������ts
		//����6����ʦ����
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
		//ͨ����������ֵ��ÿ������
		ts.add(t1);//�������������Ԫ��
		ts.add(t2);//�������������Ԫ��
		ts.add(t3);//�������������Ԫ��
		ts.add(t4);//�������������Ԫ��
		ts.add(t5);//�������������Ԫ��
		ts.add(t6);//�������������Ԫ��
		System.out.println("���С����"+ts.size()+"����ʦ��");
		//��������е�Ԫ�ظ���
		Iterator it = ts.iterator();//�½�һ������������
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ts.remove(t3);
		ts.remove(t4);//ɾ��Ԫ��
		System.out.println("��Щ��ʦ�뿪ѧУ����ʦ��Ϣ���£�");
		Iterator it1 = ts.iterator();//�½�����������
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("������Щ��ʦ����ְ�ˣ���ʦ��Ϣȫ��ɾ����");
		ts.remove(t1);
		ts.remove(t2);
		ts.remove(t5);
		ts.remove(t6);
		if(ts.isEmpty()) {//��Ԫ��Ϊ��
			System.out.println("����ѽ�ʦ��Ϣ��ɾ����");
		}else {
			System.out.println("ϵͳ�����ˣ�����");
		}
	}

}
