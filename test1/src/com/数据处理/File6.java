package com.数据处理;

import java.util.Random;

//剪刀石头布的一个小游戏
public class File6 {

	public static void main(String[] args) {
	try {
		
	
		// 创建一个随机类
		Random rnd = new Random();
		//创建变量
		@SuppressWarnings("unused")
		int i=0;
		String[] hand = {"剪子","锤子","包"};
		//输出相应信息
		System.out.println("开始游戏了");
		System.out.print("剪子（0），锤子（1），包（2）中，选择哪一个呢？");
		//获取输入值
		int c = System.in.read();
		System.out.println("<结果>");
		//通过分支语句来输出不同的结果
		switch(c) {
		case '0':
			System.out.println("玩家："+hand[0]);
			break;
		case '1':
			System.out.println("玩家："+hand[1]);
			break;
		case '2':
			System.out.println("玩家："+hand[2]);
			break;
		}
		int b = rnd.nextInt(3);//获取一个随机数
		System.out.println("计算机:"+hand[b]);
		if(c=='0' & b==2) {
			System.out.println("玩家胜利！");
			System.out.println("比分:1:0");
		}else if (c=='2' & b==0) {
			System.out.println("计算机胜利！");
			System.out.println("比分:0:1");
		}else if((c-48)>b) {//当大于b
			System.out.println("玩家胜利！");
			System.out.println("比分:1:0");
		}else if((c-48)<b) {//当小于b
			System.out.println("计算机胜利！");
			System.out.println("比分:0:1");
		}else if((c-48)==b) {//当=于b
			System.out.println("平手！");
			System.out.println("比分:0:0");
		}//书上的不对，虽然试出来了，但是不明白为什么要减去48，为什么c是字符串了
	}catch(Exception e) {
		
	}
	}

}
