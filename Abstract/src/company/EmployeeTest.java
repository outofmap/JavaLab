package company;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		//Employee type���� list�� ������ִ�.
		
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
		//company�� singletone���� �����Ǿ��־ c�� �Ѱ����� �ʰ�, information���� �Ҽ��� �����ִ�.
	}

}
