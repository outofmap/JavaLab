package arraylist;

public class AccountArrayListTest {
	
	public static void main(String[] args){
	
	AccountManagerAarrayList manager = new AccountManagerAarrayList();
	
	manager.insertAccount(15000,"1234_1","James");
	manager.insertAccount(25000,"1234_2","Tomas");
	manager.insertAccount(35000,"1234_3","Edward");
	
	manager.displayAll();
	
	manager.setDeposite("1234_1",5000);
	manager.setDeposite("1234_2",5000);
	manager.setDeposite("1234_3",5000);

	manager.displayAll();

 	}

}
