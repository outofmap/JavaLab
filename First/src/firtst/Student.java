package firtst;
//class�� �׻� �빮��
public class Student {
	
	public int studentNumber; 					//�������, property,attribute
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
		
		//�̸��� ������ property�� ��Ÿ���� ������ this.�����̸� ���� ���ش�.
	}
	// ������ private�̸� get�ϰų� set�� �� �ִ� �Լ��� �־��
	
	public int getAge(){
		return studentAge;
	}
	
}
