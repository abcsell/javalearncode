package com.inputoutput;
import java.io.*;
public class File14 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		File f = new File("d:\\filetest","1.txt");
		//����һ�����������fos��������f��Ϊ����
		FileOutputStream fos = new FileOutputStream(f);
		//����һ���ַ����������osw��������fos��Ϊ����
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("��");
		osw.close();
	}

}
