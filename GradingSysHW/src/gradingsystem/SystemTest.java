package gradingsystem;

import java.util.ArrayList;

public class SystemTest {

	public static void main(String[] args) {
		ArrayList<Student> studentList = School.getStudentList();

		studentList.add(new Student("�̽±�", 141213, "math", 95, 20));
		studentList.add(new Student("�����", 141518, "enlgish", 90, 100));
		studentList.add(new Student("�ֿ�", 141230, "math", 76, 60));
		studentList.add(new Student("����", 141255, "math", 85, 89));
		studentList.add(new Student("�̽±�", 141590, "english", 90, 95));
		
		Report r = new Report();
		
		r.getReport();

	}

}
