package singleton;
// 여러개의 인스턴스가 필요없는 경우 
public class Company {
	private int employee_number;
	private static Company instance = new Company();
	
	private Company(){
	}
	
	public static Company getInstance(){
		
		if(instance == null)								//instance가 생성이 안되었다면
			instance = new Company();
		return instance;
	}
	public int getEmployee_number() {
		return employee_number;
	}

	public void setEmployee_number(int employee_number) {
		this.employee_number = employee_number;
		test();
	}
	
	int mynum = 10;
	
	public void test(){
		
		
	}
}
