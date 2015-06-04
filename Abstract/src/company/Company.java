package company;

import java.util.ArrayList;

public class Company {
	//company�� new �� ���� �����Ƿ� single tone���� �����.
	
	private ArrayList<Employee> eList = new ArrayList<Employee>();
	
	private static Company instance = new Company();
	
	private Company(){}
	
	public static Company getInstance(){
		return instance;
	}
	
	public void addEmployee(Employee e){
		//private������ ���� �־��ش�.
		eList.add(e);
	}

	public ArrayList<Employee> geteList() {
		return eList;
	}
	
	
}
