package com.封装;

public class Thread42 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建三个对象
		Flower f1= new Flower();
		Flower f2= new Flower();
		Flower f3= new Flower();
		//设置对象f1
		f1.setname("牡丹");
		f1.setcolor("红色");
		f1.setlocation("长安");
		//f2
		f2.setname("玫瑰");
		f2.setcolor("蓝色");
		f2.setlocation("北京");
		//f3
		f3.setname("月季");
		f3.setcolor("黄色");
		f3.setlocation("上海");
		//输出相应信息
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}

}
class Flower{
	//创建关于花的属性
	private String name;
	private String color1;
	private String location;
	//关于属性的设置器
	public void setname(String name) {
		this.name = name;
	}
	public void setcolor(String color1) {
		this.color1 = color1;
	}
	public void setlocation(String location) {
		this.location=location;
	}
	//关于属性的访问器
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color1;
	}
	public String getlocation() {
		return location;
	}
	public String toString() {  //重写toString()方法
		String infor= "花的名称:"+name+";"+" "+"花的颜色:"+color1+";"+" "+"花的出产地:"+location+"   ";
		return infor;
	}
}