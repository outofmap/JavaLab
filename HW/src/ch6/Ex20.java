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
		arr[index2]=arr[temp]; 					// 배열의 인덱스를 교환해서 섞는 방식!!
		
		}
		
		return arr;
	}
//Math.random() 을 어떻게 사용해야할지 모르겠어서 제마음대로 순서를 섞었어요.
//아래의 코드를 참조해서 써보려고 했는데 왜 8을 곱하고 1을 더하는 규칙을 만든 것인지 이해가 안되서,
//활용하지 못했습니다.
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
