package com.inputoutput;
import java.io.*;
public class File12 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		File f=new File("d:\\filetest\\1.txt");//�����ļ������f
		//����һ������������fis��������f��Ϊ����
		FileInputStream fis=new FileInputStream(f);
		//����һ���ַ�����������isr��������fis��Ϊ����
		@SuppressWarnings("resource")
		InputStreamReader isr = new InputStreamReader(fis);
		char st = (char)isr.read();//�����������ݷ����ַ�st��
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
	}

}
