package subclass;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "James";
		m.salary = 1000000.0;
		m.department = "personal";
		
		System.out.println(m.getDetail());
	}

}
