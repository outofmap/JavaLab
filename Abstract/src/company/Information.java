package company;

import java.util.ArrayList;

public class Information {

	public void showEmployee() {
		Company c = Company.getInstance();
		ArrayList<Employee> eList = c.geteList();
		int i;
		
		for(i=0;i < eList.size();i++){
			
			System.out.println(eList.get(i).getInfo());
			// ���� �޼ҵ������� �ٸ� ������� �������� ���� �� -> �θ� Ŭ������ overriding�ϸ� !!!
		}
		
	}
	
	

}
