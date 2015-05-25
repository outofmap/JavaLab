package test;

import java.util.Date;

public class SecretaryTest {

	public static void main(String[] args) {
		
		Date sDate = new Date(31,3,1988);
		Secretary secretary = new Secretary("Dorothy", 1000.0,sDate,"Rora");
		
//		System.out.println(secretary.name);
//		System.out.println(secretary.salary);
		System.out.println(secretary.getDetail());
		
		Employee e = new Employee();
		System.out.println(e.getDetail());
		
		Secretary s = new Secretary();
		System.out.println(s.getDetail());
		
		Employee se = new Secretary();
		System.out.println(se.getDetail());
		
		Employee sm = new Manager();
		System.out.println(sm.getDetail());	 		
		// overriding한 Manager의 getDetail을 불러온다면,
		// sm.하고 Department를 가져올수 있나요????sm은 Employee인데 
		
	}
}
