package com.��װ;

public class Thread44{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//������������
		Flower2 f1= new Flower2();
		Flower2 f2= new Flower2();
		Flower2 f3= new Flower2();
		//���ö���f1
		f1.setname("ĵ��");
		f1.setcolor("��ɫ");
		f1.setlocation("����");
		//f1.print("ĵ��");   ˽�з������޷�ʹ��
		//f2
		f2.setname("õ��");
		f2.setcolor("��ɫ");
		f2.setlocation("����");
		//f3
		f3.setname("�¼�");
		f3.setcolor("��ɫ");
		f3.setlocation("�Ϻ�");
		//�����Ӧ��Ϣ
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}

}
class Flower2{
	//�������ڻ�������
	private String name;
	private String color1;
	private String location;
	//�������Ե�������
	public void setname(String name) {
		this.name = name;
	}
	public void setcolor(String color1) {
		this.color1 = color1;
	}
	public void setlocation(String location) {
		this.location=location;
	}
	//�������Եķ�����
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color1;
	}
	public String getlocation() {
		return location;
	}
	private void print() {
		System.out.println("�������"+name);   //�����������
	}
	public String toString() {  //��дtoString()����
		String infor= "��������:"+name+";"+" "+"������ɫ:"+color1+";"+" "+"���ĳ�����:"+location+"   ";
		print();    //���÷���print() 
		return infor;
	}
}
