package com.数据结构;

import java.util.HashSet;
import java.util.LinkedList;
/**
 * 从结果可以看出，使用散列集进行数据处理，比使用链表进行数据处理花费的时间更短
 * @author kls
 *
 */
public class Test4 {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long time =0;
		HashSet hs = new HashSet();//创建hashset对象
		LinkedList ll=new LinkedList();//创建对象
		long starttime = System.currentTimeMillis();//获取当前时间
		for(int i=0;i<10000;i++) {
			hs.add(new Integer(i));//添加整数到对象hs
		}
		System.out.println(System.currentTimeMillis()-starttime);
		for(int i=0;i<10000;i++) {
			ll.add(new Integer(i));
		}
		System.out.println(System.currentTimeMillis()-starttime);
	}

}
