package com.数据结构;
import java.util.*;
public class Test3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// 创建一个散列集对象
		HashSet hs = new HashSet();
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
		hs.add(t1);//往散列集中添加元素
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		System.out.println("这个小组有"+hs.size()+"个教师。");
		//输出散列集中的元素个数
		Iterator it =hs.iterator();//新建一个迭代器对象
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		hs.remove(t3);
		hs.remove(t4);
		System.out.println("由于有些教师离开了学校，经过我们的审核后，教师信息如下：");
		Iterator it1 = hs.iterator();//新建一个迭代器对象
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("有些奇偶暗示离职了，所有的教师信息都删除");
		hs.remove(t1);
		hs.remove(t2);
		hs.remove(t5);
		hs.remove(t6);
		if(hs.isEmpty()) {//当元素为空
			System.out.println("这里把教师信息都删除了");
		}else {
			System.out.println("系统报错了！！！");
		}
	}

}
