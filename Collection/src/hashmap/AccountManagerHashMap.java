package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class AccountManagerHashMap {

	private HashMap<String, Account> accounts; //<key data type, value data type>

	public AccountManagerHashMap() {

		this(10);

	}

	public AccountManagerHashMap(int size) {
		// size��
		accounts = new HashMap<String, Account>();
	}

	public void insertAccount(float balance, String accountNumber,
			String accountName) {

		accounts.put(accountNumber, new Account(balance, accountNumber,
				accountName));

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

		// Iterator ir = accounts.iterator();
		//
		// while (ir.hasNext()) {
		// Account account = (Account) ir.next();
		// String tempNumber = account.getAccountNumber();
		//
		// if (accountNumber.equals(tempNumber)) {
		// account.deposite(money);
		// return;
		// }
		//
		// }

		Account account = accounts.get(accountNumber);
		
		if (account != null) {
			account.deposite(money);
			return;
		}
		System.out.println("There is no account.");

	}

	public void displayAll() {
		
		//key �������� ���ͼ�, iterator��밡��. 
		Iterator<String> ir = accounts.keySet().iterator();

		// hasNext() ? ���� ��ġ�� object�� �ִ°�?
		while (ir.hasNext()) {
			
			String key = ir.next();
			System.out.println(accounts.get(key));

		}

	}

}
