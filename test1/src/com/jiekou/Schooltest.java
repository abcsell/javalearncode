package com.jiekou;

//�����к���
public class Schooltest {
	public static void main(String[] args) {
		//��������ѧ������st1��st2
		Student st1=new Student();
		Student st2=new Student();
		//����������ʦ����te1��te2
		Teacher te1=new Teacher();
		Teacher te2=new Teacher();
		//���ڶ���st1����ز���
		st1.setschoolname("�����ѧ");
		st1.setclassname("���������");
		st1.setname("����");
		st1.setcode("09141234");
		st1.setsexy("��");
		st1.setbirthday("1975-12-12");
		st1.setfamilyaddress("������������");
		//���ڶ���st2����ز���
		st2.setschoolname("�����ѧ");
		st2.setclassname("���������");
		st2.setname("��÷÷");
		st2.setcode("0912344");
		st2.setsexy("Ů");
		st2.setbirthday("1975-11-09");
		st2.setfamilyaddress("�Ϻ����ϳ�ǽ");
		//���ڶ���te1����ز���
		te1.setschoolname("�廪��ѧ��ѧ");
		te1.setclassname("���������");
		te1.setname("����");
		te1.setcode("00123");
		te1.setsexy("Ů");
		te1.setbirthday("1923-12-12");
		te1.setfamilyaddress("�人��������");
		//���ڶ���te2����ز���
		te2.setschoolname("�㽭��ѧ");
		te2.setclassname("���������");
		te2.setname("��Ϊ��");
		te2.setcode("11233");
		te2.setsexy("��");
		te2.setbirthday("1956-12-01");
		te2.setfamilyaddress("�Ĵ�ʡ�ɶ�");
		//���ַ�������ʽ�����Щ������ַ���
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(te1.toString());
		System.out.println(te2.toString());
	}
}
//����һ��ѧУ�ӿڣ������߳�����Ҫ��Щʲô
interface School{
	//�ӿ��а����˺ܶ෽�������Ƕ�û��ʵ�֣���û�к�����
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
	//������Ա����
	private String schoolname;
	private String classname;
	private String studentname;
	private String studentcode;
	private String studentsexy;
	private String studentbirthday;
	private String familyaddress;
	//ͨ�������������ø�������
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
	//ͨ������������ö���Ĳ���
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	public String getname() {
		return studentname;
	}
	/* ���� Javadoc��
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
	//ͨ��tostring�������ö������ַ�����ʽ���
	public String toString() {
		String infor="ѧУ���ƣ�"+schoolname+ " "+"�༶����:"+classname+ " "+"ѧ��������"+studentname+" "+"ѧ��"+studentcode+" " +"�Ա�:"+studentsexy+" "+"��������:"+studentbirthday+" "+"��ͥסַ"+familyaddress;
		return infor;
	}
	
	
}	
 //�ý�ʦ��ʵ��ѧУ����ӿ�
	
  class Teacher implements School{
	//������Ա����
	private String schoolname;
	private String classname;
	private String teachername;
	private String teachercode;
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;
	//ͨ�������������ø�������
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
	//ͨ������������ö���Ĳ���
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	public String getname() {
		return teachername;
	}
	/* ���� Javadoc��
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
	//ͨ��tostring�������ö������ַ�����ʽ���
	public String toString() {
		String infor="ѧУ���ƣ�"+schoolname+ " "+"�༶����:"+classname+ " "+"��ʦ������"+teachername+" "+"��ʦ����"+teachercode+" " +"�Ա�:"+teachersexy+" "+"��������:"+teacherbirthday+" "+"��ͥסַ"+familyaddress;
		return infor;
	}
	
}
	

	
	
	
	
	
















