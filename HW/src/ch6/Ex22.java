package ch6;

public class Ex22 {
	
	private static boolean isNumber(String str) {
		
//			Object o = str.charAt(i);
//			String type = o.getClass().getName();
//			
//			System.out.println(type);
//			������ type�� �˰� �;��µ� java.lang.character��� ��µǾ �� ����� �����
			
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
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
	}
	
}