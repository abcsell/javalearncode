package com.swing;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class BorderManagerTest extends JFrame{
//ʵ����Ĺ��캯��
	public BorderManagerTest() {
		JButton b1 = new JButton("������");
		JButton b2 = new JButton("���׻�");
		JButton b3 = new JButton("����ȸ");
		JButton b4 = new JButton("������");
		JButton b5 = new JButton("������");
		//�����߽粼�ֹ�����
		BorderLayout bl = new BorderLayout();
		Container cp = getContentPane();
		//���������Ĳ��ֹ�����Ϊ�߽������
		cp.setLayout(bl);
		//����������Ӱ�ť���
		cp.add(b1,BorderLayout.EAST);
		cp.add(b2,BorderLayout.WEST);
		cp.add(b3,BorderLayout.SOUTH);
		cp.add(b4,BorderLayout.NORTH);
		cp.add(b5,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		BorderManagerTest gmt = new BorderManagerTest();
		gmt.setTitle("�߽粼�ֹ�����ʾ��--ʥ�޷�λ");
		gmt.setSize(400,300);
		gmt.setVisible(true);
	}

}
