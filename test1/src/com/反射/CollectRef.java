package com.反射;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

public class CollectRef {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		//读取属性文件
		InputStream is =new FileInputStream("E:\\workspace2\\test1\\src\\com\\反射\\Config.properties");  //需要新建一个Config.properties文件，并引导好位置
		Properties props =new Properties(); //创建对象
		props.load(is);					//加载输入流
		is.close();						//关闭输入流
		String className = props.getProperty("className");//获取相应的值
		//创建相应的集合对象
		@SuppressWarnings("rawtypes")
		Collection collections = (Collection) Class.forName(className).newInstance();	
		//为集合collections添加数据
		collections.add("1");
		collections.add("2");
		collections.add("3");
		collections.add("4");
		System.out.println("collections集合中的成员"+collections);
		}
	
}
