package company;

import java.util.ArrayList;

public class Information {

	public void showEmployee() {
		Company c = Company.getInstance();
		ArrayList<Employee> eList = c.geteList();
		int i;
		
		for(i=0;i < eList.size();i++){
			
			System.out.println(eList.get(i).getInfo());
			// 같은 메소드이지만 다른 결과값을 가져오고 싶을 때 -> 부모 클래스에 overriding하면 !!!
		}
		
	}
	
	

}
