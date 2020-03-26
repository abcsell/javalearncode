package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;


//选择组件
//jcombobox
public class Swingtest11 {
	static final int WIDTH=300;
	static final int HEIGHT=200;//框架高度和宽度
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {//主方法
		// TODO 自动生成的方法存根
		JFrame jf = new JFrame();//创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);//窗口大小
		//窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");//窗口标题
		Toolkit kit =Toolkit.getDefaultToolkit();//获取toolkit类型对象
		Dimension screenSize = kit.getScreenSize();//获取屏幕对象
		//获取屏幕的宽度和高度
		int width = screenSize.width;
		int height= screenSize.height;
		int x =(width -WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		//创建字符串数组对象a并设置其元素
	String[] a = new String[5];
		a[0]="王浩";
		a[1]="张敏";
		a[2]="李明";
		a[3]="张三";
		a[4]="赵四";
		//创建选择组件对象jc
		JComboBox jc  = new JComboBox(a);
		//创建面板对象P
		Panel p = new Panel();
		//添加文本域对象到面板对象p
		p.add(jc);
		
		jf.add(p,BorderLayout.CENTER);//添加对象p到窗口jf
//		jf.show();//显示窗口--该方法已过时
		jf.setVisible(true);//显示窗口
}
}
