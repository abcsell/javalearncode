package com.���ݴ���;

public class NumberTest {

	public static void main(String[] args) {
		Integer data21 = Integer.valueOf(127);
		Integer data22 =  Integer.valueOf(127);
		//��ǰʵ��int����ת���ɶ���ʽ
		Integer data211 =  Integer.valueOf(128);
		Integer data221 =  Integer.valueOf(128);
		//ͨ���Զ�װ�䷽ʽʵ��int����ת���ɶ���ʽ
		Integer data31 = -128;
		Integer data32 = -128;
		Integer data311 = -129;
		Integer data321 = -129;
	
		//�鿴�����Ƿ�����ͬһ������
		System.out.println("data21��data22�Ƿ�Ϊͬһ������"+(data21 == data22));
		System.out.println("data211��data221�Ƿ�Ϊͬһ������"+(data211 == data221));
		System.out.println("data31��data32�Ƿ�Ϊͬһ������"+(data31 == data32));
		System.out.println("data311��data321�Ƿ�Ϊͬһ������"+(data311 == data321));
// ͨ��������������н�����Է��֣���ͨ���Զ�װ�䷽ʽ����ͬһ��ֵ�Ķ���ʱ��
		//�������ֵ��-128~127֮�䣨���������Լ��������صĶ��������ͬһ���󣻷������෴��
	}

}
