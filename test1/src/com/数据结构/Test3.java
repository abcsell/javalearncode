package com.���ݽṹ;
import java.util.*;
public class Test3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// ����һ��ɢ�м�����
		HashSet hs = new HashSet();
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
		hs.add(t1);//��ɢ�м������Ԫ��
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		System.out.println("���С����"+hs.size()+"����ʦ��");
		//���ɢ�м��е�Ԫ�ظ���
		Iterator it =hs.iterator();//�½�һ������������
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		hs.remove(t3);
		hs.remove(t4);
		System.out.println("������Щ��ʦ�뿪��ѧУ���������ǵ���˺󣬽�ʦ��Ϣ���£�");
		Iterator it1 = hs.iterator();//�½�һ������������
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("��Щ��ż��ʾ��ְ�ˣ����еĽ�ʦ��Ϣ��ɾ��");
		hs.remove(t1);
		hs.remove(t2);
		hs.remove(t5);
		hs.remove(t6);
		if(hs.isEmpty()) {//��Ԫ��Ϊ��
			System.out.println("����ѽ�ʦ��Ϣ��ɾ����");
		}else {
			System.out.println("ϵͳ�����ˣ�����");
		}
	}

}
