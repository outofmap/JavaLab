package firtst;
//class는 항상 대문자
public class Student {
	
	public int studentNumber; 					//멤버변수, property,attribute
	public String studentName; 
	private int studentAge;
	
	// method
	public void setStudentNumber(int snum){
		studentNumber = snum;
	}
	
	public String getName(){
		
		return studentName;
	}
	
	public int getStudentNumber(){
		return studentNumber;
	}
	
	public void setStudentName(String name){
		studentName = name;
		
	}
	public void setStudentAge(int age){
		studentAge = age;
		
		//이름이 같으면 property를 나타내는 변수에 this.변수이름 으로 써준다.
	}
	// 변수가 private이면 get하거나 set할 수 있는 함수가 있어야
	
	public int getAge(){
		return studentAge;
	}
	
}
