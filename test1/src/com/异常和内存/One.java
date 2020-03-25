package com.异常和内存;
//自定义异常
public class One {

	public static void main(String[] args) throws ServerTimedOutException{
		// TODO 自动生成的方法存根
		try {
			//抛出异常
			throw new ServerTimedOutException("Could not connect",80);
		}catch(ServerTimedOutException e) {//处理异常
			System.out.println("异常信息是:"+e.toString());
		}
	}

}
class ServerTimedOutException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3131963467680614806L;
	//创建成员变量
	private String reason;
	private int port;
	//创建构造函数
	public ServerTimedOutException (String reason, int port) {
		this.reason=reason;
		this.port=port;
	}
	public String getReason() {
		return reason;//关于变量reason的设置器
	}
	public int getPort() {
		return port;//关于变量port的设置器
	}
}