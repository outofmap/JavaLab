package ch6;

class Ex23 {
	public static int max(int[] arr){
		if(arr == null || arr.length == 0)
			return -999999;
		int m=arr[0];
		for(int i=1; i<arr.length;i++){
			
			if(m < arr[i])
				m=arr[i];
		}
		return m;
	}
	

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪"+max(data));
		System.out.println("�ִ밪"+max(null));
		System.out.println("�ִ밪"+max(new int[] {})); //ũ�Ⱑ 0�� �迭
	}

}
