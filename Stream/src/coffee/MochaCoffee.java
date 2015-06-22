package coffee;

public class MochaCoffee extends Decorator{

	public MochaCoffee(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing(){
		
		
		super.brewing();
		System.out.print("Adding Mocha-syrup ");
		
	}
	

}
