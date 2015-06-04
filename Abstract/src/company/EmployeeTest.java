package company;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		//Employee type으로 list를 만들수있다.
		
//		ArrayList<Employee> list = new ArrayList<Employee>();
		
//		Employee e = new Employee();
//		list.add(e);
//		
//		list.get(0);
//		
//		Employee e1 = (Employee)list.get(0);
		
		
		Secretary s1 = new Secretary("James", "Rora");
		Manager m1 = new Manager("Edward", "Personal");
		
		Company c = Company.getInstance();
		c.addEmployee(s1);
		c.addEmployee(m1);
		
		Information info = new Information();
		info.showEmployee();
		//company는 singletone으로 구현되어있어서 c를 넘겨주지 않고, information에서 불서서 쓸수있다.
	}

}
