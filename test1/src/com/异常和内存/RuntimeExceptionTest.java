package com.�쳣���ڴ�;
//����ʱ�쳣

public class RuntimeExceptionTest {
//���徲̬�������÷����ܳ�runtimeException
	static void OneMethod() {
		throw new RuntimeException(" from OneMethod()");
	}
	//���徲̬�������÷������ú���OneMethod
	static void TwoMethod() {
		OneMethod();
	}
	//���徲̬�������÷������ú���Twomethod
	static void ThreeMethod() {
		TwoMethod();
	}
	public static void main(String[] args) {
		//���������е���
		ThreeMethod();
	}
	
}
