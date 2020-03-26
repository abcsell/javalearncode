package com.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swingtest15 {

	public static void main(String[] args) {
		// ��������frame1
		gridbaglayoutframe frame1 = new gridbaglayoutframe();
		//���ô��ڹرշ���
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}
}
@SuppressWarnings("serial")
//�����
class gridbaglayoutframe extends JFrame{
	//������Ա����
	private static final int WIDTH = 350;
	private static final int HEIGHT = 200;
	public gridbaglayoutframe()
	{
		setTitle("ѧ������ϵͳ");
		setSize(WIDTH, HEIGHT);//���ڴ�С
		//��ȡ����con
		Container con =getContentPane();
		//��Ӷ���con
		con.add(new studentJPanel(),BorderLayout.CENTER);
		con.add(new buttonpanel(),BorderLayout.SOUTH);
	}
}
//����һ��ѧ����ǩ���ı����ı������ڵ�������
@SuppressWarnings("serial")
class studentJPanel extends JPanel
{
	@SuppressWarnings("rawtypes")
	public studentJPanel()
	{
		GridBagLayout layout = new GridBagLayout();//�������ֹ���������layout
		setLayout(layout);
		//�������������ı�ǩ���ı�������
		JLabel namelabel = new JLabel("����:");
		JTextField nameTextField = new JTextField(10);
		//��������ѧ�ŵı�ǩ���ı�������
		JLabel codelabel = new JLabel("ѧ��:");
		JTextField codeTextField = new JTextField(10);
		//���������Ա�ı�ǩ���ı�������
		JLabel sexlabel = new JLabel("�Ա�:");
		JTextField sexTextField = new JTextField(10);
		//�������ڼ���ı�ǩ���ı�������
		JLabel addresslabel = new JLabel("����:");
		@SuppressWarnings("unchecked")
		JComboBox addressCombo = new JComboBox(new String[] {"����","�Ĵ�","ɽ��","����","����","����"});
		//�������ڼ򵥽��ܵı�ǩ���ı�������
		@SuppressWarnings("unused")
		JLabel commentLabel = new JLabel("�򵥽���");
		JTextArea sample = new JTextArea();
		sample.setLineWrap(true);
		//����������constraints����
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.EAST;
		constraints.weightx=5;
		constraints.weighty=5;
		//��Ӷ���constraints����
		add(namelabel,constraints,0,0,1,1);
		add(codelabel,constraints,0,1,1,1);
		add(sexlabel,constraints,0,2,1,1);
		add(addresslabel,constraints,0,3,1,1);
		//���������ö���constraints
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=100;
		add(nameTextField,constraints,1,0,1,1);
		add(codeTextField,constraints,1,1,1,1);
		add(sexTextField,constraints,1,2,1,1);
		add(addressCombo,constraints,1,3,1,1);
		//���������ö���constraints
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		add(sample,constraints,2,0,1,1);
		constraints.fill=GridBagConstraints.BOTH;
		add(sample,constraints,2,1,1,1);
		
	}
	//�����������������еĺ���
	public void add(Component c,GridBagConstraints constraints,int x,int y, int w, int h)
	{
		constraints.gridx=x;//�ؼ�λ����һ��
		constraints.gridy=y;//��
		constraints.gridwidth= w;//�ؼ�ռ�ݶ�����
		constraints.gridheight= h;//��
		add(c,constraints);
	}
}
@SuppressWarnings("serial")
class buttonpanel extends JPanel//���÷��ð�ť�ؼ���������
{
	public buttonpanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		//������ȷ�����͡�ȡ������ť
		JButton okbutton = new JButton("ȷ��");
		JButton cancelbutton = new JButton("ȡ��");
		//���������ö���hbox
		Box hBox = Box.createHorizontalBox();
		hBox.add(Box.createHorizontalStrut(40));
		hBox.add(okbutton);
		hBox.add(Box.createHorizontalGlue());
		hBox.add(cancelbutton);
		hBox.add(Box.createHorizontalStrut(40));
		add(hBox);
		
	}
}