package test;

import java.util.Date;

public class Employee {
	
	String name;
	double salary;
	Date birthday;
	
	Employee(){};
	Employee(String name){
		this.name = name;
	}
	
	Employee(String name,double salary,Date birthday){
		this.name=name;
		this.salary=salary;
		this.birthday=birthday;
	}
	
	public String getDetail(){
		
		return name+","+salary;
	}

}
