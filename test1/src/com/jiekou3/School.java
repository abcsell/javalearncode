package com.jiekou3;

public interface School {
	//接口中包括了很多方法，但是都没有实现，既没有函数体
	void setschoolname(String schoolname);
	void setclassname(String schoolclassname);
	void setname(String name);
	void setcode(String code);
	void setsexy(String sexy);
	void setbirthday(String birthday);
	void setfamilyaddress(String familyaddress);
	String getschoolname();
	String getclassname();
	String getname();
	String getcode();
	String getsexy();
	String getbirthday();
	String getfamilyaddress();
}
