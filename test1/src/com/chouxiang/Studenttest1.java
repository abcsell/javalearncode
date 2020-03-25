package com.chouxiang;

public class Studenttest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("unused")
		Student st=new Student("张杰","200111","20","男");

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
		System.out.println("这个学生的学生姓名:"+name+" "+"学号："+code+" "+"年龄:"+age+" "+"性别:"+sexy);
	}
}