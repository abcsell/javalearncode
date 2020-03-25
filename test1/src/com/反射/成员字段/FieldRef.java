package com.����.��Ա�ֶ�;

import java.lang.reflect.Field;

public class FieldRef {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException 
	{
		// TODO �Զ����ɵķ������
		Point point =new Point(3,4);						//����һ������
		//��ȡ�ֶ�y��ֵ
		Field fieldY = point.getClass().getField("y"); //��ȡ���е����ֶ�
		System.out.println("���public�����ֶ�"+fieldY.get(point));//��ȡ������ֵ
		//��ȡ�ֶ�x��ֵ
		Field fieldX = point.getClass().getDeclaredField("x"); //��ȡ���е����ֶ�
		fieldX.setAccessible(true);  							//�ı����ֶε�����
		System.out.println("���private�����ֶ�"+fieldX.get(point));
		//���÷���chang()����
		chang(point);
		System.out.println(point);
	}
public static void chang(Object obj) throws IllegalArgumentException, IllegalAccessException {
	Field[] fields = obj.getClass().getFields();//��ȡ���г�Ա�ֶ�
	for(Field field:fields) {
		if(String.class==field.getType()) {
			String oldValue = (String) field.get(obj);
			String newValue = oldValue.replace('a', 'b');
			field.set(obj, newValue);
		}
	}
}
}
