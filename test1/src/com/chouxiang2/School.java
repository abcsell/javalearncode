package com.chouxiang2;
//����һ�������ڲ���
abstract class School {
	//������Ա����
	String schoolname;
	String classname;
	String location;
	//ͨ��������������ѧУ���ƣ��༶����
	public void setschoolname(String schoolname)
	{
		this.schoolname=schoolname;
	}
	public void setclassname(String classname)
	{
		this.classname=classname;
	}
	//ͨ��������������ѧУ���ơ��༶����
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	//���ó��󷽷�
	abstract void setlocation(String location);
	abstract String getlocation();
	//��дtoString��������
	public String toString()
	{
		String infor= "ѧУ����:"+schoolname+";"+"  "+"�༶����"+classname;
		return infor;
	}
}
