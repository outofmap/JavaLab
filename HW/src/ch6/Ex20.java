package ch6;

public class Ex20 {
	public static int[] shuffle(int[] arr){
		
		if(arr == null || arr.length ==0)
			return arr;
		int i;
		
		for(i=0;i<arr.length;i++){
		int index1 = (int) (Math.random()*9+1);
		int index2 = (int) (Math.random()*9+1);
		int temp=0;
		
		arr[temp]=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=arr[temp]; 					// �迭�� �ε����� ��ȯ�ؼ� ���� ���!!
		
		}
		
		return arr;
	}
//Math.random() �� ��� ����ؾ����� �𸣰ھ ��������� ������ �������.
//�Ʒ��� �ڵ带 �����ؼ� �Ẹ���� �ߴµ� �� 8�� ���ϰ� 1�� ���ϴ� ��Ģ�� ���� ������ ���ذ� �ȵǼ�,
//Ȱ������ ���߽��ϴ�.
//	private static int[] shuffle(int[] result) {
//		// TODO Auto-generated method stub
//		
//		int temp, seed;
//		
//		for(int i=0;i<result.length;i++){
//			seed=(int)(Math.random()*8)+1;
//			temp = result[i];
//			result[i]=result[seed];
//			result[seed]=temp;
//		}
//		return result;
//	}

	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
		

}
