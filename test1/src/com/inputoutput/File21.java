package com.inputoutput;
import java.io.*;
public class File21 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		File f = new File("d://filetest//raf.txt");
		//����һ��������������raf
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		//����raf��ȡ��ͬ���������͵�����
		System.out.println(raf.readInt());
		System.out.println(raf.readChar());
		System.out.println(raf.readLong());
		System.out.println(raf.readFloat());
		System.out.println(raf.readDouble());
		System.out.println(raf.readUTF());
		raf.close();
		System.out.println("������ļ������ݣ�");
	}

}
