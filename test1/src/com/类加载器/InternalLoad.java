package com.�������;

public class InternalLoad {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("-----------------------");
		//internaload�������������
		System.out.println("InternalLoad�������������:"+InternalLoad.class.getClassLoader().getClass().getName());
		System.out.println("-----------------------");
		//system�������������
		System.out.println("System�������������:"+System.class.getClassLoader());
		//��ȡInternalload�������
		ClassLoader load = InternalLoad.class.getClassLoader();
		System.out.println("------------------------");
		//����Internalload�������
		while (load !=null) {
			System.out.println(load.getClass().getName());
			load=load.getParent();
		}
		System.out.println(load);
	}

}
