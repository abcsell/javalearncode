package com.���ݽṹ;

import java.util.HashSet;
import java.util.LinkedList;
/**
 * �ӽ�����Կ�����ʹ��ɢ�м��������ݴ�����ʹ������������ݴ����ѵ�ʱ�����
 * @author kls
 *
 */
public class Test4 {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		long time =0;
		HashSet hs = new HashSet();//����hashset����
		LinkedList ll=new LinkedList();//��������
		long starttime = System.currentTimeMillis();//��ȡ��ǰʱ��
		for(int i=0;i<10000;i++) {
			hs.add(new Integer(i));//�������������hs
		}
		System.out.println(System.currentTimeMillis()-starttime);
		for(int i=0;i<10000;i++) {
			ll.add(new Integer(i));
		}
		System.out.println(System.currentTimeMillis()-starttime);
	}

}
