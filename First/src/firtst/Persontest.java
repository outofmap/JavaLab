package firtst;

public class Persontest {

	public static void main(String[] args) {
		Person songhee = new Person();
		Person personLee = new Person("이승기",180,85);
		Person personKim = new Person("김수현");
		
		

		System.out.println(songhee);
		songhee.printThis();
		System.out.println(personLee);
		personLee.printThis();
		
		songhee.setName("박송희");
		songhee.setHeight(165);
		songhee.setWeight(50);
		
		System.out.println(songhee.name + ","+songhee.getHeight()+","+songhee.getWeight());
		System.out.println(10); //함수의 이름이 같아도 매개변수가 다르면 사용가능.
		
		
		System.out.println(personLee.name + ","+personLee.getHeight()+","+personLee.getWeight());
	}
}
