package thread;

class Bank {

	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int money) {

		int m = this.getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.setMoney(m + money);
	}

	public synchronized void minusMoney(int money) {
		int m = this.getMoney();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.setMoney(m - money);
	}
}

class Park extends Thread{
	
	public void run(){
		
		//Lock mybank
		synchronized (SyncMain.myBank) {
			SyncMain.myBank.saveMoney(3000);
			System.out.println("saveMoney:" + SyncMain.myBank.getMoney());
			
		}
		
	}
}

class Parkwife extends Thread{
	
	public void run(){
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney:" + SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		Parkwife pw = new Parkwife();
		
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.start();
		
	}

}
