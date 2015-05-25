package firtst;

public class StudentTest {
	public static void main(String[] args){
		
		Student studentjung = new Student();  //class는 같지만 다른 instance는 
		// studentjung 은 reference
		
		Student studentPark = new Student();
		
		studentjung.studentName = "정승미";
		String name = studentjung.getName();
		
		System.out.println(name);
		
		studentjung.setStudentAge(28); 
		
		System.out.println(studentjung.getAge());
		
		studentPark.studentName = "박송희";
		studentPark.setStudentAge(26);
		
		System.out.println(studentPark.getAge());
		System.out.println(studentPark.getName());
		
		System.out.println(studentPark);
		System.out.println(studentjung);
	}
}
