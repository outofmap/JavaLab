package hyundai;

public abstract class AbstractCar {
	
	public abstract void start();
	public abstract void drive();
	public abstract void Break();
	public abstract void turnoff();
	
	public void washCar(){
		System.out.println("Wash Wash Wash");
	}
	
	public final void autoCar(){
		start();
		drive();
		Break();
		turnoff();
	}
}
