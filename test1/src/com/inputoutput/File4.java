package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;

public class File4 {
	public static void main(String[] args) throws Exception{
		File f = new File("d:\\filetest\\file.txt");//�����ļ�����f  ��������Ŀ¼�±���������ļ�����Ҫ�Ƕ�ȡ����ļ��е�����
		FileInputStream fis=new FileInputStream(f);//��ȡ�ļ�����f�����������
		byte[] b = new byte[(int)f.length()];//����һ���ֽ��������
		//�����е��ֽڶ����浽һ���ֽ�����b��
		fis.read(b);
		for(int i=0; i<f.length();i++) {//ͨ��ѭ��ʵ���ļ��Ķ�ȡ
			
			System.out.print((char)b[i]);
		}
		fis.close();//�ر������
	}
}
