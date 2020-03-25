package com.jiekou3;

//import com.jiekou3.Student;
//import com.jiekou3.Teacher;

public class Schooltest {
	public static void main(String[] args) {
		//创建两个学生对象st1和st2
		Student st1=new Student();
		Student st2=new Student();
		//创建两个教师对象te1和te2
		Teacher te1=new Teacher();
		Teacher te2=new Teacher();
		//关于对象st1的相关操作
		st1.setschoolname("重庆大学");
		st1.setclassname("计算机二班");
		st1.setname("王浩");
		st1.setcode("09141234");
		st1.setsexy("男");
		st1.setbirthday("1975-12-12");
		st1.setfamilyaddress("北京市西城区");
		//关于对象st2的相关操作
		st2.setschoolname("重庆大学");
		st2.setclassname("计算机三班");
		st2.setname("韩梅梅");
		st2.setcode("0912344");
		st2.setsexy("女");
		st2.setbirthday("1975-11-09");
		st2.setfamilyaddress("上海市老城墙");
		//关于对象te1的相关操作
		te1.setschoolname("清华大学大学");
		te1.setclassname("计算机二班");
		te1.setname("孙敏");
		te1.setcode("00123");
		te1.setsexy("女");
		te1.setbirthday("1923-12-12");
		te1.setfamilyaddress("武汉市武清区");
		//关于对象te2的相关操作
		te2.setschoolname("浙江大学");
		te2.setclassname("计算机二班");
		te2.setname("赵为民");
		te2.setcode("11233");
		te2.setsexy("男");
		te2.setbirthday("1956-12-01");
		te2.setfamilyaddress("四川省成都");
		//以字符串的形式输出这些对象的字符串
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(te1.toString());
		System.out.println(te2.toString());
	}
}
