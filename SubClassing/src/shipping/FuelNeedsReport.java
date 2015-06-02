package shipping;

import java.util.ArrayList;

public class FuelNeedsReport {

	public double generateReport(ArrayList<Vehicle> v) {
		double total = 0;
		for (int j = 0; j < v.size(); j++) {
			total += calcFuelNeeds(v.get(j));
		}
		
		return total;
	}

	public final double calcFuelNeeds(Vehicle v) {
		return v.calcTripDistance() / v.calcFuelEfficiency();
	}
}
