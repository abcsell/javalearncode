package com.���ݴ���;

public class File2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	//�������ֻ������ͱ���
		int a=20;
		byte b = 'a';
		short c=11;
		long d = 112;
		float e=11.2f;
		double f =11.3;
		//�������ְ�װ�����
		Integer x1=new Integer(a);
		Byte x2 = new Byte(b);
		Short x3 = new Short(c);
		Long x4 = new Long(d);
		Float x5 = new Float(e);
		Double x6 = new Double(f);
		//���ð�װ��ķ���ʵ�����
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		//�������x1�Ķ�������
		System.out.println(x1.toBinaryString(a));
		//�������x1��ʮ��������
		System.out.println(x1.toHexString(a));
	}

}
