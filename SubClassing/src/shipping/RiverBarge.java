package shipping;

public class RiverBarge extends Vehicle{

	public RiverBarge(int distance, int efficiency) {
		super(distance,efficiency);
	}
	
	public double calcTripDistance(){
		return this.distance;
	};
	public double calcFuelEfficiency(){
		return this.efficiency;
	};
}
