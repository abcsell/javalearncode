package com.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowManagerTest extends JFrame{
	public FlowManagerTest() {
		//�����ĸ���ť����
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		//���������ֹ�����������Ĭ������
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT,20,10);
//		FlowLayout f1 = new FlowLayout();
		Container cp = getContentPane();
	//	Container cp = new Container();
		cp.setLayout(f1);
		//һ������������������Щ��������մ����ң����ϵ��µ�˳������
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
	}
	public static void main(String[] agrs) {
		FlowManagerTest tmt = new FlowManagerTest();
		tmt.setTitle("�����ֹ�����ʾ��");
		tmt.setSize(400,300);
		tmt.setVisible(true);
	}
}
