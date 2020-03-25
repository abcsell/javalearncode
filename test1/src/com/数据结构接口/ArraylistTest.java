package com.数据结构接口;
import java.util.*;
public class ArraylistTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> a1 = new ArrayList<String>();//创建对象a1
		a1.add("anson");//添加元素到a1
		a1.add("John");
		a1.add("Armi");
		for(int i=0;i<a1.size();i++) {//通过循环输出元素
			System.out.println(a1.get(i));//输出元素
		}
	}

}
