package com.chouxiang2;
//创建一个抽象内部类
abstract class School {
	//创建成员变量
	String schoolname;
	String classname;
	String location;
	//通过设置器类设置学校名称，班级名称
	public void setschoolname(String schoolname)
	{
		this.schoolname=schoolname;
	}
	public void setclassname(String classname)
	{
		this.classname=classname;
	}
	//通过设置器来设置学校名称、班级名称
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	//设置抽象方法
	abstract void setlocation(String location);
	abstract String getlocation();
	//重写toString（）方法
	public String toString()
	{
		String infor= "学校名称:"+schoolname+";"+"  "+"班级名称"+classname;
		return infor;
	}
}
