package com.��װʵ��;

public class Thread45 {		//��������

	public static void main(String[] args) throws Exception{	//������
		// TODO �Զ����ɵķ������
		//��������ѧ���ش����Ķ���
		Studentanswer sa1= new Studentanswer();
		Studentanswer sa2= new Studentanswer();
		Studentanswer sa3= new Studentanswer();
		Studentanswer sa4= new Studentanswer();
		Studentanswer sa5= new Studentanswer();
		Studentanswer sa6= new Studentanswer();
		Studentanswer sa7= new Studentanswer();
		Studentanswer sa8= new Studentanswer();
		//����������ʦ�������ݵĶ���
		Teacherask ta1=new Teacherask();
		Teacherask ta2=new Teacherask();
		Teacherask ta3=new Teacherask();
		Teacherask ta4=new Teacherask();
		Teacherask ta5=new Teacherask();
		Teacherask ta6=new Teacherask();
		Teacherask ta7=new Teacherask();
		Teacherask ta8=new Teacherask();
		//��������ѧ���ش�������
		Studentanswer[] stt=new Studentanswer[] {sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa8};
		//����������ż��ʾ������������
		Teacherask[] stt1=new Teacherask[] {ta1,ta2,ta3,ta4,ta5,ta6,ta7,ta8};
		try {
			//ͨ��һ��ѭ����佫���󼯺���Ԫ������������ǰ��߳����з�ʽ��������
			for(int x=0; x<8;x++) {
				//ͨ������������������
				stt[x].set("����", "22", "�廪��ѧ", "�Զ���ϵ���꼶", "3", "7", "54");
				stt1[x].set("����ʦ");
				stt1[x].setint(x);
				stt[x].setint(x);
				//�����߳�
				stt1[x].start();
				stt[x].start();
			}
		}catch(Exception e) {			//����֣�Ϊʲô�̻߳���
			
		}

	}

}
