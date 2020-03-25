package com.chouxiang2;

 abstract class Student2 extends School {
	 //创建成员变量
	 String studentname;
	 String studentcode;
	 String studentsexy;
	 String studentbirthday;
	 String studentaddress;
	 //设计了两个抽象方法
	 abstract void setlocation(String location);
	 abstract String getlocation();
	 //设置各个属性的设置器和访问器
	 void setstudentname(String studentname) {
		 this.studentname=studentname;
	 }
	 void setstudentcode(String studentcode) {
		 this.studentcode=studentcode;
	 }
	 void setstudentsexy(String studentsexy) {
		 this.studentsexy=studentsexy;
	 }
	 void setstudentbirthday(String studentbirthday) {
		 this.studentbirthday=studentbirthday;
	 }
	 void setstudentaddress(String studentaddress) {
		 this.studentaddress=studentaddress;
	 }
	 //重写方法toString()
	 public String toString() {
		 String infor = super.toString() + "学生姓名:"+studentname+";"+" "+"学号:"+studentcode+";"+" "+"性别:"+studentsexy+";"+" "+"出生日期:"+studentbirthday+";"+"  "+"家庭地址:"+studentaddress;
		 return infor;
	 }
}
