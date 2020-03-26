package com.数据结构树集;
//又是一个错误的案例，真气人
import java.util.Iterator;
import java.util.TreeSet;

import com.数据结构.Teacher;

public class Test6 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet ts = new TreeSet();//创建一个树集对象ts
		//创建6个教师对象
		Teacher t1 = new Teacher("李自成","234235","男","1856-09-15");
		Teacher t2 = new Teacher("刘邦","1234000","男","1956-09-16");
		Teacher t3 = new Teacher("项羽","1234001","男","1856-10-17");
		Teacher t4 = new Teacher("孙武","1234002","男","2056-02-18");
		Teacher t5 = new Teacher("酒剑仙","1234003","男","1865-09-19");
		Teacher t6 = new Teacher("小明","1234004","男","1997-09-20");
		//设置教师对象信息
		t1.setSchoolname("清华大学");
		t1.setClassname("计算机三班");
		t1.setFamilyaddress("北京市西土城");
		t2.setSchoolname("清华大学");
		t2.setClassname("计算机三班");
		t2.setFamilyaddress("北京市西土城");
		t3.setSchoolname("清华大学");
		t3.setClassname("计算机三班");
		t3.setFamilyaddress("北京市西土城");
		t4.setSchoolname("清华大学");
		t4.setClassname("计算机三班");
		t4.setFamilyaddress("北京市西土城");
		t5.setSchoolname("清华大学");
		t5.setClassname("计算机三班");
		t5.setFamilyaddress("北京市西土城");
		t6.setSchoolname("清华大学");
		t6.setClassname("计算机三班");
		t6.setFamilyaddress("北京市西土城");
		//通过设置器赋值给每个对象
		ts.add(t1);//往树集汇总添加元素
		ts.add(t2);//往树集汇总添加元素
		ts.add(t3);//往树集汇总添加元素
		ts.add(t4);//往树集汇总添加元素
		ts.add(t5);//往树集汇总添加元素
		ts.add(t6);//往树集汇总添加元素
		System.out.println("这个小组有"+ts.size()+"个教师。");
		//输出树集中的元素个数
		Iterator it = ts.iterator();//新建一个迭代器对象
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ts.remove(t3);
		ts.remove(t4);//删除元素
		System.out.println("有些教师离开学校，教师信息如下：");
		Iterator it1 = ts.iterator();//新建迭代器对象
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("今天这些教师都离职了，教师信息全部删除！");
		ts.remove(t1);
		ts.remove(t2);
		ts.remove(t5);
		ts.remove(t6);
		if(ts.isEmpty()) {//当元素为空
			System.out.println("这里把教师信息都删除了");
		}else {
			System.out.println("系统报错了！！！");
		}
	}

}
