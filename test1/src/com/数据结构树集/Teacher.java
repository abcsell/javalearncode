package com.���ݽṹ����;
//���ʵ��comparable�ӿڵ�teacher��
@SuppressWarnings("rawtypes")
public class Teacher implements Comparable{
	//��Ա����
	private String schoolname;
	private String classname;
	private String teachername;
	private int teachercode;
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;
	//���������캯��
	public Teacher(String teachername, int teachercode, String teachersexy, String teacherbirthday) {
		super();
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teacherbirthday = teacherbirthday;
	}
	public int compareTo(Object o) {//ʵ�ַ���comparato
		Teacher t = (Teacher) o;//ת����Teacher����
		return (t.teachercode-teachercode);
	}
	//���ڸ������Եķ�������������
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
	//��дtostring����ʹ�ö����ܹ����ַ�������ķ���
	public String toString() {
		String infor = "ѧУ����:"+schoolname+" "+"�༶����:"+classname+" "+"��ʦ������"+teachername+" "+"��ʦ����:"+teachercode+" "+"�Ա�:"+teachersexy+"  "+"��������:"+teacherbirthday+"  "+"��ͥסַ:"+familyaddress;
		return infor;//���ض���infor
	}
	
}
