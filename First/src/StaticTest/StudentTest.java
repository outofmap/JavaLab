package StaticTest;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.getInformation();								//�̸�����,�ּҾ���,�а�����
		
		Student student2 = new Student("James","NewYork","Computer Science");
		student2.getInformation();
		
		System.out.println(student1.getStudentNumber()); 		//1001
		System.out.println(student1.getStudentNumber()); 		//1002
		
	}

}
