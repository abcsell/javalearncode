package com.meiju;

public class EnumTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WeekDay today=WeekDay.SAT;
		System.out.println("������"+today);
		System.out.println("������"+today.name());
		System.out.println("������"+today.ordinal());
		System.out.println("----------------------");
		System.out.println("������"+WeekDay.valueOf("SAT"));
		System.out.println("----------------------");
		
		WeekDay[] days =WeekDay.values();
		System.out.println("�����а���"+days.length+"��");
		for(WeekDay day:days) {
			System.out.println("���������"+day);
		}
	}
	public enum WeekDay{
		SUM,MON,TUE,WED,THU,FN,SAT
	}
}
