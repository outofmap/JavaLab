package treeset;

import java.util.Comparator;

public class Account implements Comparator<Account>{

	private float balance;
	private String accountNumber;
	private String accountName;

	public Account() {
	}

	public Account(float balance, String accountNumber, String accountName) {
		this.balance = balance;
		this.accountName = accountName;
		this.accountNumber = accountNumber;

	}

	public void deposite(float money) {
		if (money > 0) {
			balance += money;
		} else {
			System.out.println("not enough money");
		}
	}

	public void withdraw(float money) {
		if (balance >= money) {
			balance -= money;
		} else {
			System.out.println("not enough money");
		}
	}

	public String toString() {
		return accountName + "´ÔÀÇ °èÁÂ¹øÈ£" + accountNumber + "ÀÌ°í, ÀÜ°í´Â" + balance
				+ "ÀÔ´Ï´Ù.";
	}

	public float getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	@Override
	public int compare(Account acc1, Account acc2) {
		
		return acc1.getAccountNumber().compareTo(acc2.getAccountNumber());
		
	}
	
	Map

	
	
	

}
