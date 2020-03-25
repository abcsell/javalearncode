package com.数据处理;

public class NumberTest {

	public static void main(String[] args) {
		Integer data21 = Integer.valueOf(127);
		Integer data22 =  Integer.valueOf(127);
		//以前实现int类型转换成对象方式
		Integer data211 =  Integer.valueOf(128);
		Integer data221 =  Integer.valueOf(128);
		//通过自动装箱方式实现int类型转换成对象方式
		Integer data31 = -128;
		Integer data32 = -128;
		Integer data311 = -129;
		Integer data321 = -129;
	
		//查看对象是否引用同一个对象
		System.out.println("data21与data22是否为同一个对象？"+(data21 == data22));
		System.out.println("data211与data221是否为同一个对象？"+(data211 == data221));
		System.out.println("data31与data32是否为同一个对象？"+(data31 == data32));
		System.out.println("data311与data321是否为同一个对象？"+(data311 == data321));
// 通过上述代码的运行结果可以发现，当通过自动装箱方式返回同一数值的对象时，
		//如果该数值在-128~127之间（包含它们自己），返回的对象会引用同一对象；否则则相反。
	}

}
