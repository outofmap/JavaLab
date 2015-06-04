package exception;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	public void testStudentName() {

		String name = null;
		try {
			Student student1 = new Student(name);
			fail("error");
		} catch (StudentNameFormatErrorException e) {
			assertEquals("name must not be null", e.getMessage());

		}
		
		try{
		Student student2 = new Student("a b c d e ");
		fail("error");
		}catch(StudentNameFormatErrorException e){
			assertEquals("name is too long", e.getMessage());
		}

	}

}
