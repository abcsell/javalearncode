package com.���ݴ���;

public class AutoUnbox {

	public static void main(String[] args) {
		//��ǰʵ��int����ת���ɶ���ʽ3.464*3.87298
		Integer data11 = new Integer(10);
		Integer data12 = new Integer(10);
		//��ǰʵ��int����ת���ɶ���ʽ
		Integer data21 =  Integer.valueOf(10);
		Integer data22 =  Integer.valueOf(10);
		//ͨ���Զ�װ�䷽ʽʵ��int����ת���ɶ���ʽ
		Integer data31 = 20;
		Integer data32 = 20;
		//ͨ���Զ����䷽ʽʵ�ֶ���ת����int���ͷ�ʽ
		int sum1 = data11 +20;
		int sum2 = data31 +20;
		//�������sum1��sum2��ֵ
		System.out.println("sum1��ֵΪ"+sum1);
		System.out.println("sum2��ֵΪ"+sum2);
		//�鿴�����Ƿ�����ͬһ������
		System.out.println("data11��data12�Ƿ�Ϊͬһ������"+(data11 == data12));
		System.out.println("data21��data22�Ƿ�Ϊͬһ������"+(data21 == data22));
		System.out.println("data21��data22�Ƿ�Ϊͬһ������"+(data31 == data32));
	}

}
