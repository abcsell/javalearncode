package com.meiju;



public class EnumConAbstract {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WeekDay today = WeekDay.SUN;
		System.out.println("SUN的下一天为"+today.nextDay());
	}
	public enum  WeekDay{
		SUN{
			public WeekDay nextDay() {
				return MON;
			}
		},
		MON{
			public WeekDay nextDay() {
				return TUE;
			}
		},
		TUE{
			public WeekDay nextDay() {
				return WED;
			}
		},
		WED{
			public WeekDay nextDay() {
				return THU;
			}
		},
		THU{
			public WeekDay nextDay() {
				return FRI;
			}
		},
		FRI{
			public WeekDay nextDay() {
				return SAT;
			}
		},
		SAT{
			public WeekDay nextDay() {
				return SUN;
			}
		};
		public abstract WeekDay nextDay();
	}

}
