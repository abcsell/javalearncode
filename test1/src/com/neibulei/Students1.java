package com.neibulei;



//ѧϰ�ֲ��ڲ���
public class Students1 {
	//������Ա����
		private String name;
		private String code;
		private String sexy;
		private String birthday;
		private String address;
		//ͨ�������������ö������
		public void setname(String name) {
			this.name=name;
		}
		public void setcode(String code) {
			this.code=code;
		}
		public void setsexy(String sexy) {
			this.sexy=sexy;
		}
		public void setbirthday(String birthday) {
			this.birthday=birthday;
		}
		public void setaddress(String address) {
			this.address=address;
		}
		//ͨ������������ȡ�������
		public String getname() {
			return name;
		}
		public String getcode() {
			return code;
		}
		public String getsexy() {
			return sexy;
		}
		public String getbirthday() {
			return birthday;
		}
		public String getaddress() {
			return address;
		}
		//ͨ��toString�����ö������ַ�����ʽ���
		public String toString() {
			String infor = "ѧ������:"+name+" "+"ѧ�ţ�"+code+" "+"�Ա�"+sexy+" "+"��������:"+birthday+" "+"��ͥסַ:"+address;
			return infor;
		}
//		public void setstudentcoure(String[] courses) { //����ѧ���γ̷���
//			new course(courses);							//�����ڲ������
//		}
		//���γ�����Ϊ�ⲿ���е�һ�������еĳ�Ա
		public void setstudentcourse(String[] courses) {
		class course{
			//������Ա����
			private String[] courses;
			private int coursenum;
			//�������캯��
			public course(String[] course) {
				courses = course;
				coursenum = course.length;
				getinfo();  //���÷���getinfo()
			}
			//��ÿγ������еĿγ�
			private void get() {
				for (int i=0;i<coursenum; i++) {
					System.out.print(" "+ courses[i]);  //forѭ������������е�ÿ���ֶ�
				}
			}
			//���ַ�����ʽ���
			private void getinfo() {
				System.out.println("ѧ��������"+Students1.this.name+"ѧ��ѧ��:"+Students1.this.code+"һ��ѡ���ˣ�"+coursenum+"�ſƣ��ֱ��ǣ�");
				get();       //���÷���get()
			}
		}
		//������һ���ڲ���Ķ������Ű�������ڲ�����ⲿ������������
		new course(courses);
		}
		//�������з����У�ͨ��ѧ����ķ�������ѧ������ڲ���courses
		public static void main(String[] args) {
			String[] courses= {"����","��ѧ","Ӣ��","��ѧ"};
			Students st =new Students();
			st.setname("����");
			st.setcode("202012");
			st.setsexy("��");
			st.setaddress("�����к�����");
			System.out.println(st.toString());  
			st.setstudentcoure(courses);
		}
}
