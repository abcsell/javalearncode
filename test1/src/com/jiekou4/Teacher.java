package com.jiekou4;

public class Teacher implements School1, School{
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
//		@Override
//		public void setclassneme(String schoolclassname) {
//			// TODO �Զ����ɵķ������
//			
//		}
}
