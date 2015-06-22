package coffee;

public class WhippedCreamCoffee extends Decorator{

	public WhippedCreamCoffee(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing(){
		super.brewing();
		System.out.println("Adding Whipping Cream ");
	}
	

}
