package com.neibulei;
//���һ��ѧ����
public class Students {
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
	public void setstudentcoure(String[] courses) { //����ѧ���γ̷���
		new course(courses);							//�����ڲ������
	}
	//�ڲ���Ĵ��������ڲ�����Ϊ�ⲿ���һ����Ա
	private class course{
		private String[] courses;
		private int coursenum;
		//�ڲ���Ĺ�����
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
		void getinfo() {
			System.out.println("ѧ��������"+Students.this.name+"ѧ��ѧ��:"+Students.this.code+"һ��ѡ���ˣ�"+coursenum+"�ſƣ��ֱ��ǣ�");
			get();       //���÷���get()
		}
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
