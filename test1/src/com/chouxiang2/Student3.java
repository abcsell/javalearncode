package com.chouxiang2;

 class Student3 extends Student2 {
	 //���������Ե�getter��setter����
	 void setlocation(String location) {
		 this.location=location;
	 }
	 String getlocation() {
		 return location;
	 }
	 //��дtostring����
	 public String toString()
	 {
		 String infor = super.toString()+"ѧУ��ַ:"+location +";"+"  ";
		 return infor;
	 }
	
}
