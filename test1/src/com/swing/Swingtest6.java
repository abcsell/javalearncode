package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
//ToggleButton按钮
public class Swingtest6 {
	//成员变量
		static final int WIDTH=300;
		static final int HEIGHT=200;//框架高度和宽度
			
		public static void main(String[] args) {//主方法
			// TODO 自动生成的方法存根
			JFrame jf = new JFrame();//创建窗口对象jf
			jf.setSize(WIDTH, HEIGHT);//窗口大小
			//窗口的退出处理
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setTitle("选择变身能力");//窗口标题
			Toolkit kit =Toolkit.getDefaultToolkit();//获取toolkit类型对象
			Dimension screenSize = kit.getScreenSize();//获取屏幕对象
			//获取屏幕的宽度和高度
			int width = screenSize.width;
			int height= screenSize.height;
			int x =(width -WIDTH)/2;
			int y = (height - HEIGHT)/2;
			jf.setLocation(x, y);
			//创建三个选择按钮对象
			JToggleButton jt1 = new JToggleButton("超级赛亚人");
			JToggleButton jt2 = new JToggleButton("皮卡丘");
			JToggleButton jt3 = new JToggleButton("神龙斗士");
			//创建面板对象P
			Panel p = new Panel();
			//添加三个选择按钮对象到面板对象p
			p.add(jt1);
			p.add(jt2);
			p.add(jt3);
			jf.add(p,BorderLayout.SOUTH);//添加对象p到窗口jf
//			jf.show();//显示窗口--该方法已过时
			jf.setVisible(true);//显示窗口
		}
}
