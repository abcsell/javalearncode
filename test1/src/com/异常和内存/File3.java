package com.�쳣���ڴ�;

public class File3 {
	public static double quotient(int numerator,int denominator) throws DivideByZeroException
	{
		if(denominator==0) //������denominatorΪ0ʱ
			throw new DivideByZeroException();//�����쳣����DivideByZeroException
		else
			return (double)numerator;//���ر���numerator
	}

	public static void main(String[] args) {//������
		// TODO �Զ����ɵķ������
		try //�����쳣
		{
		@SuppressWarnings("unused")
		double result=quotient(3,0);//���÷���quotient()
		}
		catch(DivideByZeroException exception)
		{
			System.out.println(exception.toString());
		}
	}

	@SuppressWarnings("serial")
	public static class DivideByZeroException extends ArithmeticException
	{
		public  DivideByZeroException()//���캯��
		{
			super("���ܱ�0��");//���ø���Ĺ��캯��
		}
	}

}
