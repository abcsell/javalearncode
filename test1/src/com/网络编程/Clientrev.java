package com.������;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

@SuppressWarnings("serial")
public class Clientrev extends Frame{
//������Ա����
	private PrintWriter writer1;
	Socket socket1;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	public Clientrev(String title) {
		super(title);
		ta.setEditable(false);
		add(ta,"North");
		add(tf,"South");
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO �Զ����ɵķ������
				writer1.println(tf.getText());
				ta.append(tf.getText()+"\n");
				tf.setText("");
			}
		});
		pack();
	}
	public void connect() {//��������������ӵķ���
		try {
			ta.append("���������������\n");
			socket1 = new Socket("127.0.0.1",6000);
			writer1 = new PrintWriter(socket1.getOutputStream(),true);
			ta.append("������ӣ�����������ַ���\n");
		}catch(Exception e) {
			System.out.println("����ʧ��");
		}
	}
	public static void main(String[] args) {//������
		//����clientrev�����client1
		Clientrev client1 = new Clientrev("��������������ݡ�");
		client1.setVisible(true);
		client1.connect();
		
	}
}
