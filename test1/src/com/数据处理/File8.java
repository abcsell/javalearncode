package com.数据处理;

import java.util.Arrays;

public class File8 {

	public static void main(String[] args) {//主方法
		// 创建各种学生对象
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
		
	
	//创建学生数组对象
	
	Student[] a = new Student[] {st1, st2,st3,st4,st5,st6,st7,st8,st9,st10 };
	try {
		Arrays.sort(a);//实现排序功能
		//通过循环进行数组内容的输出
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}catch(Exception e) {
		System.out.println("出错了");
	}
}
}
