package com.���ݽṹ�ӿ�;

public class Student  {
	// ������Ա����
	public String name;
	public int age;
	public String sexy;
	public String code;
	public String school;
	public String grade;
	public String major;
	public String address;
	Student x;// ѧ������x
	Student y;

	Student(String name) {
		this.name = name;// ���ι��캯��
	}
	//���ڸ��ֲ�����������
	public void set(int age, String sexy, String code, String school, String grade, String major, String address) {
		
		this.age = age;
		this.sexy = sexy;
		this.code = code;
		this.school = school;
		this.grade = grade;
		this.major = major;
		this.address = address;
	}
	//���ڸ��ֲ����ķ�����
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSexy() {
		return sexy;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getSchool() {
		return school;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getAddress() {
		return address;
	}
	public String toString() {//��дtostring����
		String information="ѧ������:"+name+" "+"ѧ��:"+code+" "+"�Ա�:"+sexy+" "+ "����:"+age+" "+"����ѧУ:"+school+" "+"��ѧרҵ:"+major+"�����꼶:"+grade+"��ͥ��ַ:"+address;
		return information;
	}
//	//ͨ��ʵ��comparato�����������ʵ������
//	public int compareTo(Object o) {
//		Student st = (Student) o;//��������st
//		return(age -st.age);
//	}
	
}



















