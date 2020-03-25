package com.反射.成员字段;

public class Point {
	//创建四个字段
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
		return "s1的值为"+s1+";"+"s2的值为"+s2;
	}
}	
