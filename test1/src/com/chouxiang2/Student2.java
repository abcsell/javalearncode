package com.chouxiang2;

 abstract class Student2 extends School {
	 //������Ա����
	 String studentname;
	 String studentcode;
	 String studentsexy;
	 String studentbirthday;
	 String studentaddress;
	 //������������󷽷�
	 abstract void setlocation(String location);
	 abstract String getlocation();
	 //���ø������Ե��������ͷ�����
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
	 //��д����toString()
	 public String toString() {
		 String infor = super.toString() + "ѧ������:"+studentname+";"+" "+"ѧ��:"+studentcode+";"+" "+"�Ա�:"+studentsexy+";"+" "+"��������:"+studentbirthday+";"+"  "+"��ͥ��ַ:"+studentaddress;
		 return infor;
	 }
}
