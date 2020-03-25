package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Swingtest3 {
	static final int WIDTH =300;
	static final int HEIGHT=200;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jf= new JFrame();
		jf.setSize(WIDTH,HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("超级赛亚人");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		JRadioButton jr1 = new JRadioButton("忽略");
		JRadioButton jr2 = new JRadioButton("继续");
		JRadioButton jr3 = new JRadioButton("跳过");
		
		ButtonGroup bg = new ButtonGroup();
		Panel p = new Panel();
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		p.add(jr1);
		p.add(jr2);
		p.add(jr3);
		jf.add(p);
		jf.add(p,BorderLayout.NORTH);
		jf.setVisible(true);
	}

}
