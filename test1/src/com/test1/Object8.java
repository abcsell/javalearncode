package com.test1;

public class Object8 {

	@SuppressWarnings("unused")
	private int sum;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Object8 num = new Object8();
		num.print();
		System.out.print("总分："+num.sum(80,90,100));
		System.out.print("平均分:"+num.aver(80,90,100));
	}
	public int sum(int x,int y , int z)
	{
	return sum=x+y+z;
	}
	public int aver(int x,int y,int z)
	{
		@SuppressWarnings("unused")
		int aver;
		return aver=(x+y+z)/3;
	}
	void print()
	{
		System.out.print("这个同学的成绩为：");
	}
}
