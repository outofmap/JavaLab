package exception;

import junit.framework.TestCase;
import logger.MyLogger;

public class StudentTest extends TestCase {

	MyLogger mylogger = new MyLogger();
	
	public void testStudentName() {
		
		mylogger.fine("begin testStudentName()");
		String name = null;
		try {
			Student student1 = new Student(name);
			fail("error");
		} catch (StudentNameFormatErrorException e) {
			mylogger.warning("name must not be null");
			assertEquals("name must not be null", e.getMessage());

		}
		
		try{
		Student student2 = new Student("a b c d e ");
		fail("error");
		}catch(StudentNameFormatErrorException e){
			mylogger.warning(e.getMessage());
			assertEquals("name is too long", e.getMessage());
		}
		
		mylogger.fine("end testStudentName()");

	}

}
