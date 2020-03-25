package com.chouxiang2;

 class Student3 extends Student2 {
	 //设置了属性的getter和setter方法
	 void setlocation(String location) {
		 this.location=location;
	 }
	 String getlocation() {
		 return location;
	 }
	 //重写tostring方法
	 public String toString()
	 {
		 String infor = super.toString()+"学校地址:"+location +";"+"  ";
		 return infor;
	 }
	
}
