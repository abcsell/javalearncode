package com.inputoutput;
//��ȡ�������������
import java.io.*;
public class File18 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		//����Ҫ�����ֽ�����������isr
		InputStreamReader isr = new InputStreamReader(System.in);
		//����һ�������������������br
		BufferedReader br = new BufferedReader(isr);
		//ͨ��br����ķ���readline������ȡ���ݲ����
		System.out.println(br.readLine());
		br.close();
	}

}
