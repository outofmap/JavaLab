package fruit;

public class FruitBuyer {
	private int money;
	private int fruit_cnt;
	
	public FruitBuyer(int money){
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getFruit_cnt() {
		return fruit_cnt;
	}
	public void setFruit_cnt(int fruit_cnt) {
		this.fruit_cnt = fruit_cnt;
	}
	public void buyFruit(FruitSeller seller, int money) {
		int cnt = seller.sellFruit(money);
		fruit_cnt += cnt;
		this.money -= money;
		
	}
	
	public void printBuyer(){
		System.out.println("구입한 과일 수 :"+fruit_cnt);
		System.out.println("money :"+this.money);

	}

}


