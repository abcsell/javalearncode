package com.反射.成员字段;

import java.lang.reflect.Field;

public class FieldRef {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException 
	{
		// TODO 自动生成的方法存根
		Point point =new Point(3,4);						//定义一个坐标
		//获取字段y的值
		Field fieldY = point.getClass().getField("y"); //获取类中的类字段
		System.out.println("输出public属性字段"+fieldY.get(point));//获取对象中值
		//获取字段x的值
		Field fieldX = point.getClass().getDeclaredField("x"); //获取类中的类字段
		fieldX.setAccessible(true);  							//改变类字段的属性
		System.out.println("输出private属性字段"+fieldX.get(point));
		//调用方法chang()方法
		chang(point);
		System.out.println(point);
	}
public static void chang(Object obj) throws IllegalArgumentException, IllegalAccessException {
	Field[] fields = obj.getClass().getFields();//获取所有成员字段
	for(Field field:fields) {
		if(String.class==field.getType()) {
			String oldValue = (String) field.get(obj);
			String newValue = oldValue.replace('a', 'b');
			field.set(obj, newValue);
		}
	}
}
}
