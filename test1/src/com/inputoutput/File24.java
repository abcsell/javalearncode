package com.inputoutput;
import java.io.*;
public class File24 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		File f = new File("d://filetest//raf.txt");
		FileInputStream fis = new FileInputStream(f);
		//����һ���������л�������Ķ���ois��
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st= new Student();
		//����ois����st������ֵ����
		st= (Student)ois.readObject();
		ois.close();
		//�����Ӧ��Ϣ
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.code);
		System.out.println(st.school);
		System.out.println(st.grade);
		System.out.println(st.address);
	}

}
