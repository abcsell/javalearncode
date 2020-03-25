package com.chouxiang;

public class Flowertest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建对象f1和f2
		Flower1 f1 = new Flower1();
		Flower1 f2 = new Flower1();
		//对象f1属性
		f1.setcolor("红色");
		f1.setname("牡丹");
		f1.setcountry("中国");
		f1.setcity("沈阳");
		//对象f2属性
		f2.setcolor("黄色");
		f2.setname("rose");
		f2.setcountry("美国");
		f2.setcity("拉斯维加斯");
		//输出对象f1和f2相应信息
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
//创建一个花的接口
interface flower{
	void setcolor(String color1);
	void setname(String name);
	String getcolor();
	String getname();
}
//创建花的类，实现flower的接口
class Flowers implements flower{
	//创建成员变量
	private String color1;
	private String name;
	//通过设置器来设置对象的参数
	public void setcolor (String color1) {
		this.color1= color1;
	}
	public void setname (String name) {
		this.name= name;
	}
	//通过访问器来获得对象的参数
	public String getcolor() {
		return color1;
	}
	public String getname() {
		return name;
	}
	//通过toString()方法来让对象以字符串形式输出
	public String toString() {
		String information="花的名称是："+name+";"+" "+"花的颜色是:"+color1;
		return information;
	}
}
//创建花的类，继承flowers类
class Flower1 extends Flowers{
	//创建成员变量
	private String country;
	private String city;
	//通过设置器来设置对象的参数
	public void setcountry(String country) {
		this.country= country;
	}
	public void setcity(String city) {
		this.city= city;
	}
	//通过访问器来获得对象的参数
	public String getcountry() {
		return country;
	}
	public String getcity() {
		return city;
	}
	//通过tostring方法来让对象以字符串的形式输出
	public String toString() {
		String information=super.toString()+"  "+"这种花出自的国家:"+country+";"+"  "+"出自的城市:"+city;
		return information;
	}
}