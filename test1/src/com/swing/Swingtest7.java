package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextField;
//�����ı���columns�е��ı���

public class Swingtest7 {
	static final int WIDTH=300;
	static final int HEIGHT=200;//��ܸ߶ȺͿ���
		
	public static void main(String[] args) {//������
		// TODO �Զ����ɵķ������
		JFrame jf = new JFrame();//�������ڶ���jf
		jf.setSize(WIDTH, HEIGHT);//���ڴ�С
		//���ڵ��˳�����
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("����Ը��");//���ڱ���
		Toolkit kit =Toolkit.getDefaultToolkit();//��ȡtoolkit���Ͷ���
		Dimension screenSize = kit.getScreenSize();//��ȡ��Ļ����
		//��ȡ��Ļ�Ŀ��Ⱥ͸߶�
		int width = screenSize.width;
		int height= screenSize.height;
		int x =(width -WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		//�����ı����������jt
		JTextField jt = new JTextField(10);
		
		//����������P
		Panel p = new Panel();
		//�����ı������������p
		p.add(jt);
		
		jf.add(p,BorderLayout.CENTER);//���Ӷ���p������jf
//		jf.show();//��ʾ����--�÷����ѹ�ʱ
		jf.setVisible(true);//��ʾ����
	}
}