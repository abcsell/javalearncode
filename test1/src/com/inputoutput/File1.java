package com.inputoutput;
import java.io.*;
public class File1 {//����һ�������ļ�����  
	/**
	 * ���̲Ŀ��ˣ���һ��������File����������˴�������File���java�е�io.File�����ε������·����޷�ʹ��
	 * ���ڲ���������Ҫ����İ�ͬ��������������ͻ����ε�
	 * @param f
	 */
	public void print(File f) {//ʵ���ж��ļ���������ʵķ���
		if(f.isDirectory()){
			System.out.println("����һ��Ŀ¼��");
		}else {
			System.out.println("�ⲻ��һ��Ŀ¼��");
		}
		if(f.exists()) {
			System.out.println("����ļ����ڵģ�");
		}else {
			System.out.println("����ļ������ڵģ�");
			try {
				f.createNewFile();//�����ļ�
			}catch(Exception e) {
				
			}
		}
	}
	public void print1(File f) {
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
	}
	public void print2(File f) {
		if(f.isFile()) {
			System.out.println(f.lastModified());
			System.out.println(f.length());
		}
	}
	public static void main(String[] args) {
		File1 f1= new File1();
		File f =new File("d:\\filetest","file.txt");
		f1.print(f);
		f1.print1(f);
		f1.print2(f);
	}


}