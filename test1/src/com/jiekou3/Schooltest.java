package com.jiekou3;

//import com.jiekou3.Student;
//import com.jiekou3.Teacher;

public class Schooltest {
	public static void main(String[] args) {
		//��������ѧ������st1��st2
		Student st1=new Student();
		Student st2=new Student();
		//����������ʦ����te1��te2
		Teacher te1=new Teacher();
		Teacher te2=new Teacher();
		//���ڶ���st1����ز���
		st1.setschoolname("�����ѧ");
		st1.setclassname("���������");
		st1.setname("����");
		st1.setcode("09141234");
		st1.setsexy("��");
		st1.setbirthday("1975-12-12");
		st1.setfamilyaddress("������������");
		//���ڶ���st2����ز���
		st2.setschoolname("�����ѧ");
		st2.setclassname("���������");
		st2.setname("��÷÷");
		st2.setcode("0912344");
		st2.setsexy("Ů");
		st2.setbirthday("1975-11-09");
		st2.setfamilyaddress("�Ϻ����ϳ�ǽ");
		//���ڶ���te1����ز���
		te1.setschoolname("�廪��ѧ��ѧ");
		te1.setclassname("���������");
		te1.setname("����");
		te1.setcode("00123");
		te1.setsexy("Ů");
		te1.setbirthday("1923-12-12");
		te1.setfamilyaddress("�人��������");
		//���ڶ���te2����ز���
		te2.setschoolname("�㽭��ѧ");
		te2.setclassname("���������");
		te2.setname("��Ϊ��");
		te2.setcode("11233");
		te2.setsexy("��");
		te2.setbirthday("1956-12-01");
		te2.setfamilyaddress("�Ĵ�ʡ�ɶ�");
		//���ַ�������ʽ�����Щ������ַ���
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(te1.toString());
		System.out.println(te2.toString());
	}
}
