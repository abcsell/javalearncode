package com.�쳣���ڴ�;
//�Զ����쳣
public class One {

	public static void main(String[] args) throws ServerTimedOutException{
		// TODO �Զ����ɵķ������
		try {
			//�׳��쳣
			throw new ServerTimedOutException("Could not connect",80);
		}catch(ServerTimedOutException e) {//�����쳣
			System.out.println("�쳣��Ϣ��:"+e.toString());
		}
	}

}
class ServerTimedOutException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3131963467680614806L;
	//������Ա����
	private String reason;
	private int port;
	//�������캯��
	public ServerTimedOutException (String reason, int port) {
		this.reason=reason;
		this.port=port;
	}
	public String getReason() {
		return reason;//���ڱ���reason��������
	}
	public int getPort() {
		return port;//���ڱ���port��������
	}
}