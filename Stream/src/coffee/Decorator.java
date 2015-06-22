package coffee;

public class Decorator extends Coffee{
	
	public Coffee coffee;
	
	public Decorator(Coffee coffee){
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}
	
	

}
