package com.���ݽṹӳ��;

public class Teacher {//������ʦ������
//������Ա����
	private String schoolname;
	private String classname;
	private String teachername;
	private String teachercode;//����
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;
//	���ι��캯��
	public Teacher(String teachername, String teachercode, String teachersexy, String teacherbirthday) {
		super();
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teacherbirthday = teacherbirthday;
	}
	//���ڸ������Եķ�����
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
	//ͨ����дtostring����ʹ�Ķ����ܹ����ַ�����ʽ���
	public String toString() {
		String infor = "ѧУ����:"+schoolname+" "+"�༶����:"+classname+" "+"��ʦ������"+teachername+" "+"��ʦ����:"+teachercode+" "+"�Ա�:"+teachersexy+"  "+"��������:"+teacherbirthday+"  "+"��ͥסַ:"+familyaddress;
		return infor;//���ض���infor
	}
	
}





















