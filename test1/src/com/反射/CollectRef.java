package com.����;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

public class CollectRef {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO �Զ����ɵķ������
		//��ȡ�����ļ�
		InputStream is =new FileInputStream("E:\\workspace2\\test1\\src\\com\\����\\Config.properties");  //��Ҫ�½�һ��Config.properties�ļ�����������λ��
		Properties props =new Properties(); //��������
		props.load(is);					//����������
		is.close();						//�ر�������
		String className = props.getProperty("className");//��ȡ��Ӧ��ֵ
		//������Ӧ�ļ��϶���
		@SuppressWarnings("rawtypes")
		Collection collections = (Collection) Class.forName(className).newInstance();	
		//Ϊ����collections�������
		collections.add("1");
		collections.add("2");
		collections.add("3");
		collections.add("4");
		System.out.println("collections�����еĳ�Ա"+collections);
		}
	
}
