package com.���ݴ���;

import java.util.Random;

//����ʯͷ����һ��С��Ϸ
public class File6 {

	public static void main(String[] args) {
	try {
		
	
		// ����һ�������
		Random rnd = new Random();
		//��������
		@SuppressWarnings("unused")
		int i=0;
		String[] hand = {"����","����","��"};
		//�����Ӧ��Ϣ
		System.out.println("��ʼ��Ϸ��");
		System.out.print("���ӣ�0�������ӣ�1��������2���У�ѡ����һ���أ�");
		//��ȡ����ֵ
		int c = System.in.read();
		System.out.println("<���>");
		//ͨ����֧����������ͬ�Ľ��
		switch(c) {
		case '0':
			System.out.println("��ң�"+hand[0]);
			break;
		case '1':
			System.out.println("��ң�"+hand[1]);
			break;
		case '2':
			System.out.println("��ң�"+hand[2]);
			break;
		}
		int b = rnd.nextInt(3);//��ȡһ�������
		System.out.println("�����:"+hand[b]);
		if(c=='0' & b==2) {
			System.out.println("���ʤ����");
			System.out.println("�ȷ�:1:0");
		}else if (c=='2' & b==0) {
			System.out.println("�����ʤ����");
			System.out.println("�ȷ�:0:1");
		}else if((c-48)>b) {//������b
			System.out.println("���ʤ����");
			System.out.println("�ȷ�:1:0");
		}else if((c-48)<b) {//��С��b
			System.out.println("�����ʤ����");
			System.out.println("�ȷ�:0:1");
		}else if((c-48)==b) {//��=��b
			System.out.println("ƽ�֣�");
			System.out.println("�ȷ�:0:0");
		}//���ϵĲ��ԣ���Ȼ�Գ����ˣ����ǲ�����ΪʲôҪ��ȥ48��Ϊʲôc���ַ�����
	}catch(Exception e) {
		
	}
	}

}
