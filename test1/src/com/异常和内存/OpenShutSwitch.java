package com.异常和内存;
//开关模型
public class OpenShutSwitch {
	//创建一个静态开关模型对象，该对象在该类中可以不通过对象实例而直接调用
	static Switch sw = new Switch();
	//创建静态方法，该方法跑出两个自定义异常
	static void f() throws OpenShutException1, OpenShutException2{}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//try区块内代码执行开关模型的带宽操作，然后调用方法f,最后关闭打开资源
		try {
			sw.open();
			f();
			
		}catch(OpenShutException1 e1) {
			System.err.println("OpenShutException1");
		}catch(OpenShutException2 e2) {
			System.err.println("OpenShutException2");
			//将关闭资源操作放在finally子句中，且该子句内的代码总会获得执行
		}finally {
			sw.shut();
		}
	}

}
//定义开关类，该类定义两个函数，一个是打开操作，一个是关闭操作
class Switch{
	boolean state = false;
	boolean read() {return state;}
	void open() {state=true;}
	void shut() {state=false;}
}
//自定义两个异常类
@SuppressWarnings("serial")
class OpenShutException1 extends Exception{}
@SuppressWarnings("serial")
class OpenShutException2 extends Exception{}
//定义执行模型程序的主类





