package Object;

class Person implements Cloneable{
	int age;
	String name;
	
	public Person(String name){
		this.name = name;
		age = 1;
	}
	
	public String toString(){
		return "�̸�:"+name+  "����:"+age;
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
		
//		Person jeong = new Person("���¹�");
//		jeong.aging();
//		System.out.println(jeong);
//		
//		Person jeong2 = (Person)jeong.clone();
//		System.out.println(jeong2);
		
//		String str1  = new String("���¹�");
//		String str2  = new String("���¹�");
		
//		String str1 = "aaa";			//String �� ������·� ��򰡿� ������־ srt1�� srt2�� aaa�� ������ ��. �׷��� �ּҰ� ����!
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
		
		//string�� �����ؼ� �� �� String buffer �� ����, return�� StringŸ������ ���ִ� ��찡 ����. 
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("def");
		sb.append("ghi");
		
		String str = sb.toString();
		
		
		
		
		

	}

}
