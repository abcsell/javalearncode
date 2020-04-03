package com.demo1;

import java.applet.*;


@SuppressWarnings("serial")
public class Test2 extends Applet{
	AudioClip voice;
	public void init() {
		voice = getAudioClip(getCodeBase(),"zap8.wav");
	}
	public void start() {
		voice.loop();
	}
	public void stop() {
		voice.stop();
	}
}
