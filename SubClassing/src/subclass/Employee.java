package subclass;

public class Employee {
	
	public String name; 
	public String sabun;
	protected double salary; 
	//protected : child class에서는 쓸수있다. 외부에서는 못쓴다.
	
	public String getDetail(){
		
		return name+","+sabun+","+salary;
	}
	public Employee(){
		System.out.println("Employee()");
	}

}
