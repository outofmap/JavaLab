package Object;

import java.util.ArrayList;

class Dog{
	String type;
	String name;
	
	public Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public String toString(){
		return type +":"+name;
	}
	
}

public class DogTest {
	public static void main(String[] args){
		Dog minky =new Dog("Minky","∂À∞≥");
		Dog mingku = minky;
		System.out.println(minky == mingku);
		System.out.println(mingku.equals(minky));
		
		System.out.println(mingku.hashCode());
		System.out.println(minky.hashCode());
//		System.out.println(minky.hashCode());
//		System.out.println(m);
//		//String herName = new String("√·«‚");
		
//		
//		//System.out.println(herName.toString());
//		
//		Integer i1 = new Integer(100);
//		System.out.println(i1);
//		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("∫£≈‰∫•");
//		list.add("∏¬•∏£∆Æ");
//		list.add("πŸ»Â");
//		
//		System.out.println(list);
//		
		
		
	}
	
}

