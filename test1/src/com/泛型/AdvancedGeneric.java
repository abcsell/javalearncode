package com.����;

import java.util.ArrayList;

public class AdvancedGeneric {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<String> arry1 = new ArrayList<String>();
		arry1.add("cjg");									//��������arry1
		ArrayList<Integer> arry2 = new ArrayList<Integer>();
		arry2.add(27);											//��������arry2
		System.out.println(arry1.getClass());
		System.out.println(arry2.getClass());
		System.out.println("array1������array2�����Ƿ�ָ��ͬһ���ֽ��룿"+(arry1.getClass()==arry2.getClass()));
		
	}

}
