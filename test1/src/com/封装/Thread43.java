package com.封装;

public class Thread43 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建三个对象
				Flower1 f1= new Flower1();
				Flower1 f2= new Flower1();
				Flower1 f3= new Flower1();
				//设置对象f1
				f1.name="牡丹";
				f1.color="红色";
				f1.location="长安";
				//f2
				f2.name="玫瑰";
				f2.color="蓝色";
				f2.location="北京";
				//f3
				f3.name="月季";
				f3.color="黄色";
				f3.location="上海";
				//输出相应信息
				System.out.println(f1.toString());
				System.out.println(f2.toString());
				System.out.println(f3.toString());
				//Flower类中，所有的变量是私有变量，也就是被类封装了，只有类中的方法可以访问它们，外部看不到，也无法访问，
				//所以很安全
	}

}

class Flower1{
	//创建关于花的属性
//	private String name;
//	private String color;
//	private String location;
	//将变量属性变为公有变量即可
	public String name;
	public String color;
	public String location;
	//关于属性的设置器
	public void setname(String name) {
		this.name = name;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public void setlocation(String location) {
		this.location=location;
	}
	//关于属性的访问器
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public String getlocation() {
		return location;
	}
	public String toString() {  //重写toString()方法
		String infor= "花的名称:"+name+";"+" "+"花的颜色:"+color+";"+" "+"花的出产地:"+location+"   ";
		return infor;
	}
}
