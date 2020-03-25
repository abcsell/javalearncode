package com.数据结构;

import java.util.Hashtable;

public class Test2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//创建对象ht
		Hashtable ht = new Hashtable();
//		创建7个教师对象
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
		//在散列表中添加元素
		ht.put("zh", t1);
		ht.put("lp", t2);
		ht.put("wp", t3);
		ht.put("sb", t4);
		ht.put("zw", t5);
		ht.put("sj", t6);
		System.out.println("这个小组有"+ht.size()+"个教师。");
		//输出散列表中的元素个数
		System.out.println(ht.values());
		System.out.println("我需要查找一个教师的信息。");
		//输出散列表中的元素个数
		if(ht.containsKey("wh")) {
			System.out.println("找到了此教师的信息，如下：");
			System.out.println((Teacher) ht.get("wh"));
		}else {
			System.out.println("没有找到次教师的信息！");
		}
		ht.remove("lp");
		ht.remove("sj");//删除散列表中的元素
		System.out.println("由于有些教师离开了学校，经过我们的审核后，教师信息如下：");
		System.out.println(ht.values());//输出散列表中剩下的元素内容
	}

}
