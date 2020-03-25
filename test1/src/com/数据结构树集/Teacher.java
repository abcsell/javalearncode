package com.数据结构树集;
//设计实现comparable接口的teacher类
@SuppressWarnings("rawtypes")
public class Teacher implements Comparable{
	//成员变量
	private String schoolname;
	private String classname;
	private String teachername;
	private int teachercode;
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;
	//带参数构造函数
	public Teacher(String teachername, int teachercode, String teachersexy, String teacherbirthday) {
		super();
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teacherbirthday = teacherbirthday;
	}
	public int compareTo(Object o) {//实现方法comparato
		Teacher t = (Teacher) o;//转换成Teacher对象
		return (t.teachercode-teachercode);
	}
	//关于各个属性的访问器和设置器
	public String getname() {
		return teachername;
	}
	public int getcode() {
		return teachercode;
	}
	public String getsexy() {
		return teachersexy;
	}
	public String getbirthday() {
		return teacherbirthday;
	}
	
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public void setFamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public String getClassname() {
		return classname;
	}
	public String getFamilyaddress() {
		return familyaddress;
	}
	//重写tostring方法使得对象能够以字符串输出的方法
	public String toString() {
		String infor = "学校名称:"+schoolname+" "+"班级名称:"+classname+" "+"教师姓名："+teachername+" "+"教师工号:"+teachercode+" "+"性别:"+teachersexy+"  "+"出生年月:"+teacherbirthday+"  "+"家庭住址:"+familyaddress;
		return infor;//返回对象infor
	}
	
}
