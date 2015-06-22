package treeset;

import java.util.TreeSet;

public class AccountTreeSetTest {
	
	public static void main(String[] args){
	
	AccountManagerTreeSet manager = new AccountManagerTreeSet();
	
	manager.insertAccount(15000,"1233","James");
	manager.insertAccount(25000,"1232","Edward");
	manager.insertAccount(35000,"1231","Thomas");
	manager.insertAccount(35000,"1235","Phoby");
	manager.insertAccount(35000,"1236","Percy");
	
	manager.displayAll();
	
//	manager.setDeposite("1234_1",5000);
//	manager.setDeposite("1234_2",5000);
//	manager.setDeposite("1234_3",5000);
//
//	manager.displayAll();
	
	//TreeSet에서는 sorting이 된 결과가 특징인데, 비교 기준을 정해주어야한다!
		
//	TreeSet<Integer> treeSet = new TreeSet<Integer>();
//	
//	treeSet.add(new Integer(10));
//	treeSet.add(new Integer(2));
//	treeSet.add(new Integer(5));
//	treeSet.add(new Integer(20));
//	treeSet.add(new Integer(12));
//	treeSet.add(new Integer(9));
//	
//
//	System.out.println(treeSet);
 	}

}
