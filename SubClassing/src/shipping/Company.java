package shipping;

import java.util.ArrayList;

public class Company{
	
	private static Company c = new Company();
	
	private Company(){};
	
	public static Company getCompany(){
		return new Company();
	}
	
	public static ArrayList<Vehicle> list = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		list.add(vehicle);
		
	}
	

}
