package com.������;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

@SuppressWarnings("serial")
public class Clientrev1 extends Frame{
//������Ա����

	Socket socket1;
	private DataInputStream reader1;
	private DataOutputStream writer1;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	public Clientrev1(String title) {
		super(title);
		ta.setEditable(false);
		add(ta,"North");
		add(tf,"South");
		//ͨ����ť�Ķ�������ʼ����������͵���Ļ��
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO �Զ����ɵķ������
				try {
					writer1.writeUTF(tf.getText());
					writer1.flush();
					String fileinfo = reader1.readUTF();
					ta.setText("<"+tf.getText()+"������>\n\n");
					ta.append(fileinfo);
					
				} catch (Exception e) {	
				}
				
			}
		});
		pack();
	}
	public void connect() {//��������������ӵķ���
		try {
			ta.append("���������������\n");
			socket1 = new Socket("127.0.0.1",6000);
			ta.append("������ϡ����������������ļ���\n");
			writer1 = new DataOutputStream(socket1.getOutputStream());
			reader1 = new DataInputStream(socket1.getInputStream());
		}catch(Exception e) {
			System.out.println("����ʧ��");
		}
	}
	public static void main(String[] args) {//������
		//����clientrev�����client1
		Clientrev1 client1 = new Clientrev1("��������������ݡ�");
		client1.setVisible(true);
		client1.connect();
		
	}
}
