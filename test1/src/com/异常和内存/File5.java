package com.�쳣���ڴ�;

public class File5 {

	public static void main(String[] args) throws Exception{//�׳��쳣
		// TODO �Զ����ɵķ������
		int[] a = new int[5];//�����������
		try {
			a[10]=1;
		}
		catch(ArrayIndexOutOfBoundsException ae)//�׳��쳣����
		{
			System.out.println(ae);
		}
		catch(ArrayStoreException ae) {
			System.out.println(ae);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally//ִ�е����
		{
			System.out.println("�������쳣�����Ҵ�������@��");
		}
	}

}
