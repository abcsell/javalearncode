package com.���ݴ���;

import java.util.Random;

//�˿���Ϸ����
public class File5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			Random rnd = new Random();//����һ����������
			//����һ���ַ������͵�����
			String[] card = {"����1","����2","����3","����4","����5","����6","����7","����8","����9"};
			//��������ѭ���ĸ��ֱ���
			String str;
			int x,y;
			//ͨ��ѭ����䣬���̴�������ȡ���������󣬶�����бȽϺ�����
			for(int i=0;i<100; i++) {
				x = rnd.nextInt(9);
				y = rnd.nextInt(9);
				str = card[x];
				card[x] = card[y];
				card[y] = str;
			}
			//ͨ��ѭ����䣬���̵������Ϣ
			for(int i=0;i<9 ; i++) {
				System.out.println(card[i]);
			}
		}catch(Exception e) {
			
		}
	}

}
