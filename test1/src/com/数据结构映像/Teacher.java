package com.数据结构映像;

public class Teacher {//创建教师对象类
//创建成员变量
	private String schoolname;
	private String classname;
	private String teachername;
	private String teachercode;//工号
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;
//	带参构造函数
	public Teacher(String teachername, String teachercode, String teachersexy, String teacherbirthday) {
		super();
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teacherbirthday = teacherbirthday;
	}
	//关于各个属性的访问器
	public String getTeachercode() {
		return teachercode;
	}
	public String getTeachersexy() {
		return teachersexy;
	}
	public String getTeacherbirthday() {
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
	//通过重写tostring方法使的对象能够以字符串形式输出
	public String toString() {
		String infor = "学校名称:"+schoolname+" "+"班级名称:"+classname+" "+"教师姓名："+teachername+" "+"教师工号:"+teachercode+" "+"性别:"+teachersexy+"  "+"出生年月:"+teacherbirthday+"  "+"家庭住址:"+familyaddress;
		return infor;//返回对象infor
	}
	
}





















