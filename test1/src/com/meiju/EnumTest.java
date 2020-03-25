package com.meiju;

public class EnumTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WeekDay today=WeekDay.SAT;
		System.out.println("今天是"+today);
		System.out.println("今天是"+today.name());
		System.out.println("今天是"+today.ordinal());
		System.out.println("----------------------");
		System.out.println("今天是"+WeekDay.valueOf("SAT"));
		System.out.println("----------------------");
		
		WeekDay[] days =WeekDay.values();
		System.out.println("星期中包含"+days.length+"天");
		for(WeekDay day:days) {
			System.out.println("星期里包含"+day);
		}
	}
	public enum WeekDay{
		SUM,MON,TUE,WED,THU,FN,SAT
	}
}
