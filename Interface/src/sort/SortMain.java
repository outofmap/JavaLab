package sort;

public class SortMain {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		
		Isort sort = new BubbleSort(); //일단 초기화 
		
		// 받은 argument에 따라서 생성자 다르게 생성
		
		if(args[0].equals("B"))
			sort = new BubbleSort();
		else if(args[0].equals("Q"))
			sort = new QuickSort();
		
		sort.sort();
			
	}

}
