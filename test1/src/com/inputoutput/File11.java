package com.inputoutput;
import java.io.*;
public class File11 {
	public void read(DataInputStream dis) {
		//�����д���age,maths,name,chinese��physical����
		String name = "";
		int age=0;
		float maths = 0;
		float english=0;
		float chinese=0;
		float physical=0;
		try {
			//��read�����У��Զ��ֽ�������������Ϊ�ο����������ô˶����ȡ����
			name=dis.readUTF();
			age=dis.readInt();
			maths=dis.readFloat();
			english=dis.readFloat();
			chinese=dis.readFloat();
			physical=dis.readFloat();
		}catch(Exception e) {
			
		}
		//�����Ӧ��ֵ
		System.out.print("������"+name+" ");
		System.out.print("���䣺"+age+"  ");
		System.out.print("��ѧ�ɼ�:"+maths+"  ");
		System.out.print("Ӣ��ɼ�:"+english+"  ");
		System.out.print("���ĳɼ���"+chinese+"  ");
		System.out.println("����ɼ���"+physical);
		
	}
	//��write�����У��Զ��ֽ������������Ϊ�������������ô˶���д������
	public void write(String name,int age,float maths,float english,float chinese,float physical,DataOutputStream dos) {
		try {
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeFloat(maths);
			dos.writeFloat(chinese);
			dos.writeFloat(english);
			dos.writeFloat(physical);
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args)throws Exception{//������
		//�����ļ������f2��f
		File11 f2=new File11();
		File f= new File("d:\\filetest\\1.dat");
		//�����ļ�����������fis
		FileInputStream fis= new FileInputStream(f);
		//������������������dis
		DataInputStream dis=new DataInputStream(fis);
		//�����ļ����������fos
		FileOutputStream fos= new FileOutputStream(f);
		//�����������������dos
		DataOutputStream dos = new DataOutputStream(fos);
		//���ļ���������д�����ݲ��������ݶ�����
		f2.write("����", 30, 88, 93, 100, 98, dos);
		f2.read(dis);
		f2.write("�ŷ�", 29, 89, 66, 90, 47, dos);
		f2.read(dis);
		f2.write("����", 28, 97, 98, 99, 56, dos);
		f2.read(dis);
		f2.write("����", 27, 56, 28, 98, 78, dos);
		f2.read(dis);
		f2.write("����", 26, 85, 92, 89, 89, dos);
		f2.read(dis);
		//�ر�����������
		dos.close();
		dis.close();
	}
}

















