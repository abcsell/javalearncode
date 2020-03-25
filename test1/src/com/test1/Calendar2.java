package com.test1;

import java.util.*;

public class Calendar2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GregorianCalendar gc = new GregorianCalendar();
		final char[] kor_week = {'日','一','二','三','四','五','六'};
		for(int i=2007;i<=2020;i++)
		{
			gc.set(i,Calendar.JULY,20);
			char week =kor_week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"年的生日是星期"+week);
		}
	}

}
