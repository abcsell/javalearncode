package com.inputoutput;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

//�����ļ�����
public class File9 {
	public static void main(String[] args) throws Exception {
	//	String st;
		File f= new File("d:\\filetest\\1.dat");//����һ���ļ������f,ִ�к��λ��д������
		//����Ҫ���ļ����������fos��������f��Ϊ����
		FileOutputStream fos = new FileOutputStream(f);
		//����һ�����ֽ����������dos��������fos��Ϊ����
		DataOutputStream dos= new DataOutputStream(fos);
		//ʹ��dos��������д�뵽f��
		try {
			dos.writeUTF("����Ҫ�����ˡ�");
			dos.writeUTF("����Ҫ�����ˡ�");
			dos.writeUTF("����Ҫ�����ˡ�");
			dos.writeUTF("����Ҫ�����ˡ�");
		}catch(Exception e) {
			
		}
		dos.close();
	}
}
