package com.inputoutput;
import java.io.*;
public class File16 {
	//��read1�����У��Դ����������������Ϊ����������Ҫ������������������ȡ����
	public void read1(BufferedReader br) {
		try {
			System.out.println(br.readLine());//���еķ�����ȡ
		}catch(Exception e) {
			
		}
	}
	//��write1�����У��Դ���������������Ϊ����������Ҫ����������������
	//д�����ݵ�f����
	public void write1(String str, BufferedWriter bw) {
		if(str.length()>5) {
			try {
				bw.write(str);
				bw.newLine();
				bw.flush();
			}catch(Exception e) {
				
			}
		}else if((str.length()<5)) {//�������������5�������������5����д������󣬵���5��û�д���
			try {
				bw.write("��������");
				bw.newLine();
				bw.flush();
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) throws Exception{//������
		File16 f2 = new File16();//��������
		File f = new File("d:\\filetest","2.txt");//�����ļ������
		//����Ҫ���ļ����������fos
		FileOutputStream fos = new FileOutputStream(f);
		//����һ���ļ�����������fis
		FileInputStream fis = new FileInputStream(f);
		//����һ�����ֽڵ����������osw
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//����һ�����ֽڵ�����������isr
		InputStreamReader isr = new InputStreamReader(fis);
		//����һ�����л�������������bw
		BufferedWriter bw  =new BufferedWriter(osw);
		//����һ�������������������br
		BufferedReader br = new BufferedReader(isr);
		//ͨ��bw������д�뵽f2��
		f2.write1("����Ǹ���԰", bw);
		f2.write1("С��˵����", bw);
		f2.write1("���վ���С��˵��û��", bw);
		f2.write1("лл��", bw);
		f2.write1("���վ����Լ���ǰ�ĺ�����������", bw);
		//ͨ��br��f2�н����ݶ�����
		f2.read1(br);
		f2.read1(br);
		f2.read1(br);
		f2.read1(br);
		f2.read1(br);
		//�رն���
		br.close();
		bw.close();
	}
}
