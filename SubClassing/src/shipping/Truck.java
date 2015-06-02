package shipping;

public class Truck extends Vehicle{

	public Truck(int distance, int efficiency) {
		super(distance, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	public double calcTripDistance(){
		return this.distance;
	};
	public double calcFuelEfficiency(){
		return this.efficiency;
	};
}
