package com.meiju;



public class EnumConsTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("unused") //��Ȼ˵��û��ʹ�ã��������ȥ�����������޷����
		WeekDay today = WeekDay.SUN;  
	}
	public enum WeekDay{
		SUN,MON,TUE,WED,THU,FRI("������"),SAT();
		private WeekDay() {
			System.out.println("û�в������캯��");
		}
		private WeekDay(String s) {
			System.out.println(s+"�в����Ĺ��캯��");
		}
	}

}
