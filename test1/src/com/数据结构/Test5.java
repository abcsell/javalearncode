package com.���ݽṹ;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * ʹ��ɢ�м��������ݴ���ϵͳ���ѵ�ʱ��̣���ʹ�������б�������ݴ����ٶȸ���
 * @author kls
 *
 */

public class Test5 {
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		long time =0;
		HashSet hs = new HashSet();//����hashset����
		ArrayList al=new ArrayList();//��������ArrayList
		long starttime = System.currentTimeMillis();//��ȡ��ǰʱ��
		for(int i=0;i<10000;i++) {
			hs.add(new Integer(i));//�������������hs
		}
		System.out.println(System.currentTimeMillis()-starttime);
		for(int i=0;i<10000;i++) {
			al.add(new Integer(i));
		}
		System.out.println(System.currentTimeMillis()-starttime);
	}
}
