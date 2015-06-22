package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountManagerAarrayList {

	private ArrayList<Account> accounts;

	public AccountManagerAarrayList() {

		this(10);

	}

	public AccountManagerAarrayList(int size) {
		// size을
		accounts = new ArrayList<Account>(size);
	}

	public void insertAccount(float balance, String accountNumber,
			String accountName) {

		accounts.add(new Account(balance, accountNumber, accountName));

	}

	public void setDeposite(String accountNumber, float money) {

		// for (int i = 0; i < accounts.size(); i++) {
		// Account account = accounts.get(i);
		// String tempNumber = account.getAccountNumber();
		// if (accountNumber.equals(tempNumber)) {
		// account.deposite(money);
		// return; //matching이 됐다면, 빠져나감.
		// }
		//
		// }

		Iterator ir = accounts.iterator();

		while (ir.hasNext()) {
			Account account = (Account) ir.next();
			String tempNumber = account.getAccountNumber();

			if (accountNumber.equals(tempNumber)) {
				account.deposite(money);
				return;
			}

		}

		System.out.println("There is no account.");

	}

	public void displayAll() {
		Iterator<Account> ir = accounts.iterator();

		// hasNext() ? 현재 위치에 object가 있는가?
		while (ir.hasNext()) {
			Account account = ir.next();
			System.out.println(account);

		}

	}

}
