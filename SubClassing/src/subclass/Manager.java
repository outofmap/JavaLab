package subclass;


// 단일상속, 1개의 class만 상속받을 수 있다.
public class Manager extends Employee{
	
	public String department;
	
	public Manager(){
		
		System.out.println("Manager() called");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void test(){
		salary = 1000.0;
	}
}
