package com.inputoutput;
//randomAccessfile
import java.io.*;
public class File20 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		File f = new File("d://filetest//raf.txt");
		//����һ��������������raf
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		//�������ֱ���
		int x= 4;
		char c= 'a';
		long i=123;
		float f1 = 3.4f;
		double d = 4.222D;
		String str = "��Щ���ǻ��� �������͵�����";
		//����rafд�벻ͬ�������͵����ݵ�f��
		raf.writeInt(x);
		raf.writeChar(c);
		raf.writeLong(i);
		raf.writeFloat(f1);
		raf.writeDouble(d);
		raf.writeUTF(str);
		raf.close();//�رն���
		System.out.println("�ļ��Ѿ�������ϣ�");
	}

}
