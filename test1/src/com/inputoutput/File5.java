package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File5 {
	public static void main(String[] args) throws Exception{
		File f = new File("d:\\filetest\\file.txt");//�ļ������
		FileOutputStream fos = new FileOutputStream(f);//�ļ����������
		for(int i = 'a';i<='z';i++) {//ͨ��ѭ�������fд��
			fos.write(i);
		}
		fos.close();
		FileInputStream fis=new FileInputStream(f);
		char ch;
		for(int i= 0;i<f.length(); i++) {
			ch=(char)fis.read();
			System.out.print(ch);
		}
		
		fis.close();
	}
}

