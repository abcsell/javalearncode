package com.��װ;

public class Thread43 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//������������
				Flower1 f1= new Flower1();
				Flower1 f2= new Flower1();
				Flower1 f3= new Flower1();
				//���ö���f1
				f1.name="ĵ��";
				f1.color="��ɫ";
				f1.location="����";
				//f2
				f2.name="õ��";
				f2.color="��ɫ";
				f2.location="����";
				//f3
				f3.name="�¼�";
				f3.color="��ɫ";
				f3.location="�Ϻ�";
				//�����Ӧ��Ϣ
				System.out.println(f1.toString());
				System.out.println(f2.toString());
				System.out.println(f3.toString());
				//Flower���У����еı�����˽�б�����Ҳ���Ǳ����װ�ˣ�ֻ�����еķ������Է������ǣ��ⲿ��������Ҳ�޷����ʣ�
				//���Ժܰ�ȫ
	}

}

class Flower1{
	//�������ڻ�������
//	private String name;
//	private String color;
//	private String location;
	//���������Ա�Ϊ���б�������
	public String name;
	public String color;
	public String location;
	//�������Ե�������
	public void setname(String name) {
		this.name = name;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public void setlocation(String location) {
		this.location=location;
	}
	//�������Եķ�����
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public String getlocation() {
		return location;
	}
	public String toString() {  //��дtoString()����
		String infor= "��������:"+name+";"+" "+"������ɫ:"+color+";"+" "+"���ĳ�����:"+location+"   ";
		return infor;
	}
}
