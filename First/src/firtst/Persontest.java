package firtst;

public class Persontest {

	public static void main(String[] args) {
		Person songhee = new Person();
		Person personLee = new Person("�̽±�",180,85);
		Person personKim = new Person("�����");
		
		

		System.out.println(songhee);
		songhee.printThis();
		System.out.println(personLee);
		personLee.printThis();
		
		songhee.setName("�ڼ���");
		songhee.setHeight(165);
		songhee.setWeight(50);
		
		System.out.println(songhee.name + ","+songhee.getHeight()+","+songhee.getWeight());
		System.out.println(10); //�Լ��� �̸��� ���Ƶ� �Ű������� �ٸ��� ��밡��.
		
		
		System.out.println(personLee.name + ","+personLee.getHeight()+","+personLee.getWeight());
	}
}
