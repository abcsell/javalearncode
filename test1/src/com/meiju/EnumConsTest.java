package com.meiju;



public class EnumConsTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("unused") //虽然说是没有使用，但是如果去除这个对象就无法输出
		WeekDay today = WeekDay.SUN;  
	}
	public enum WeekDay{
		SUN,MON,TUE,WED,THU,FRI("星期五"),SAT();
		private WeekDay() {
			System.out.println("没有参数构造函数");
		}
		private WeekDay(String s) {
			System.out.println(s+"有参数的构造函数");
		}
	}

}
