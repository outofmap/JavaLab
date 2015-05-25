package test;

import java.util.Date;

public class Secretary extends Employee{
	String boss;
	
	Secretary(){}
	Secretary(String name, double salary, Date birthday,String boss) {
		super(name,salary,birthday);
		this.boss = boss;
	}
	
	public String getDetail(){
		return super.getDetail()+","+boss;
		
	}
	
	public void test(){
		System.out.println("test");
	}
	
}
