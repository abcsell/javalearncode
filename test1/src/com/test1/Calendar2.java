package com.test1;

import java.util.*;

public class Calendar2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GregorianCalendar gc = new GregorianCalendar();
		final char[] kor_week = {'��','һ','��','��','��','��','��'};
		for(int i=2007;i<=2020;i++)
		{
			gc.set(i,Calendar.JULY,20);
			char week =kor_week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"�������������"+week);
		}
	}

}
