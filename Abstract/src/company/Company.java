package company;

import java.util.ArrayList;

public class Company {
	//company는 new 될 일이 없으므로 single tone으로 만든다.
	
	private ArrayList<Employee> eList = new ArrayList<Employee>();
	
	private static Company instance = new Company();
	
	private Company(){}
	
	public static Company getInstance(){
		return instance;
	}
	
	public void addEmployee(Employee e){
		//private변수에 값을 넣어준다.
		eList.add(e);
	}

	public ArrayList<Employee> geteList() {
		return eList;
	}
	
	
}
