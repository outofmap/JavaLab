package sort;

public class SortMain {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		
		Isort sort = new BubbleSort(); //�ϴ� �ʱ�ȭ 
		
		// ���� argument�� ���� ������ �ٸ��� ����
		
		if(args[0].equals("B"))
			sort = new BubbleSort();
		else if(args[0].equals("Q"))
			sort = new QuickSort();
		
		sort.sort();
			
	}

}
