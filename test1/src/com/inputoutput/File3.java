package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;

public class File3 {//�ļ���������
	public static void main(String[] args) throws Exception{
		File f = new File("d:\\filetest\\file.txt");//�����ļ�����f  ��������Ŀ¼�±���������ļ�����Ҫ�Ƕ�ȡ����ļ��е�����
		FileInputStream fis=new FileInputStream(f);//��ȡ�ļ�����f�����������
		char ch;//�����ַ�����ch
		for(int i=0; i<f.length();i++) {//ͨ��ѭ��ʵ���ļ��Ķ�ȡ
			ch=(char)fis.read();
			System.out.print(ch);
		}
		fis.close();//�ر������
	}
}
