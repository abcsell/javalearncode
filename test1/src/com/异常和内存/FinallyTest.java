package com.�쳣���ڴ�;
@SuppressWarnings("serial")
class MyNewException extends Exception{}
public class FinallyTest {
	static int counter=0;//����һ��������
	public static void main(String[] args) {
		//��try�������һ������ѭ���ڣ�ÿ��ѭ������������ֵ�������ֵС�ڻ����2����
		//���Զ�����쳣�������������ֵ����2�����ӡ"No Exception"������finally�Ӿ���������
		 //���Ӿ䣬�����ֵ����2����ֹ����
		while(true) {
			try {
				if(counter++<2)
					throw new MyNewException();
				System.out.println("No Exception");
			}catch(MyNewException ex) {
				System.out.println("MyNewException happened");
			}
			//finally�Ӿ������Ƿ��ܳ��쳣����ִ��
			finally {
				System.err.println("finally is called");
				//�ж��Ƿ��˳�����ÿ��ѭ�������ж�
				if(counter>2) {
					System.out.println("ѭ����["+counter+"]��");
					break;
				}
			}
		}
		//һ��ִ��finally�Ӿ��е�break�Ӿ䣬���˳�whileѭ��������ص�28�д��봦����ִ��
		System.out.println("�˳�whileѭ��");
		
	}
}
