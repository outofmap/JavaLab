package Object;

class Person implements Cloneable{
	int age;
	String name;
	
	public Person(String name){
		this.name = name;
		age = 1;
	}
	
	public String toString(){
		return "이름:"+name+  "나이:"+age;
	}
	public void aging(){
		age++;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
//		Person jeong = new Person("정승미");
//		jeong.aging();
//		System.out.println(jeong);
//		
//		Person jeong2 = (Person)jeong.clone();
//		System.out.println(jeong2);
		
//		String str1  = new String("정승미");
//		String str2  = new String("정승미");
		
//		String str1 = "aaa";			//String 이 상수형태로 어딘가에 저장되있어서 srt1도 srt2도 aaa를 가져다 씀. 그래서 주소가 같음!
//		String str2 = "aaa";
		
//		Integer i1 = 100;
//		Integer i2 = 100;
//		
//		System.out.println(i1 == i2);
		
		String str1 = new String("abc");
		String str2 = new String("edf");
		
		String str3 = str1 + str2;
		
		System.out.println(str3);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//string을 연결해서 쓸 때 String buffer 를 쓰고, return은 String타입으로 해주는 경우가 많다. 
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("def");
		sb.append("ghi");
		
		String str = sb.toString();
		
		
		
		
		

	}

}
