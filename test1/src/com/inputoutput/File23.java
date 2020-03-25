package com.inputoutput;
import java.io.*;
//objectoutputStream
public class File23 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		File f = new File("d://filetest//raf.txt");
		//创建要给输出流对象fos,
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个对象序列化处理类的对象oos，
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student st = new Student(); //创建一个学生类对象
		//设置学生信息
		st.name = "王鹏";
		st.code = "97897";
		st.age = "28";
		st.sexy="男";
		st.school="清华大学";
		st.grade = "计算机三年级一班";
		st.address="北京市潘家园";
		oos.writeObject(st);//写入相应内容到文件中
		oos.close();
		System.out.println("文件创建完成！");
				
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
