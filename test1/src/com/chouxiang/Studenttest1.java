package com.chouxiang;

public class Studenttest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("unused")
		Student st=new Student("�Ž�","200111","20","��");

	}

}
class Student
{
	String name;
	String code;
	String age;
	String sexy;
	public Student(String name,String code,String age,String sexy)
	{
		this.name = name;
		this.code = code;
		this.age  = age;
		this.sexy = sexy;
		System.out.println("���ѧ����ѧ������:"+name+" "+"ѧ�ţ�"+code+" "+"����:"+age+" "+"�Ա�:"+sexy);
	}
}