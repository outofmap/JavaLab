package ch6;

public class Ex22 {
	
	private static boolean isNumber(String str) {
		
//			Object o = str.charAt(i);
//			String type = o.getClass().getName();
//			
//			System.out.println(type);
//			변수의 type을 알고 싶었는데 java.lang.character라고 출력되어서 이 방법을 포기ㅠ
			
			if(str == null || str ==""){
				return false;
			}
			for(int i=0;i<str.length();i++){
				char a = str.charAt(i);
				if(a < '1'  || a > '9')
					return false;
			}
			return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}
	
}
