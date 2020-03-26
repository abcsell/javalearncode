package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swingtest14 {

	public static void main(String[] args) {
		// ����BoxLayoutFrame�����frame1
		BoxLayoutFrame frame1 = new BoxLayoutFrame();
		//���ùرշ���
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame1.show();
		frame1.setVisible(true);
	}

}
@SuppressWarnings("serial")
class BoxLayoutFrame extends JFrame{
	//������Ա����
	private static final int WIDTH = 350;
	private static final int HEIGHT = 200;
	public BoxLayoutFrame() {
		setTitle("��ʽ���ֹ�����");
		setSize(WIDTH,HEIGHT);
		//��������con
		Container con = getContentPane();
		//������ǩ����label1���ı���������textfield1
		JLabel label1 = new JLabel("����:");
		JTextField textField1 = new JTextField(10);
		//���ö���textField1���������ַ�
		textField1.setMaximumSize(textField1.getPreferredSize());
		//���������ö���hbox1
		Box hbox1 = Box.createHorizontalBox();
		hbox1.add(label1);
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(textField1);
		//������ǩ����label2���ı���������textField2
		JLabel label2 = new JLabel("����:");
		JTextField textField2 = new JTextField(10);
		textField2.setMaximumSize(textField2.getPreferredSize());
		//���������ö���hbox2
		Box hbox2 = Box.createHorizontalBox();
		hbox2.add(label2);
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(textField2);
		//����������ť����
		JButton button1 = new JButton("ȷ��");
		JButton button2 = new JButton("ȡ��");
		//���������ö���hbox3
		Box hbox3 = Box.createHorizontalBox();
		hbox3.add(button1);
		hbox3.add(button2);
		//���������ö���vbox
		Box vbox = Box.createVerticalBox();
		vbox.add(hbox1);
		vbox.add(hbox2);
		vbox.add(Box.createVerticalGlue());
		vbox.add(hbox3);
		//��Ӷ���vbox������con
		con.add(vbox, BorderLayout.CENTER);
	}
}
