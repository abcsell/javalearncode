package com.inputoutput;
import java.io.*;
//objectoutputStream
public class File23 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		File f = new File("d://filetest//raf.txt");
		//����Ҫ�����������fos,
		FileOutputStream fos = new FileOutputStream(f);
		//����һ���������л�������Ķ���oos��
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student st = new Student(); //����һ��ѧ�������
		//����ѧ����Ϣ
		st.name = "����";
		st.code = "97897";
		st.age = "28";
		st.sexy="��";
		st.school="�廪��ѧ";
		st.grade = "��������꼶һ��";
		st.address="�������˼�԰";
		oos.writeObject(st);//д����Ӧ���ݵ��ļ���
		oos.close();
		System.out.println("�ļ�������ɣ�");
				
	}
}
@SuppressWarnings("serial")
class Student implements Serializable{
	public	String name;
	public	String age;
	public	String sexy;
	public	String school;
	public	String grade;
	public	String address;
	public	String code;
}
