package com.jicheng;

public class Studenttest {			//	��������

	public static void main(String[] args) {		//������
		// TODO �Զ����ɵķ������
		//ͨ�������������sc��sm��sc1����������
		Studentclass sc=new Studentclass();
		Studentclass sm =new Studentclass();
		Studentclass sc1=new Studentclass(); //������ֻ�ܲٿظ�����û�б����า�ǵķ���
		//ͨ��set������������3������Ĳ���
		sc.set("����","1","��");
		sc.set(90.5);
		sm.set("�Ž�","2","��");
		sm.set(99.0);
	//	sm.set("�೤");
		//ͨ��toString��������3���������ַ�����ʽ���
		System.out.println(sc.toString());
		System.out.println(sm.toString());
		//�޸Ķ���sc1����Ӧ����
		sc1.set("����","3","Ů");
		sc1.set(100);
		System.out.println(sc1.toString());//ͨ��tostring�������
	}

}
class Studentclass{			//ѧ����
	String name;			//����
	String code;			//ѧ��
	String sexy;				//�Ա�
	double achievement;		//�ɼ�
	//ͨ������������������ѧ�š��Ա𡢳ɼ��Ȳ���
	public void set(String name, String code, String sexy) {
		this.name=name;
		this.code=code;
		this.sexy=sexy;
	}
	//���ڷ���set()�Ķ�̬
	public void set(double achievement) {
		this.achievement=achievement;
	}
	public String getname() {  //��ȡ���Ե�ֵ
		return name;
	}
	public String getcode() {
		return code;
	}
	public String getsexy() {
		return sexy;
	}
	public double getachi() {
		return achievement;
	}
	public String toString() {    //ͨ��tostring�����ö������ַ�����ʽ���
		String infor="ѧ������:"+name+" " + "ѧ�ţ�" + code +" " +"�Ա�"+sexy+" "+"�ɼ�:"+achievement;
		return infor;  //�����ַ�������infor
	}
}






















