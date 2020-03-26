package com.swing;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class BorderManagerTest extends JFrame{
//实现类的构造函数
	public BorderManagerTest() {
		JButton b1 = new JButton("东青龙");
		JButton b2 = new JButton("西白虎");
		JButton b3 = new JButton("南朱雀");
		JButton b4 = new JButton("北玄武");
		JButton b5 = new JButton("中麒麟");
		//创建边界布局管理器
		BorderLayout bl = new BorderLayout();
		Container cp = getContentPane();
		//设置容器的布局管理器为边界管理器
		cp.setLayout(bl);
		//向容器中添加按钮组件
		cp.add(b1,BorderLayout.EAST);
		cp.add(b2,BorderLayout.WEST);
		cp.add(b3,BorderLayout.SOUTH);
		cp.add(b4,BorderLayout.NORTH);
		cp.add(b5,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		BorderManagerTest gmt = new BorderManagerTest();
		gmt.setTitle("边界布局管理器示例--圣兽方位");
		gmt.setSize(400,300);
		gmt.setVisible(true);
	}

}
