package com.chouxiang2;
//���࣬���ڳ�����Ĳ�����
public class Abstracttest {

	public static void main(String[] args) {	//������
		// TODO �Զ����ɵķ������
		//��������s1��s3
		Student1 s1=new Student1();
		Student3 s3=new Student3();
		//���ö���s1���������
		s1.setschoolname("�����ѧ");
		s1.setclassname("���������");
		s1.setlocation("ɳƺ��");
		s1.setstudentname("����");
		s1.setstudentcode("0211234");
		s1.setstudentsexy("��");
		s1.setstudentbirthday("1975-12-12");
		s1.setstudentaddress("������������");
		//���ö���s3���������
		s3.setschoolname("�廪��ѧ");
		s3.setclassname("�����һ��");
		s3.setlocation("�ɶ���");
		s3.setstudentname("������");
		s3.setstudentcode("00123");
		s3.setstudentsexy("Ů");
		s3.setstudentbirthday("1975-4-21");
		s3.setstudentaddress("����ʡ�����к�ƽ��");
		//���������������
		System.out.println(s1.toString());
		System.out.println(s3.toString());
	}

}
