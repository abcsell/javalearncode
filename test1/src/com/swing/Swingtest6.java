package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
//ToggleButton��ť
public class Swingtest6 {
	//��Ա����
		static final int WIDTH=300;
		static final int HEIGHT=200;//��ܸ߶ȺͿ��
			
		public static void main(String[] args) {//������
			// TODO �Զ����ɵķ������
			JFrame jf = new JFrame();//�������ڶ���jf
			jf.setSize(WIDTH, HEIGHT);//���ڴ�С
			//���ڵ��˳�����
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setTitle("ѡ���������");//���ڱ���
			Toolkit kit =Toolkit.getDefaultToolkit();//��ȡtoolkit���Ͷ���
			Dimension screenSize = kit.getScreenSize();//��ȡ��Ļ����
			//��ȡ��Ļ�Ŀ�Ⱥ͸߶�
			int width = screenSize.width;
			int height= screenSize.height;
			int x =(width -WIDTH)/2;
			int y = (height - HEIGHT)/2;
			jf.setLocation(x, y);
			//��������ѡ��ť����
			JToggleButton jt1 = new JToggleButton("����������");
			JToggleButton jt2 = new JToggleButton("Ƥ����");
			JToggleButton jt3 = new JToggleButton("������ʿ");
			//����������P
			Panel p = new Panel();
			//�������ѡ��ť����������p
			p.add(jt1);
			p.add(jt2);
			p.add(jt3);
			jf.add(p,BorderLayout.SOUTH);//��Ӷ���p������jf
//			jf.show();//��ʾ����--�÷����ѹ�ʱ
			jf.setVisible(true);//��ʾ����
		}
}
