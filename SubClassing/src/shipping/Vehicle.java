package shipping;

public abstract class Vehicle {
	public int distance;
	public int efficiency;

	public Vehicle(int distance, int efficiency) {
		this.distance = distance;
		this.efficiency = efficiency;
	}

	public Vehicle() {
	};

	public abstract double calcTripDistance();

	public abstract double calcFuelEfficiency();
	
	

}
