package com.�쳣���ڴ�;

import java.io.*;


public class File1 {
	public static void main(String[] args ) throws Exception {//������
		File f=new File("d://raf.txt");//����file�����
		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		String s="��������ѧУ��õ�ѧ��";
		System.out.println("����Ҫ��������ˣ�");
		long i=raf.length();//��ȡ�ĳ���
		raf.seek(i);
		raf.writeUTF(s);//����UTF-8����д���ַ�
		System.out.println("�ոռӵ�������ַ����ǣ�");
		raf.seek(i);//����һ���ַ�
		System.out.println(raf.readUTF());
		raf.seek(0);
		System.out.println(raf.readUTF());
		raf.close();
	}
}
