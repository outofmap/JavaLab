package test;

import StaticTest.Student;
import junit.framework.TestCase;

public class StudentTest extends TestCase{
	//test용함수를 만들고 싶으면 test를 쓰고 함수를 만드세요.
	public void testStudent(){
		Student student = new Student("Tom","Seoul","English");
		assertEquals("Tom", student.getName());
		
		Student student2 = new Student();
		assertEquals(1002, student.getStudentCode());
		
	}

}
