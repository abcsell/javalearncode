package com.����.��Ա�ֶ�;

public class Point {
	//�����ĸ��ֶ�
	@SuppressWarnings("unused")
	private int x;
	public int y;
	public String s1="abababab";
	public String s2="aaaabbbb";
	public Point (int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}
	public Point (int x,int y,String s1, String s2) {
		super();
		this.x=x;
		this.y=y;
		this.s1=s1;
		this.s2=s2;
	}
	public String toString() {
		return "s1��ֵΪ"+s1+";"+"s2��ֵΪ"+s2;
	}
}	
