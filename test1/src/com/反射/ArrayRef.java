package com.����;

import java.lang.reflect.Array;
import java.util.Arrays;

//���鷴��
public class ArrayRef {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�����������͵�����
		int[] a1=new int[]{1,2,3};
		int[] a2 = new int[4];
		int[][] a3 = new int[2][3];
		String[] a4 = new String[] {"1","2","3"};
		System.out.println("-----------------");
		//�ж�����a1������a2���ֽ����Ƿ���ͬ
		System.out.println("a1��a2������ֽ����Ƿ���ͬ" +(a1.getClass()==a2.getClass()));	//���ϼӺź�����ж����û�м����ţ����±���
		//����Array���һЩ����
		System.out.println("-----------------");
		System.out.println("a3���������"+a3.getClass().getName());
		System.out.println("a1���鳬�������"+a1.getClass().getSuperclass().getName());
		//����������Object[]�Ķ�Ӧ��ϵ
		Object obj1 = a1;			//�⼸�д����ƺ�ûʲô��
		Object obj3 = a4;
		Object[] obj4 = a4;
		Object obj5 = a3;
		Object[] obj6 = a3;
		System.out.println("------------------------------");
		System.out.println("�޹�����Arrays�����"+a1);
		System.out.println("�޹�����Arrays�����"+a4);
		//���ù�����arrays��aslist()����
		System.out.println("�й�����Arrays�����"+Arrays.asList(a1));
		System.out.println("�й�����Arrays�����"+Arrays.asList(a4));
		System.out.println("------------------------------");
		//����printObject()����
		printObject(a1);
		printObject(1);
	} 
	//��ӡ�����г�Ա����
	private static void printObject(Object obj) {
		@SuppressWarnings("rawtypes")
		Class cla = obj.getClass();//��ȡ�ֽ���.
		if(cla.isArray()) {	//�ж��Ƿ�Ϊ����
			System.out.println("�����Զ��巽������������");
			int len = Array.getLength(obj);//��ȡ����ĳ���
			for(int i=0;i<len;i++) {				//��������еĸ�����Ա
				System.out.println(Array.get(obj, i));
			}
			System.out.println("------------------------");
		}else {
			System.out.println("�����Զ��巽������ͨ��������");
			System.out.println(obj);
			System.out.println("------------------------------");
		}
	}

}
