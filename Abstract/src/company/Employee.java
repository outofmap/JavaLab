package company;

public class Employee {
	
	public String name;
	
	public Employee(String name){
		this.name = name;
	}
	
	public String getInfo(){
		return "name:"+ name;
	}

}
