package com.数据结构接口;

import java.util.Iterator;
import java.util.LinkedList;

public class File2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 创建10个学生对象
		Student st1 = new Student("王鹏");
		Student st2 = new Student("胡歌");
		Student st3 = new Student("刘亦菲");
		Student st4 = new Student("杨超越");
		Student st5 = new Student("李冰冰");
		Student st6 = new Student("金巧巧");
		Student st7 = new Student("六小龄童");
		Student st8 = new Student("菜虚捆");
		Student st9 = new Student("陈真");
		Student st10 = new Student("杨幂");
		//通过设置器富裕多个对象参数数值
		st1.set(20,"男","10000","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st2.set(21,"男","10001","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st3.set(25,"女","10002","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st4.set(27,"女","10003","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st5.set(24,"女","10004","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st6.set(30,"女","10005","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st7.set(70,"男","10006","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st8.set(10,"男","10007","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st9.set(50,"男","10008","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		st10.set(31,"女","10009","北京电影学院","大学一年级","表演专业","北京市海淀区666号");
		try {
			@SuppressWarnings("rawtypes")
			LinkedList List1 = new LinkedList();
			//添加10个学生对象到对象list1中
			List1.add(st1);
			List1.add(st2);
			List1.add(st3);
			List1.add(st4);
			List1.add(st5);
			List1.add(st6);
			List1.add(st7);
			List1.add(st8);
			List1.add(st9);
			List1.add(st10);
			//it是迭代器对象，通过它来指向链表中的元素
			@SuppressWarnings("rawtypes")
			Iterator it = List1.iterator();
			System.out.println("以下就是所有的同学的信息!");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("其中有几个同学已经转学了");
			System.out.println("那么就从数据库中删除他：");
			//移除相应信息
			List1.remove();
			List1.remove();
			List1.remove();
			List1.remove();
			List1.remove();
			@SuppressWarnings("rawtypes")
			Iterator it1 = List1.iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
		}catch(Exception e) {
			
		}finally {
			System.out.println("我是超级赛亚人");
		}
	}

}
