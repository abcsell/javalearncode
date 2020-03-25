package com.异常和内存;
//运行时异常

public class RuntimeExceptionTest {
//定义静态方法，该方法跑出runtimeException
	static void OneMethod() {
		throw new RuntimeException(" from OneMethod()");
	}
	//定义静态方法，该方法调用函数OneMethod
	static void TwoMethod() {
		OneMethod();
	}
	//定义静态方法，该方法调用函数Twomethod
	static void ThreeMethod() {
		TwoMethod();
	}
	public static void main(String[] args) {
		//在主函数中调用
		ThreeMethod();
	}
	
}
