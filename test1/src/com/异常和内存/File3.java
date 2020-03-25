package com.异常和内存;

public class File3 {
	public static double quotient(int numerator,int denominator) throws DivideByZeroException
	{
		if(denominator==0) //当参数denominator为0时
			throw new DivideByZeroException();//创建异常对象DivideByZeroException
		else
			return (double)numerator;//返回变量numerator
	}

	public static void main(String[] args) {//主方法
		// TODO 自动生成的方法存根
		try //捕获异常
		{
		@SuppressWarnings("unused")
		double result=quotient(3,0);//调用方法quotient()
		}
		catch(DivideByZeroException exception)
		{
			System.out.println(exception.toString());
		}
	}

	@SuppressWarnings("serial")
	public static class DivideByZeroException extends ArithmeticException
	{
		public  DivideByZeroException()//构造函数
		{
			super("不能被0除");//调用父类的构造函数
		}
	}

}
