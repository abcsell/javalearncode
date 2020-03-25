package com.封装实例;
//创建一个关于学生回答问题类，并且让其成为一个线程类
public class Studentanswer extends Thread{
//关于学生回答问题类属性
	private String name;
	private String age;
	private String school;
	private String grade;//学生年级
	private String year;
	private String month;
	private String days;//学生日
	private int x;
	//关于属性的设置器方法
	public void set(String name, String age, String school, String grade, String year, String month, String days) {
		this.name=name;
		this.age=age;
		this.school=school;
		this.grade=grade;
		this.year=year;
		this.month= month;
		this.days= days;
		
	}
	//关于属性的访问器方法
	public void setint(int x) {
		this.x= x;
	}
	public String getname() {
		return name;
	}
	public String getage() {
		return age;
	}
	public String getschool() {
		return school;
	}
	public String getgrade() {
		return grade;
	}
	public String getyear() {
		return year;
	}
	public String getmonth() {
		return month;
	}
	public String getdays() {
		return days;
	}
	public int getint() {
		return x;
	}
	private void said() {  //关于学生回答内容的方法
		switch (x) {	//通过一个分支语句来控制回答
		case 0: 
			System.out.println(name+"说：我的名字叫"+name+"。");
			break;
		case 1: 
			System.out.println(name+"说：我在"+school+"读书");
			break;
		case 2: 
			System.out.println(name+"说：我现在读"+grade+"。");
			break;
		case 3: 
			System.out.println(name+"说：今年"+age+"岁。");
			break;
		case 4: 
			System.out.println(name+"说：我学习计算机软件开发"+year+"年。");
			break;
		case 5: 
			System.out.println(name+"说：我今年"+month+"月放假。");
			break;
		case 6: 
			System.out.println(name+"说：我一般放假的天数是"+days+"天。");
			break;
		case 7: 
			System.out.println(name+"说：不客气。");
			break;
		}
	}
	public void run() {			//重写方法run
		said();
		try {
			sleep(2000);		//线程休眠2秒
		}catch(Exception e) {
			
		}
	}
}
