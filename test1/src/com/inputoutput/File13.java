package com.inputoutput;
import java.io.*;
public class File13 {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		File f= new File("d:\\filetest","1.txt");
		//����һ������������fis��������f��Ϊ����
		FileInputStream fis = new FileInputStream(f);
		//����һ���ַ�����������isr��������fis��Ϊ����
		InputStreamReader isr = new InputStreamReader(fis);
		//����һ����������������������ô˶����ȡһ������
		BufferedReader br = new BufferedReader(isr);
		//�����ȡ��������
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		br.close();
	}
	

}
