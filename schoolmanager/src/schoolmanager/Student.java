package schoolmanager;

public class Student {
//创建关于学生的属性
	private String name;
	private String code;
	private String sexy;
	private String birthday;
	private String address;
	private String age;
	private String grade;
	private String major;
	//构造函数
	Student(String name,String code){
		this.name=name;
		this.code=code;
	}
	//设置属性的getter方法和setter方法
	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getSexy() {
		return sexy;
	}
	public void setSexy(String sexy) {
		this.sexy = sexy;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {//重写toString方法
		String information = "学生姓名:"+name+"学号:"+code+"年龄:"+age+"出生年月:"+birthday+"家庭住址:"+address+"班级:"+grade+"专业:"+major;
		return information;
	}
	
}
