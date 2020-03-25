package com.chouxiang2;
//创建一个学生类student1来继承抽象类school
 class Student1 extends School{
	 	//创建成员变量
	 String studentname;
	 String studentcode;
	 String studentsexy;
	 String studentbirthday;
	 String studentaddress;
	 //设置各个属性的设置器和访问器
	 void setlocation(String location) {
		 this.location=location;
	 }
	 String getlocation() {
		 return location;
	 }
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
	 String getstudentname() {
		 return studentname;
	 }
	 String getstudentcode() {
		 return studentcode;
	 }
	 String getstudentsexy() {
		 return studentsexy;
	 }
	 String getstudentbirthday() {
		 return studentbirthday;
	 }
	 String getstudentaddress() {
		 return studentaddress;
	 }
	 //重写toString()方法
	 public String toString() {
		 String infor =super.toString()+"学校地址： "+location +"  "+"学生姓名："+studentname+";"+"  "+"学号:"+studentcode+";"+"  "+"性别:"+studentsexy+";"+"  "+"出生日期:"+studentbirthday+";"+"  "+"家庭住址:"+studentaddress;
		 return infor;
	 }
}
