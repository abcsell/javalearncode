package com.meiju;



public class EnumConAbstract {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WeekDay today = WeekDay.SUN;
		System.out.println("SUN����һ��Ϊ"+today.nextDay());
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
