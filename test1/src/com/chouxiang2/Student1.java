package com.chouxiang2;
//����һ��ѧ����student1���̳г�����school
 class Student1 extends School{
	 	//������Ա����
	 String studentname;
	 String studentcode;
	 String studentsexy;
	 String studentbirthday;
	 String studentaddress;
	 //���ø������Ե��������ͷ�����
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
	 //��дtoString()����
	 public String toString() {
		 String infor =super.toString()+"ѧУ��ַ�� "+location +"  "+"ѧ��������"+studentname+";"+"  "+"ѧ��:"+studentcode+";"+"  "+"�Ա�:"+studentsexy+";"+"  "+"��������:"+studentbirthday+";"+"  "+"��ͥסַ:"+studentaddress;
		 return infor;
	 }
}
