package com.泛型;

import java.util.Vector;

public class GenericStudentVectory {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector<Student> v = new Vector<Student>();
		Student s1 = new Student(6);
		Student s2 = new Student(7);
		Student s3 = new Student(8);
		Student s4 = new Student(9);
		@SuppressWarnings("unused")
		Integer t  = new Integer(10);
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		for(int k=0; k<v.size(); k++) {
			System.out.println(v.get(k));
		}
	}

}



class Student{
	private int stuNum;
	public Student(int number) {
		this.stuNum=number;
	}
	public String toString() {
		return " " + this.stuNum;
	}
}