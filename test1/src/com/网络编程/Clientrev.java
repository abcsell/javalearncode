package com.网络编程;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

@SuppressWarnings("serial")
public class Clientrev extends Frame{
//创建成员变量
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
				// TODO 自动生成的方法存根
				writer1.println(tf.getText());
				ta.append(tf.getText()+"\n");
				tf.setText("");
			}
		});
		pack();
	}
	public void connect() {//创建与服务器连接的方法
		try {
			ta.append("尝试与服务器连接\n");
			socket1 = new Socket("127.0.0.1",6000);
			writer1 = new PrintWriter(socket1.getOutputStream(),true);
			ta.append("完成连接，请输入待传字符串\n");
		}catch(Exception e) {
			System.out.println("连接失败");
		}
	}
	public static void main(String[] args) {//主方法
		//创建clientrev类对象client1
		Clientrev client1 = new Clientrev("向服务器发送数据。");
		client1.setVisible(true);
		client1.connect();
		
	}
}
