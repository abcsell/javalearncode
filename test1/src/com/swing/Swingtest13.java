package com.swing;

import java.awt.Frame;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Swingtest13 extends Frame{

	public static void main(String[] args) {
		//创建弹出对话框对象JOptionpane
		JOptionPane.showConfirmDialog(null,"这是错误消息！","这是错误消息！",JOptionPane.YES_NO_CANCEL_OPTION);
			
	}

}
