package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new Americano();
		americano.brewing();
		
		System.out.println();
		Coffee latte = new LatteCoffee(new Americano());
		latte.brewing();
		
		System.out.println();
		Coffee mocha = new MochaCoffee(new LatteCoffee(new Americano()));
		mocha.brewing();
		
		System.out.println();
		Coffee whipping = new WhippedCreamCoffee(new MochaCoffee(new LatteCoffee(new Americano())));
		whipping.brewing();
		
	}

}
