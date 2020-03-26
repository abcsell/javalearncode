package com.xmldom;

import org.dom4j.io.SAXReader;

public class Dom4jApp {
	public Dom4jApp()//构造函数
	{
		
	}
	public static void parseXML()//解析xml文件
	{
		@SuppressWarnings("unused")
		SAXReader parser = new SAXReader();//获取解析对象
		//太气人了，按照文档说明就是各种报错，算了，跳过xml的内容
		
}
	public static void main(String[] args) {
		System.out.println("太气人了，按照文档说明就是各种报错，算了，跳过xml的内容");
	}
}
