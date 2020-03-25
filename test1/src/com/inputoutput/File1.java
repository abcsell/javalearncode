package com.inputoutput;
import java.io.*;
public class File1 {//创建一个关于文件的类  
	/**
	 * 被教材坑了，第一个类名是File，结果出现了错误，类名File会把java中的io.File给屏蔽掉，导致方法无法使用
	 * 包内不能有与需要导入的包同样的类名，否则就会屏蔽掉
	 * @param f
	 */
	public void print(File f) {//实现判断文件类对象性质的方法
		if(f.isDirectory()){
			System.out.println("这是一个目录！");
		}else {
			System.out.println("这不是一个目录！");
		}
		if(f.exists()) {
			System.out.println("这个文件存在的！");
		}else {
			System.out.println("这个文件不存在的！");
			try {
				f.createNewFile();//创建文件
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