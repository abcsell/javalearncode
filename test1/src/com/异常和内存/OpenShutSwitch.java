package com.�쳣���ڴ�;
//����ģ��
public class OpenShutSwitch {
	//����һ����̬����ģ�Ͷ��󣬸ö����ڸ����п��Բ�ͨ������ʵ����ֱ�ӵ���
	static Switch sw = new Switch();
	//������̬�������÷����ܳ������Զ����쳣
	static void f() throws OpenShutException1, OpenShutException2{}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//try�����ڴ���ִ�п���ģ�͵Ĵ��������Ȼ����÷���f,���رմ���Դ
		try {
			sw.open();
			f();
			
		}catch(OpenShutException1 e1) {
			System.err.println("OpenShutException1");
		}catch(OpenShutException2 e2) {
			System.err.println("OpenShutException2");
			//���ر���Դ��������finally�Ӿ��У��Ҹ��Ӿ��ڵĴ����ܻ���ִ��
		}finally {
			sw.shut();
		}
	}

}
//���忪���࣬���ඨ������������һ���Ǵ򿪲�����һ���ǹرղ���
class Switch{
	boolean state = false;
	boolean read() {return state;}
	void open() {state=true;}
	void shut() {state=false;}
}
//�Զ��������쳣��
@SuppressWarnings("serial")
class OpenShutException1 extends Exception{}
@SuppressWarnings("serial")
class OpenShutException2 extends Exception{}
//����ִ��ģ�ͳ��������





