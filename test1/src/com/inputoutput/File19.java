package com.inputoutput;
import java.io.*;
public class File19 {

	public static void main(String[] args)throws Exception{
		// TODO �Զ����ɵķ������
		//����һ�����ֽ�����������isr
		InputStreamReader isr = new InputStreamReader(System.in);
		//����һ�������������������br
		BufferedReader br = new BufferedReader(isr);
		//��������pw
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("������ַ���");
		String s;								//�����ַ�������s
		while(!(s = br.readLine()).equals(""));//ͨ��ѭ���������
		pw.println(s);
		//�رն���br��pw
		br.close();
		pw.close();
	}

}
