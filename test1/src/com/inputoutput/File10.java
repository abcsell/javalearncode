package com.inputoutput;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class File10 {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		File f = new File("d:\\filetest\\1.dat");
		//����һ���ļ����������fis
		FileInputStream fis = new FileInputStream(f);
		//����Ҫ�����ֽ�����������dis��������fis��Ϊ����
		DataInputStream dis = new DataInputStream(fis);
		try {
			//ʹ��dis�����f�ж�ȡ����
			System.out.println(dis.readUTF());
		}catch (Exception e) {
			
		}
		dis.close();
	}

}
