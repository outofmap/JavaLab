package StaticTest;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.getInformation();								//이름없음,주소없음,학과없음
		
		Student student2 = new Student("James","NewYork","Computer Science");
		student2.getInformation();
		
		System.out.println(student1.getStudentNumber()); 		//1001
		System.out.println(student1.getStudentNumber()); 		//1002
		
	}

}
