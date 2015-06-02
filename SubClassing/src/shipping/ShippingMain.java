package shipping;


public class ShippingMain {

	public static void main(String[] args) {
		
		Company company = Company.getCompany();
		
		company.addVehicle(new Truck(500,50)); 					//distance,efficiency 10
		company.addVehicle(new RiverBarge(100,20));				//5
		company.addVehicle(new RiverBarge(300,10));				//30
		company.addVehicle(new Truck(200,10));		//20
		company.addVehicle(new Truck(100,10));		//10
		
		FuelNeedsReport report = new FuelNeedsReport();					//계산하는 함수
		System.out.println(report.generateReport(Company.list)); // 75
	}

}
