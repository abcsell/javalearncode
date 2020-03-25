package com.inputoutput;
import java.io.*;
public class File24 {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		File f = new File("d://filetest//raf.txt");
		FileInputStream fis = new FileInputStream(f);
		//创建一个对象序列化处理类的对象ois，
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st= new Student();
		//利用ois对象将st的属性值读出
		st= (Student)ois.readObject();
		ois.close();
		//输出相应信息
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.code);
		System.out.println(st.school);
		System.out.println(st.grade);
		System.out.println(st.address);
	}

}
