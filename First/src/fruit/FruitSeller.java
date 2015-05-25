package fruit;

import firtst.Person;

public class FruitSeller {
	
	private int price;
	private int numberOfFruit;
	private int money;
	
	public FruitSeller(int price, int numberOfFruit, int money){
		this.price = price;
		this.numberOfFruit = numberOfFruit;
		this.money = 0;
	}
	
	public void printSeller(){
		System.out.println("남은 과일 수 :"+numberOfFruit);
		System.out.println("money :"+this.money);

	}

	public int sellFruit(int money) {
		int cnt = money / price;
		this.numberOfFruit -=cnt;
		this.money += money;
		return cnt;
	}
}
