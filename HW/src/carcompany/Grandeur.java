package carcompany;

public class Grandeur extends Car{
	public Grandeur() {
	};
	
	Grandeur(int price){
		this.price = price;
		
	}
	Grandeur(String brand,int price,int number){
		this.brand = brand;
		this.price = price;
		this.number = number;
		
	}
}
