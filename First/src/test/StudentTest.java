package test;

import StaticTest.Student;
import junit.framework.TestCase;

public class StudentTest extends TestCase{
	//test���Լ��� ����� ������ test�� ���� �Լ��� ���弼��.
	public void testStudent(){
		Student student = new Student("Tom","Seoul","English");
		assertEquals("Tom", student.getName());
		
		Student student2 = new Student();
		assertEquals(1002, student.getStudentCode());
		
	}

}
