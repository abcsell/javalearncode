package com.���ݴ���;

import java.util.Arrays;

public class File8 {

	public static void main(String[] args) {//������
		// ��������ѧ������
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
		
	
	//����ѧ���������
	
	Student[] a = new Student[] {st1, st2,st3,st4,st5,st6,st7,st8,st9,st10 };
	try {
		Arrays.sort(a);//ʵ��������
		//ͨ��ѭ�������������ݵ����
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}catch(Exception e) {
		System.out.println("������");
	}
}
}
