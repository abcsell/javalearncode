package com.swing;

import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swingtest2 {
	static final int WIDTH =300;
	static final int HEIGHT=200;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		JFrame jf= new JFrame();
		jf.setSize(WIDTH,HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("����������");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		JButton b1 = new JButton("ȷ��");
		JButton b2 = new JButton("ȡ��");
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		jf.add(p);
		jf.setVisible(true);
	}

}
