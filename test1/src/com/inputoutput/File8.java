package com.inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

//�����ļ���������
public class File8 {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
//����һ���ļ������f
		File f = new File("d:\\filetest\\1.txt");
		//����һ���ļ����������fos��������f��Ϊ����
		FileOutputStream fos = new FileOutputStream(f);
		//����һ���������������filter,������fos��Ϊ����
		FilterOutputStream filter = new FilterOutputStream(fos);
		//ͨ��ѭ�������f��д������
		for(int i='a';i<'z';i++) {
			filter.write(i);
		}
		fos.close();//�ر������
	}

}
