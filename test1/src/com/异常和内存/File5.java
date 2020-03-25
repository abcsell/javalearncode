package com.异常和内存;

public class File5 {

	public static void main(String[] args) throws Exception{//抛出异常
		// TODO 自动生成的方法存根
		int[] a = new int[5];//创建数组对象
		try {
			a[10]=1;
		}
		catch(ArrayIndexOutOfBoundsException ae)//抛出异常对象
		{
			System.out.println(ae);
		}
		catch(ArrayStoreException ae) {
			System.out.println(ae);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally//执行的语句
		{
			System.out.println("发现了异常，并且处理了它@！");
		}
	}

}
