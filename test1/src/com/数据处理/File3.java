package com.数据处理;

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
		//输出方法的运行结果
		System.out.println(isNumberic("123"));
		System.out.println(isNumberic("-123.34"));
		System.out.println(isNumberic("ox12"));
		System.out.println(isNumberic("453"));
		System.out.println(isNumberic("1abcd"));
		System.out.println(isNumberic("-1a33"));

	}

}
