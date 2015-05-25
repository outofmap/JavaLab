package fruit;

public class FruitTest {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000);
		
		FruitSeller seller_lower = new FruitSeller(100, 200, 0);
		FruitSeller seller_higher = new FruitSeller(500, 200, 0);
		
		buyer.buyFruit(seller_lower,1000);
		buyer.printBuyer();
		seller_lower.printSeller();
		
		buyer.buyFruit(seller_higher,1000);
		buyer.printBuyer();
		seller_higher.printSeller();
	}

}
