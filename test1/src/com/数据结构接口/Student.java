package com.数据结构接口;

public class Student  {
	// 创建成员变量
	public String name;
	public int age;
	public String sexy;
	public String code;
	public String school;
	public String grade;
	public String major;
	public String address;
	Student x;// 学生对象x
	Student y;

	Student(String name) {
		this.name = name;// 带参构造函数
	}
	//关于各种参数的设置器
	public void set(int age, String sexy, String code, String school, String grade, String major, String address) {
		
		this.age = age;
		this.sexy = sexy;
		this.code = code;
		this.school = school;
		this.grade = grade;
		this.major = major;
		this.address = address;
	}
	//关于各种参数的访问器
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
	public String toString() {//重写tostring方法
		String information="学生姓名:"+name+" "+"学号:"+code+" "+"性别:"+sexy+" "+ "年龄:"+age+" "+"所在学校:"+school+" "+"所学专业:"+major+"所在年级:"+grade+"家庭地址:"+address;
		return information;
	}
//	//通过实现comparato这个方法，来实现排序
//	public int compareTo(Object o) {
//		Student st = (Student) o;//创建对象st
//		return(age -st.age);
//	}
	
}



















