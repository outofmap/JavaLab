package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		//Company.instance = null;
		
		//Company company = new Company();
		//Company company2 = new Company();
		
		System.out.println(c1 == c2);
	}

}
