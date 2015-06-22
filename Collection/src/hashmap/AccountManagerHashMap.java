package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class AccountManagerHashMap {

	private HashMap<String, Account> accounts; //<key data type, value data type>

	public AccountManagerHashMap() {

		this(10);

	}

	public AccountManagerHashMap(int size) {
		// size을
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
		// return; //matching이 됐다면, 빠져나감.
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
		
		//key 기준으로 빼와서, iterator사용가능. 
		Iterator<String> ir = accounts.keySet().iterator();

		// hasNext() ? 현재 위치에 object가 있는가?
		while (ir.hasNext()) {
			
			String key = ir.next();
			System.out.println(accounts.get(key));

		}

	}

}
