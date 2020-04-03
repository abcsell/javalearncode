package com.网络编程;

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
//创建成员变量

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
		//通过按钮的动作，开始将输出流输送到屏幕中
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO 自动生成的方法存根
				try {
					writer1.writeUTF(tf.getText());
					writer1.flush();
					String fileinfo = reader1.readUTF();
					ta.setText("<"+tf.getText()+"的内容>\n\n");
					ta.append(fileinfo);
					
				} catch (Exception e) {	
				}
				
			}
		});
		pack();
	}
	public void connect() {//创建与服务器连接的方法
		try {
			ta.append("尝试与服务器连接\n");
			socket1 = new Socket("127.0.0.1",6000);
			ta.append("连接完毕。。。。。请输入文件名\n");
			writer1 = new DataOutputStream(socket1.getOutputStream());
			reader1 = new DataInputStream(socket1.getInputStream());
		}catch(Exception e) {
			System.out.println("连接失败");
		}
	}
	public static void main(String[] args) {//主方法
		//创建clientrev类对象client1
		Clientrev1 client1 = new Clientrev1("向服务器发送数据。");
		client1.setVisible(true);
		client1.connect();
		
	}
}
