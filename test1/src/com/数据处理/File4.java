package com.���ݴ���;

import java.util.Random;

public class File4 {

	public static void main(String[] args) {
		// ����һ���������
		Random rnd = new Random();
		//ͨ�������Ķ���ķ�������ĸ����ݸ�ֵ
		int a = rnd.nextInt(10);
		int b = rnd.nextInt(10) +5 ; 
		int c = 3* rnd.nextInt(10);
		//���3��ֵ
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
