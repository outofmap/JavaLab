package firtst;

public class Person {
	public String name;
	private int weight;
	private int height;
	
	public Person(){} //�Ű������� �Ʒ��� �޶� ��밡�� overload
	
	public Person(String name){
		this("�̽±�",180,85); // �����ڿ��� �Ǵٸ� �����ڸ� ȣ���� �� this�� ����Ѵ�.
	}
	
	public Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setWeight(int weight){
		if(weight >200){
			System.out.println("�ʹ� �׶��ؿ�");
			return;}
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void printThis(){
		System.out.println(this);
	}
	
}
