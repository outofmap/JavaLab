package hashmap;

public class Account {

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
		return accountName + "���� ���¹�ȣ" + accountNumber + "�̰�, �ܰ��" + balance
				+ "�Դϴ�.";
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

}
