package firtst;

public class Person {
	public String name;
	private int weight;
	private int height;
	
	public Person(){} //매개변수가 아래랑 달라서 사용가능 overload
	
	public Person(String name){
		this("이승기",180,85); // 생성자에서 또다른 생성자를 호출할 때 this를 사용한다.
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
			System.out.println("너무 뚱뚱해요");
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
