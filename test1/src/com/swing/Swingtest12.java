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
		// TODO �Զ����ɵķ������
		JFrame jf= new JFrame();
		jf.setSize(WIDTH,HEIGHT);
		/**
		 * ���ڴ��ڵ��˳�����
		 */
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("����������");
		//��ȡ��Ļ�Ŀ�Ⱥ͸߶�
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		//�����˵�������
		JMenuBar menubar1 = new JMenuBar();
		jf.setJMenuBar(menubar1);
		//�����ĸ��˵�����
		JMenu menu1 = new JMenu("�书");
		JMenu menu2 = new JMenu("�似");
		JMenu menu3 = new JMenu("�ɷ�");
		JMenu menu4 = new JMenu("����");
		//��Ӳ˵�������������menubar1
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);
		menubar1.add(menu4);
		//�����ĸ��˵������
		JMenuItem item1 = new JMenuItem("���µ�");
		JMenuItem item2 = new JMenuItem("��˪��");
		JMenuItem item3 = new JMenuItem("������");
		JMenuItem item4 = new JMenuItem("ʥħԪ̥");
		JMenuItem item5 = new JMenuItem("����ʮ����");
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
