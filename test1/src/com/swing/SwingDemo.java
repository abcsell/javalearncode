package com.swing;
import javax.swing.JFrame;
public class SwingDemo {
	static final int WIDTH =300;
	static final int HEIGHT =300;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		JFrame jf =new JFrame();
		jf.setSize(WIDTH,HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.show();
	}

}
