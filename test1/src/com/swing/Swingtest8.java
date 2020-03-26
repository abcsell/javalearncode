package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPasswordField;


public class Swingtest8 {
	static final int WIDTH=300;
	static final int HEIGHT=200;//框架高度和宽度
		
	public static void main(String[] args) {//主方法
		// TODO 自动生成的方法存根
		JFrame jf = new JFrame();//创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);//窗口大小
		//窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("密码输入窗口");//窗口标题
		Toolkit kit =Toolkit.getDefaultToolkit();//获取toolkit类型对象
		Dimension screenSize = kit.getScreenSize();//获取屏幕对象
		//获取屏幕的宽度和高度
		int width = screenSize.width;
		int height= screenSize.height;
		int x =(width -WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		//创建文本输入域对象jt
		JPasswordField jp = new JPasswordField(10);
		
		//创建面板对象P
		Panel p = new Panel();
		//添加文本域对象到面板对象p
		p.add(jp);
		
		jf.add(p,BorderLayout.CENTER);//添加对象p到窗口jf
//		jf.show();//显示窗口--该方法已过时
		jf.setVisible(true);//显示窗口
}
}