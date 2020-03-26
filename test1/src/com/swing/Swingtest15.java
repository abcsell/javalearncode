package com.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swingtest15 {

	public static void main(String[] args) {
		// 创建对象frame1
		gridbaglayoutframe frame1 = new gridbaglayoutframe();
		//设置窗口关闭方法
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}
}
@SuppressWarnings("serial")
//设计类
class gridbaglayoutframe extends JFrame{
	//创建成员变量
	private static final int WIDTH = 350;
	private static final int HEIGHT = 200;
	public gridbaglayoutframe()
	{
		setTitle("学生管理系统");
		setSize(WIDTH, HEIGHT);//窗口大小
		//获取对象con
		Container con =getContentPane();
		//添加对象到con
		con.add(new studentJPanel(),BorderLayout.CENTER);
		con.add(new buttonpanel(),BorderLayout.SOUTH);
	}
}
//创建一个学生标签和文本域及文本区所在的容器类
@SuppressWarnings("serial")
class studentJPanel extends JPanel
{
	@SuppressWarnings("rawtypes")
	public studentJPanel()
	{
		GridBagLayout layout = new GridBagLayout();//创建布局管理器对象layout
		setLayout(layout);
		//创建关于姓名的标签和文本输入域
		JLabel namelabel = new JLabel("姓名:");
		JTextField nameTextField = new JTextField(10);
		//创建关于学号的标签和文本输入域
		JLabel codelabel = new JLabel("学号:");
		JTextField codeTextField = new JTextField(10);
		//创建关于性别的标签和文本输入域
		JLabel sexlabel = new JLabel("性别:");
		JTextField sexTextField = new JTextField(10);
		//创建关于籍贯的标签和文本输入域
		JLabel addresslabel = new JLabel("籍贯:");
		@SuppressWarnings("unchecked")
		JComboBox addressCombo = new JComboBox(new String[] {"江西","四川","山西","湖北","湖南","海南"});
		//创建关于简单介绍的标签和文本输入域
		@SuppressWarnings("unused")
		JLabel commentLabel = new JLabel("简单介绍");
		JTextArea sample = new JTextArea();
		sample.setLineWrap(true);
		//创建和设置constraints对象
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.EAST;
		constraints.weightx=5;
		constraints.weighty=5;
		//添加对象到constraints对象
		add(namelabel,constraints,0,0,1,1);
		add(codelabel,constraints,0,1,1,1);
		add(sexlabel,constraints,0,2,1,1);
		add(addresslabel,constraints,0,3,1,1);
		//创建和设置对象constraints
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=100;
		add(nameTextField,constraints,1,0,1,1);
		add(codeTextField,constraints,1,1,1,1);
		add(sexTextField,constraints,1,2,1,1);
		add(addressCombo,constraints,1,3,1,1);
		//创建和设置对象constraints
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		add(sample,constraints,2,0,1,1);
		constraints.fill=GridBagConstraints.BOTH;
		add(sample,constraints,2,1,1,1);
		
	}
	//用来添加组件到容器中的函数
	public void add(Component c,GridBagConstraints constraints,int x,int y, int w, int h)
	{
		constraints.gridx=x;//控件位于那一列
		constraints.gridy=y;//行
		constraints.gridwidth= w;//控件占据多少列
		constraints.gridheight= h;//行
		add(c,constraints);
	}
}
@SuppressWarnings("serial")
class buttonpanel extends JPanel//设置放置按钮控件的容器类
{
	public buttonpanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		//创建“确定”和‘取消’按钮
		JButton okbutton = new JButton("确定");
		JButton cancelbutton = new JButton("取消");
		//创建和设置对象hbox
		Box hBox = Box.createHorizontalBox();
		hBox.add(Box.createHorizontalStrut(40));
		hBox.add(okbutton);
		hBox.add(Box.createHorizontalGlue());
		hBox.add(cancelbutton);
		hBox.add(Box.createHorizontalStrut(40));
		add(hBox);
		
	}
}