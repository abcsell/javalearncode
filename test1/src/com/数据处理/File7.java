package com.���ݴ���;

import java.util.Arrays;

public class File7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] a = new int[] {2,34,21,11,23,56,65,33,89,90};//�������
		Arrays.sort(a);//ʵ��������
		for(int i=0;i<a.length;i++) {//ͨ��ѭ�����б���
			System.out.print(a[i]+" ");
		}
		System.out.println("\n56��λ��Ϊ:"+Arrays.binarySearch(a, 56));
		System.out.println("33��λ��Ϊ:"+Arrays.binarySearch(a, 33));
	}

}
