package firtst;

public class StudentTest {
	public static void main(String[] args){
		
		Student studentjung = new Student();  //class�� ������ �ٸ� instance�� 
		// studentjung �� reference
		
		Student studentPark = new Student();
		
		studentjung.studentName = "���¹�";
		String name = studentjung.getName();
		
		System.out.println(name);
		
		studentjung.setStudentAge(28); 
		
		System.out.println(studentjung.getAge());
		
		studentPark.studentName = "�ڼ���";
		studentPark.setStudentAge(26);
		
		System.out.println(studentPark.getAge());
		System.out.println(studentPark.getName());
		
		System.out.println(studentPark);
		System.out.println(studentjung);
	}
}
