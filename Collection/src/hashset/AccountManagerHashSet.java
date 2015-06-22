package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class AccountManagerHashSet {

	private HashSet<Account> accounts;

	public AccountManagerHashSet() {

		this(10);

	}

	public AccountManagerHashSet(int size) {
		// size��
		accounts = new HashSet<Account>(size);
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
		// return; //matching�� �ƴٸ�, ��������.
		// }
		//
		// }

		Iterator<Account> ir = accounts.iterator();

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

		// hasNext() ? ���� ��ġ�� object�� �ִ°�?
		while (ir.hasNext()) {
			Account account = ir.next();
			System.out.println(account);

		}

	}

}
