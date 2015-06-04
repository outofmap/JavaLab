package company;

public class Manager extends Employee{
	
	public String department;
	
	public Manager(String name,String department){
		super(name);
		//this.name = name;
		this.department = department;
	}
	public String getInfo(){
		return "name:" + name +"  "+"department:"+department;
	}
}
