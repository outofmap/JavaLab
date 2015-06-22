package coffee;

public class LatteCoffee extends Decorator {

	public LatteCoffee(Coffee coffee) {
		super(coffee);

	}

	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}

}
