package com.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Swingtest12 {
	static final int WIDTH =500;
	static final int HEIGHT=300;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jf= new JFrame();
		jf.setSize(WIDTH,HEIGHT);
		/**
		 * 关于窗口的退出处理
		 */
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("超级赛亚人");
		//获取屏幕的宽度和高度
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		//创建菜单条对象
		JMenuBar menubar1 = new JMenuBar();
		jf.setJMenuBar(menubar1);
		//创建四个菜单对象
		JMenu menu1 = new JMenu("武功");
		JMenu menu2 = new JMenu("武技");
		JMenu menu3 = new JMenu("仙法");
		JMenu menu4 = new JMenu("武器");
		//添加菜单到工具栏对象menubar1
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);
		menubar1.add(menu4);
		//创建四个菜单项对象
		JMenuItem item1 = new JMenuItem("半月刀");
		JMenuItem item2 = new JMenuItem("凌霜剑");
		JMenuItem item3 = new JMenuItem("九阳神功");
		JMenuItem item4 = new JMenuItem("圣魔元胎");
		JMenuItem item5 = new JMenuItem("降龙十八掌");
		menu1.add(item1);
		menu1.add(item2);
		//menu1.addSeparator();
		menu1.add(item3);
	//	menu1.addSeparator();
		menu1.add(item4);
		menu4.add(item5);
		jf.setVisible(true);
	}

}
