package com.��װʵ��;

public class Teacherask extends Thread {
//����һ����ʦ���ʵ��߳���
	//�������ڽ�ʦ���ʵ�����
	private String name;
	private int x;
	//����name�����������ͷ�����
	public void set(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	//����x�����������ͷ�����
	public void setint(int x) {
		this.x=x;
	}
	public int getint() {
		return x;
	}
	private void said() {  //���ڽ�ʦ���ʵķ���
		switch(x) {     		//ͨ����֧������ṩ���ʵĲ���
		case 0:
			System.out.println(name+"˵�����ʲô���֣�");
			break;
		case 1:
			System.out.println(name+"˵����������ѧУ���飿");
			break;
		case 2:
			System.out.println(name+"˵�����ʲôϵ��һ���꼶��");
			break;
		case 3:
			System.out.println(name+"˵����������ˣ�");
			break;
		case 4:
			System.out.println(name+"˵����ѧ�����������������ˣ�");
			break;
		case 5:
			System.out.println(name+"˵���㼸�·ż٣�");
			break;
		case 6:
			System.out.println(name+"˵���żٴ���ж����죿");
			break;
		case 7:
			System.out.println(name+"˵��лл��ش��ҵ�����");
			break;
		
		}
	}
	public void run() //��дrun()����
	{
		said ();
	try {
		sleep(2000);			//�߳���������
	}catch(Exception e) {
		
	}
	}
}
