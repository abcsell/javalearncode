package com.jiekou3;

public class Student implements School {
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
