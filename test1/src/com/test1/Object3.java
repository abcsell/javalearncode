package com.test1;

public class Object3 
{
	public void print()    //关于输出方法
	{
		for (int i=0;i<=5;i++)
			
		{
			for(int j=5-i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)  //主方法
	{
		Object3 pro =new Object3();    //创建对象
		pro.print();					//调用对象
	}
}
