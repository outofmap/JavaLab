package hashset;

public class AccountHashSetTest {
	
	public static void main(String[] args){
	
	AccountManagerHashSet manager = new AccountManagerHashSet();
	//���¹�ȣ�� ������, insertAccount�� ���� �ʰ� �ϰ� ����!
	manager.insertAccount(15000,"1234","James");
	manager.insertAccount(25000,"1235","Tomas");
	manager.insertAccount(35000,"1236","Edward");
	manager.insertAccount(45000,"1235","Edward2");
	
	manager.displayAll();
	
	manager.setDeposite("1234",5000);
	manager.setDeposite("1235",5000);
	manager.setDeposite("1236",5000);

	manager.displayAll();

 	}

}
