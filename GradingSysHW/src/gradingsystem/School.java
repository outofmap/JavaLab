package gradingsystem;

import java.util.ArrayList;

public class School {
	
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	
	private static final School next = new School();
	private School(){
		
	}
	
	public static School getSchool(){
		return next;
	}
	
	public static ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	

}
