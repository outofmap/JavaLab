package test;

import java.util.Date;

public class Manager extends Employee {
	
	Manager(){}
	
	Manager(String name, double salary, Date birthday) {
		super(name, salary, birthday);
	}
	public String department;
	
	public String getDetail(){
		
		return super.getDetail()+","+department;
	}

}
