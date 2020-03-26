package com.数据结构映像;

import java.util.TreeMap;



public class Test7 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// 创建一个树映像对象tm
		TreeMap tm = new TreeMap();
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
		//通过设置器赋值给对象
				tm.put("zh", t1);
				tm.put("lp", t2);
				tm.put("wp", t3);
				tm.put("sb", t4);
				tm.put("zw", t5);
				tm.put("sj", t6);
				System.out.println("这个小组有"+tm.size()+"个教师。");
				System.out.println(tm.values());
				tm.remove("lp");
				tm.remove("sb");
				System.out.println("查查有没有小明这个老师");
				if(tm.containsKey("sj")) {
					System.out.println("这个教师是存在的，他的信息如下：");
					System.out.println((Teacher)tm.get("sj"));
				}else {
					System.out.println("这里没有这个教师");
				}
				System.out.println("由于有些教师离开了学校，经过我们的审核，教师信息如下");
				System.out.println(tm.values());
				System.out.println("这些教师今天都离开了，所有教师信息都可以删除了");
				tm.remove("zh");
				tm.remove("sj");
				tm.remove("zw");
				tm.remove("wp");
				if(tm.isEmpty()) {//当元素为空
					System.out.println("这里把教师信息都删除了");
				}else {
					System.out.println("系统报错了！！！");
				}
	}

}
