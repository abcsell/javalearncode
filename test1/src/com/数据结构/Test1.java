package com.数据结构;
import java.util.*;
public class Test1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 创建对象
		@SuppressWarnings("rawtypes")
		ArrayList a1 = new ArrayList();
		//创建7个教师对象
		Teacher t = new Teacher("李逍遥","23452","男","1056-09-14");
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
		t.setSchoolname("北京航空航天大学");
		t.setClassname("物理机三班");
		t.setFamilyaddress("北京市朝阳区");
		//把每个对象添加到数组列表中去
		a1.add(t1);
		a1.add(t2);
		a1.add(t3);
		a1.add(t4);
		a1.add(t5);
		a1.add(t6);
		//输出
		System.out.println("这个小组有"+a1.size()+"个教师。");
		for(int i=0;i<a1.size();i++) {
			//输出数组列表中元素，以字符串形式
			System.out.println((Teacher) a1.get(i));
		}
		System.out.println("对不起，系统出错了，有个教师信息错了，需要改正");
		a1.set(5, t);
		System.out.println("经过我们的审核后，教师信息如下:");
		for(int i=0;i<a1.size();i++) {
			System.out.println((Teacher) a1.get(i));
		}
		//删除数组列表中的元素
		a1.remove(2);
		a1.remove(4);
		System.out.println("有两个教师辞职了，所以剩下教师信息为：");
		for(int i=0;i<a1.size();i++) {
			System.out.println((Teacher) a1.get(i));
		}
	}

}
