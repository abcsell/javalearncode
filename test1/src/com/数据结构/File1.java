package com.数据结构;

import java.util.Iterator;
import java.util.LinkedList;

public class File1 {
	public void add() {
		LinkedList<String> List = new LinkedList<String>();//创建要给链表类对象list
		//添加元素到对象list中
		List.add("周迅");
		List.add("刘亦菲");
		List.add("杨幂");
		List.add("韩菱纱");
		List.add("柳梦璃");
		List.add("孙悟空");
		List.add("镇元子");
		Iterator<String> it = List.iterator();//创建一个迭代器对象it
		System.out.println("现在添加了如下的同学的姓名:");
		//通过迭代器对象it来遍历list对象中的元素
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("删除某些同学的姓名后，还剩下哪些同学呢？");
		it.remove();//移除元素
		//创建另一个迭代器对象it1来重新遍历list对象中的元素
		Iterator<String> it1 = List.iterator();
		for(int i=0;i<List.size(); i++) {
			System.out.println(it1.next());
		}
	}
	public static void main(String[] args) {
		// 主方法
		File1 f = new File1();//创建对象f
		f.add();//调用对象add
		

	}

}
