package schoolmanager;

public class Student {
//��������ѧ��������
	private String name;
	private String code;
	private String sexy;
	private String birthday;
	private String address;
	private String age;
	private String grade;
	private String major;
	//���캯��
	Student(String name,String code){
		this.name=name;
		this.code=code;
	}
	//�������Ե�getter������setter����
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
	public String toString() {//��дtoString����
		String information = "ѧ������:"+name+"ѧ��:"+code+"����:"+age+"��������:"+birthday+"��ͥסַ:"+address+"�༶:"+grade+"רҵ:"+major;
		return information;
	}
	
}
