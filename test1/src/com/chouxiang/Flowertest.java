package com.chouxiang;

public class Flowertest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��������f1��f2
		Flower1 f1 = new Flower1();
		Flower1 f2 = new Flower1();
		//����f1����
		f1.setcolor("��ɫ");
		f1.setname("ĵ��");
		f1.setcountry("�й�");
		f1.setcity("����");
		//����f2����
		f2.setcolor("��ɫ");
		f2.setname("rose");
		f2.setcountry("����");
		f2.setcity("��˹ά��˹");
		//�������f1��f2��Ӧ��Ϣ
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
//����һ�����Ľӿ�
interface flower{
	void setcolor(String color1);
	void setname(String name);
	String getcolor();
	String getname();
}
//���������࣬ʵ��flower�Ľӿ�
class Flowers implements flower{
	//������Ա����
	private String color1;
	private String name;
	//ͨ�������������ö���Ĳ���
	public void setcolor (String color1) {
		this.color1= color1;
	}
	public void setname (String name) {
		this.name= name;
	}
	//ͨ������������ö���Ĳ���
	public String getcolor() {
		return color1;
	}
	public String getname() {
		return name;
	}
	//ͨ��toString()�������ö������ַ�����ʽ���
	public String toString() {
		String information="���������ǣ�"+name+";"+" "+"������ɫ��:"+color1;
		return information;
	}
}
//���������࣬�̳�flowers��
class Flower1 extends Flowers{
	//������Ա����
	private String country;
	private String city;
	//ͨ�������������ö���Ĳ���
	public void setcountry(String country) {
		this.country= country;
	}
	public void setcity(String city) {
		this.city= city;
	}
	//ͨ������������ö���Ĳ���
	public String getcountry() {
		return country;
	}
	public String getcity() {
		return city;
	}
	//ͨ��tostring�������ö������ַ�������ʽ���
	public String toString() {
		String information=super.toString()+"  "+"���ֻ����ԵĹ���:"+country+";"+"  "+"���Եĳ���:"+city;
		return information;
	}
}