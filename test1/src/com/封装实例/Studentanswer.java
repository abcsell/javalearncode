package com.��װʵ��;
//����һ������ѧ���ش������࣬���������Ϊһ���߳���
public class Studentanswer extends Thread{
//����ѧ���ش�����������
	private String name;
	private String age;
	private String school;
	private String grade;//ѧ���꼶
	private String year;
	private String month;
	private String days;//ѧ����
	private int x;
	//�������Ե�����������
	public void set(String name, String age, String school, String grade, String year, String month, String days) {
		this.name=name;
		this.age=age;
		this.school=school;
		this.grade=grade;
		this.year=year;
		this.month= month;
		this.days= days;
		
	}
	//�������Եķ���������
	public void setint(int x) {
		this.x= x;
	}
	public String getname() {
		return name;
	}
	public String getage() {
		return age;
	}
	public String getschool() {
		return school;
	}
	public String getgrade() {
		return grade;
	}
	public String getyear() {
		return year;
	}
	public String getmonth() {
		return month;
	}
	public String getdays() {
		return days;
	}
	public int getint() {
		return x;
	}
	private void said() {  //����ѧ���ش����ݵķ���
		switch (x) {	//ͨ��һ����֧��������ƻش�
		case 0: 
			System.out.println(name+"˵���ҵ����ֽ�"+name+"��");
			break;
		case 1: 
			System.out.println(name+"˵������"+school+"����");
			break;
		case 2: 
			System.out.println(name+"˵�������ڶ�"+grade+"��");
			break;
		case 3: 
			System.out.println(name+"˵������"+age+"�ꡣ");
			break;
		case 4: 
			System.out.println(name+"˵����ѧϰ������������"+year+"�ꡣ");
			break;
		case 5: 
			System.out.println(name+"˵���ҽ���"+month+"�·ż١�");
			break;
		case 6: 
			System.out.println(name+"˵����һ��żٵ�������"+days+"�졣");
			break;
		case 7: 
			System.out.println(name+"˵����������");
			break;
		}
	}
	public void run() {			//��д����run
		said();
		try {
			sleep(2000);		//�߳�����2��
		}catch(Exception e) {
			
		}
	}
}
