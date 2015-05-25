package carcompany;

public class Genesis extends Car {
	Genesis(){};
	
	Genesis(int price){
		this.price = price;
	};
	
	Genesis(String brand,int price,int number){
		this.brand = brand;
		this.price = price;
		this.number = number;
		
	}
}
