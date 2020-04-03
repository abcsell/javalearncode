package com.demo1;

import java.applet.Applet;

@SuppressWarnings("serial")
public class Test1 extends Applet{
public void init() {
	System.out.println("欢迎大家进入applet程序学习页面");
}
public void start() {
	System.out.println("现在程序正在运行");
}
public void stop() {
	System.out.println("程序停止运行了。");
}
}
