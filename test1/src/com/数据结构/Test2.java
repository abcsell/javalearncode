package com.���ݽṹ;

import java.util.Hashtable;

public class Test2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//��������ht
		Hashtable ht = new Hashtable();
//		����7����ʦ����
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
		//��ɢ�б������Ԫ��
		ht.put("zh", t1);
		ht.put("lp", t2);
		ht.put("wp", t3);
		ht.put("sb", t4);
		ht.put("zw", t5);
		ht.put("sj", t6);
		System.out.println("���С����"+ht.size()+"����ʦ��");
		//���ɢ�б��е�Ԫ�ظ���
		System.out.println(ht.values());
		System.out.println("����Ҫ����һ����ʦ����Ϣ��");
		//���ɢ�б��е�Ԫ�ظ���
		if(ht.containsKey("wh")) {
			System.out.println("�ҵ��˴˽�ʦ����Ϣ�����£�");
			System.out.println((Teacher) ht.get("wh"));
		}else {
			System.out.println("û���ҵ��ν�ʦ����Ϣ��");
		}
		ht.remove("lp");
		ht.remove("sj");//ɾ��ɢ�б��е�Ԫ��
		System.out.println("������Щ��ʦ�뿪��ѧУ���������ǵ���˺󣬽�ʦ��Ϣ���£�");
		System.out.println(ht.values());//���ɢ�б���ʣ�µ�Ԫ������
	}

}
