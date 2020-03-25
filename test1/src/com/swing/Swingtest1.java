package com.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Swingtest1 {
	static final int WIDTH =300;
	static final int HEIGHT=200;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jf =new JFrame();
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
		
		jf.show();
	}
	
}
