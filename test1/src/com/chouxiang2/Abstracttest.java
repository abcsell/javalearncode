package com.chouxiang2;
//主类，关于抽象类的测试类
public class Abstracttest {

	public static void main(String[] args) {	//主方法
		// TODO 自动生成的方法存根
		//创建对象s1和s3
		Student1 s1=new Student1();
		Student3 s3=new Student3();
		//设置对象s1的相关属性
		s1.setschoolname("重庆大学");
		s1.setclassname("计算机二班");
		s1.setlocation("沙坪坝");
		s1.setstudentname("王浩");
		s1.setstudentcode("0211234");
		s1.setstudentsexy("男");
		s1.setstudentbirthday("1975-12-12");
		s1.setstudentaddress("北京市西城区");
		//设置对象s3的相关属性
		s3.setschoolname("清华大学");
		s3.setclassname("计算机一班");
		s3.setlocation("成都市");
		s3.setstudentname("金巧巧");
		s3.setstudentcode("00123");
		s3.setstudentsexy("女");
		s3.setstudentbirthday("1975-4-21");
		s3.setstudentaddress("辽宁省沈阳市和平区");
		//输出对象的相关属性
		System.out.println(s1.toString());
		System.out.println(s3.toString());
	}

}
