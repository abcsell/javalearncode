package schoolmanager;

public class Teacher {
//创建各种属性
	private String name;
	private String code;
	private String sexy;
	private String birthday;
	private String address;
	private String age;
	private String salary;
	private String major;
	private String duty;
	public Teacher(String name, String code) {
		this.name = name;
		this.code = code;
	}
	//关于各种属性的getter方法和setter方法
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	
	
}
