package carcompany;


public class CarComapnytest {

	public static void main(String[] args) {

		// Sonata s = new Sonata("sonata", 3000, 3);
		// Genesis g = new Genesis("Genesis", 4000, 2);
		// Grandeur gr = new Grandeur("Grandeur", 5000, 1);
		//
		// Car carList[] = { s, g, gr };
		//
		int result;
		//
		// result = Calculate.cal(carList);
		// System.out.println(result);

		Factory f = new Factory();

		f.make("sonata", 3, 3000);
		f.make("genesis", 2, 4000);
		f.make("grandeur", 1, 5000);

		System.out.println(f.getCarList().toString());


		result = Calculate.cal(f.getCarList());
		System.out.println(result);

	}

}
