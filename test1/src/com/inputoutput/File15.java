package com.inputoutput;
import java.io.*;
public class File15 {

	public static void main(String[] args)throws Exception {
		// TODO �Զ����ɵķ������
		File f = new File("d:\\filetest","2.txt");
		//����һ�����������fos��������f��Ϊ����
		FileOutputStream fos = new FileOutputStream(f);
		//����һ���ַ����������osw��������fos��Ϊ����
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//����Ҫ������������������bw�����ô˶���д������
		BufferedWriter bw = new BufferedWriter(osw);
		//�����Ӧ���ݺͿո�
		bw.write("С����һ����ѧ����");
		bw.newLine();
		bw.write("����һ������ѧ����");
		bw.newLine();
		bw.write("���������ܺã������������۶���");
		bw.close();
	}

}
