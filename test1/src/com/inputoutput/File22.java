package com.inputoutput;
import java.io.*;
public class File22 {

	public static void main(String[] args)throws Exception {
		// TODO �Զ����ɵķ������
		File f = new File("d://filetest//raf.txt");
		//����һ��������������raf
		RandomAccessFile raf =new RandomAccessFile(f,"rw");
		String s= "�����ѧУ��õ�ѧ����";//�����ַ�������
		//�����Ӧ��Ϣ
		System.out.println("����Ҫ��������ˣ�");
		//��raf��ָ��ָ���ڲ����ݵ�ĩ��
		try {
			long i = raf.length();
			raf.seek(i);
			raf.writeUTF(s);
			System.out.println("�ոռӵ�������ַ�����:");
			raf.seek(i);
			System.out.println(raf.readUTF());
			raf.seek(0);
			System.out.println(raf.readUTF());
			raf.close();
		}catch(Exception e) {
			
		}
	}

}
