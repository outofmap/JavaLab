package subclass;


// ���ϻ��, 1���� class�� ��ӹ��� �� �ִ�.
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
