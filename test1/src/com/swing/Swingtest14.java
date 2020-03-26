package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swingtest14 {

	public static void main(String[] args) {
		// 创建BoxLayoutFrame类对象frame1
		BoxLayoutFrame frame1 = new BoxLayoutFrame();
		//设置关闭方法
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame1.show();
		frame1.setVisible(true);
	}

}
@SuppressWarnings("serial")
class BoxLayoutFrame extends JFrame{
	//创建成员变量
	private static final int WIDTH = 350;
	private static final int HEIGHT = 200;
	public BoxLayoutFrame() {
		setTitle("箱式布局管理器");
		setSize(WIDTH,HEIGHT);
		//创建对象con
		Container con = getContentPane();
		//创建标签对象label1和文本输入框对象textfield1
		JLabel label1 = new JLabel("姓名:");
		JTextField textField1 = new JTextField(10);
		//设置对象textField1输入的最大字符
		textField1.setMaximumSize(textField1.getPreferredSize());
		//创建和设置对象hbox1
		Box hbox1 = Box.createHorizontalBox();
		hbox1.add(label1);
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(textField1);
		//创建标签对象label2和文本输入框对象textField2
		JLabel label2 = new JLabel("密码:");
		JTextField textField2 = new JTextField(10);
		textField2.setMaximumSize(textField2.getPreferredSize());
		//创建和设置对象hbox2
		Box hbox2 = Box.createHorizontalBox();
		hbox2.add(label2);
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(textField2);
		//创建两个按钮对象
		JButton button1 = new JButton("确定");
		JButton button2 = new JButton("取消");
		//创建和设置对象hbox3
		Box hbox3 = Box.createHorizontalBox();
		hbox3.add(button1);
		hbox3.add(button2);
		//创建和设置对象vbox
		Box vbox = Box.createVerticalBox();
		vbox.add(hbox1);
		vbox.add(hbox2);
		vbox.add(Box.createVerticalGlue());
		vbox.add(hbox3);
		//添加对象vbox到对象con
		con.add(vbox, BorderLayout.CENTER);
	}
}
