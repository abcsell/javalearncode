package com.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;


//ѡ�����
//jcombobox
public class Swingtest11 {
	static final int WIDTH=300;
	static final int HEIGHT=200;//��ܸ߶ȺͿ��
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {//������
		// TODO �Զ����ɵķ������
		JFrame jf = new JFrame();//�������ڶ���jf
		jf.setSize(WIDTH, HEIGHT);//���ڴ�С
		//���ڵ��˳�����
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("ѧ������ϵͳ");//���ڱ���
		Toolkit kit =Toolkit.getDefaultToolkit();//��ȡtoolkit���Ͷ���
		Dimension screenSize = kit.getScreenSize();//��ȡ��Ļ����
		//��ȡ��Ļ�Ŀ�Ⱥ͸߶�
		int width = screenSize.width;
		int height= screenSize.height;
		int x =(width -WIDTH)/2;
		int y = (height - HEIGHT)/2;
		jf.setLocation(x, y);
		//�����ַ����������a��������Ԫ��
	String[] a = new String[5];
		a[0]="����";
		a[1]="����";
		a[2]="����";
		a[3]="����";
		a[4]="����";
		//����ѡ���������jc
		JComboBox jc  = new JComboBox(a);
		//����������P
		Panel p = new Panel();
		//����ı������������p
		p.add(jc);
		
		jf.add(p,BorderLayout.CENTER);//��Ӷ���p������jf
//		jf.show();//��ʾ����--�÷����ѹ�ʱ
		jf.setVisible(true);//��ʾ����
}
}
