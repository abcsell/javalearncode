package com.���ݴ���;

public class File3 {
	@SuppressWarnings("unused")
	public static boolean isNumberic(String str) {
		try {
			Integer i = new Integer(str);
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//������������н��
		System.out.println(isNumberic("123"));
		System.out.println(isNumberic("-123.34"));
		System.out.println(isNumberic("ox12"));
		System.out.println(isNumberic("453"));
		System.out.println(isNumberic("1abcd"));
		System.out.println(isNumberic("-1a33"));

	}

}
