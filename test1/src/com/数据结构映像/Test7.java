package com.���ݽṹӳ��;

import java.util.TreeMap;



public class Test7 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// ����һ����ӳ�����tm
		TreeMap tm = new TreeMap();
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
		//ͨ����������ֵ������
				tm.put("zh", t1);
				tm.put("lp", t2);
				tm.put("wp", t3);
				tm.put("sb", t4);
				tm.put("zw", t5);
				tm.put("sj", t6);
				System.out.println("���С����"+tm.size()+"����ʦ��");
				System.out.println(tm.values());
				tm.remove("lp");
				tm.remove("sb");
				System.out.println("�����û��С�������ʦ");
				if(tm.containsKey("sj")) {
					System.out.println("�����ʦ�Ǵ��ڵģ�������Ϣ���£�");
					System.out.println((Teacher)tm.get("sj"));
				}else {
					System.out.println("����û�������ʦ");
				}
				System.out.println("������Щ��ʦ�뿪��ѧУ���������ǵ���ˣ���ʦ��Ϣ����");
				System.out.println(tm.values());
				System.out.println("��Щ��ʦ���춼�뿪�ˣ����н�ʦ��Ϣ������ɾ����");
				tm.remove("zh");
				tm.remove("sj");
				tm.remove("zw");
				tm.remove("wp");
				if(tm.isEmpty()) {//��Ԫ��Ϊ��
					System.out.println("����ѽ�ʦ��Ϣ��ɾ����");
				}else {
					System.out.println("ϵͳ�����ˣ�����");
				}
	}

}
