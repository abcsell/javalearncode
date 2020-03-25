package com.inputoutput;
import java.io.*;
public class File11 {
	public void read(DataInputStream dis) {
		//在类中创建age,maths,name,chinese和physical参数
		String name = "";
		int age=0;
		float maths = 0;
		float english=0;
		float chinese=0;
		float physical=0;
		try {
			//在read方法中，以多字节输入流对象作为参考，并且利用此对象读取数据
			name=dis.readUTF();
			age=dis.readInt();
			maths=dis.readFloat();
			english=dis.readFloat();
			chinese=dis.readFloat();
			physical=dis.readFloat();
		}catch(Exception e) {
			
		}
		//输出相应的值
		System.out.print("姓名："+name+" ");
		System.out.print("年龄："+age+"  ");
		System.out.print("数学成绩:"+maths+"  ");
		System.out.print("英语成绩:"+english+"  ");
		System.out.print("语文成绩："+chinese+"  ");
		System.out.println("物理成绩："+physical);
		
	}
	//在write方法中，以多字节输出流对象作为参数，并且利用此对象写入数据
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
	public static void main(String[] args)throws Exception{//主方法
		//创建文件类对象f2和f
		File11 f2=new File11();
		File f= new File("d:\\filetest\\1.dat");
		//创建文件输入流对象fis
		FileInputStream fis= new FileInputStream(f);
		//创建数据输入流对象dis
		DataInputStream dis=new DataInputStream(fis);
		//创建文件输出流对象fos
		FileOutputStream fos= new FileOutputStream(f);
		//创建数据输出流对象dos
		DataOutputStream dos = new DataOutputStream(fos);
		//在文件类对象汇总写入内容并将其内容读出来
		f2.write("王鹏", 30, 88, 93, 100, 98, dos);
		f2.read(dis);
		f2.write("张飞", 29, 89, 66, 90, 47, dos);
		f2.read(dis);
		f2.write("关羽", 28, 97, 98, 99, 56, dos);
		f2.read(dis);
		f2.write("李逵", 27, 56, 28, 98, 78, dos);
		f2.read(dis);
		f2.write("武松", 26, 85, 92, 89, 89, dos);
		f2.read(dis);
		//关闭输入和输出流
		dos.close();
		dis.close();
	}
}

















