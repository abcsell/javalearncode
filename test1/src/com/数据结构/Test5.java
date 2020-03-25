package com.数据结构;

import java.util.ArrayList;
import java.util.HashSet;
/**
 * 使用散列集进行数据处理，系统花费的时间短，比使用数组列表进行数据处理速度更快
 * @author kls
 *
 */

public class Test5 {
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long time =0;
		HashSet hs = new HashSet();//创建hashset对象
		ArrayList al=new ArrayList();//创建对象ArrayList
		long starttime = System.currentTimeMillis();//获取当前时间
		for(int i=0;i<10000;i++) {
			hs.add(new Integer(i));//添加整数到对象hs
		}
		System.out.println(System.currentTimeMillis()-starttime);
		for(int i=0;i<10000;i++) {
			al.add(new Integer(i));
		}
		System.out.println(System.currentTimeMillis()-starttime);
	}
}
