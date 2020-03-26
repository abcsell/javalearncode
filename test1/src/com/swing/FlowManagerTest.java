package com.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowManagerTest extends JFrame{
	public FlowManagerTest() {
		//创建四个按钮对象
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		//创建流布局管理器，采用默认配置
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT,20,10);
//		FlowLayout f1 = new FlowLayout();
		Container cp = getContentPane();
	//	Container cp = new Container();
		cp.setLayout(f1);
		//一次向容器添加组件，这些组件将按照从左到右，从上到下的顺序排列
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
	}
	public static void main(String[] agrs) {
		FlowManagerTest tmt = new FlowManagerTest();
		tmt.setTitle("流布局管理器示例");
		tmt.setSize(400,300);
		tmt.setVisible(true);
	}
}
