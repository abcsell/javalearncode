package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * ����������������ʹ��
 * @author kls
 *��ʵ���Ƕ�ȡfile.txt�е����ݣ�д��file2.txt��
 */
public class File6 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		//�����ļ������f��f1
		File f = new File("d:\\filetest\\file.txt");//�ļ������
		File f1 = new File("d:\\filetest\\file2.txt");//�ļ������
		//�����ļ�����������fis���ļ����������fos
		FileInputStream fis = new FileInputStream(f);//�ļ����������
		FileOutputStream fos = new FileOutputStream(f1);//�ļ����������
		//�����ֽ��������b
		byte[] b =new byte[(int)f.length()];
		fis.read(b);
		//ʹ��ѭ����佫�ֽ������е�������f��д
		for(int i=0; i<f.length();i++) {
			fos.write(b[i]);
		}
		//�ر����������
		fis.close();
		fos.close();
	}

}
