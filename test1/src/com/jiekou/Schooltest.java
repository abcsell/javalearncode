package com.jiekou;

//主运行函数
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
//声明一个学校接口，来告诉程序需要做些什么
interface School{
	//接口中包括了很多方法，但是都没有实现，既没有函数体
	void setschoolname(String schoolname);
	void setclassname(String schoolclassname);
	void setname(String name);
	void setcode(String code);
	void setsexy(String sexy);
	void setbirthday(String birthday);
	void setfamilyaddress(String familyaddress);
	String getschoolname();
	String getclassname();
	String getname();
	String getcode();
	String getsexy();
	String getbirthday();
	String getfamilyaddress();
}
  class Student implements School{
	//创建成员变量
	private String schoolname;
	private String classname;
	private String studentname;
	private String studentcode;
	private String studentsexy;
	private String studentbirthday;
	private String familyaddress;
	//通过设置器来设置各个参数
	public void setschoolname(String schoolname) {
		this.schoolname=schoolname;
	}
	public void setclassname(String classname) {
		this.classname=classname;
	}
	public void setname(String studentname) {
		this.studentname=studentname;
	}
	public void setcode(String studentcode) {
		this.studentcode=studentcode;
	}
	public void setsexy(String studentsexy) {
		this.studentsexy=studentsexy;
	}
	public void setbirthday(String studentbirthday) {
		this.studentbirthday=studentbirthday;
	}
	public void setfamilyaddress(String familyaddress) {
		this.familyaddress=familyaddress;
	}
	//通过访问器来获得对象的参数
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	public String getname() {
		return studentname;
	}
	/* （非 Javadoc）
	 * @see com.jiekou.school#getcode()
	 */
	public String getcode() {
		return studentcode;
	}
	public String getsexy() {
		return studentsexy;
	}
	public String getbirthday() {
		return studentbirthday;
	}
	public String getfamilyaddress() {
		return familyaddress;
	}
	//通过tostring方法来让对象以字符串形式输出
	public String toString() {
		String infor="学校名称："+schoolname+ " "+"班级名称:"+classname+ " "+"学生姓名："+studentname+" "+"学号"+studentcode+" " +"性别:"+studentsexy+" "+"出生年月:"+studentbirthday+" "+"家庭住址"+familyaddress;
		return infor;
	}
	
	
}	
 //让教师类实现学校这个接口
	
  class Teacher implements School{
	//创建成员变量
	private String schoolname;
	private String classname;
	private String teachername;
	private String teachercode;
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;
	//通过设置器来设置各个参数
	public void setschoolname(String schoolname) {
		this.schoolname=schoolname;
	}
	public void setclassname(String classname) {
		this.classname=classname;
	}
	public void setname(String teachername) {
		this.teachername=teachername;
	}
	public void setcode(String teachercode) {
		this.teachercode=teachercode;
	}
	public void setsexy(String teachersexy) {
		this.teachersexy=teachersexy;
	}
	public void setbirthday(String teacherbirthday) {
		this.teacherbirthday=teacherbirthday;
	}
	public void setfamilyaddress(String familyaddress) {
		this.familyaddress=familyaddress;
	}
	//通过访问器来获得对象的参数
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	public String getname() {
		return teachername;
	}
	/* （非 Javadoc）
	 * @see com.jiekou.school#getcode()
	 */
	public String getcode() {
		return teachercode;
	}
	public String getsexy() {
		return teachersexy;
	}
	public String getbirthday() {
		return teacherbirthday;
	}
	public String getfamilyaddress() {
		return familyaddress;
	}
	//通过tostring方法来让对象以字符串形式输出
	public String toString() {
		String infor="学校名称："+schoolname+ " "+"班级名称:"+classname+ " "+"教师姓名："+teachername+" "+"教师工号"+teachercode+" " +"性别:"+teachersexy+" "+"出生年月:"+teacherbirthday+" "+"家庭住址"+familyaddress;
		return infor;
	}
	
}
	

	
	
	
	
	
















