package gradingsystem;

import java.util.HashMap;

public class Student {
	// �̸�,�й�,����,
	String name;
	int studentID;
	String major;
	// scoreList�� <����, ����>
	HashMap<String, Integer> scoreList = new HashMap<String, Integer>();


	public Student(String name, int studentID, String major,int math,int english) {
		this.name = name;
		this.studentID = studentID;
		this.major = major;
		setScore("math",math);
		setScore("english",english);

	}

	public void setScore(String courseName, Integer score) {
		scoreList.put(courseName, score);
	}
	
//	public String getCourseName(HashpMap<String,Integer> scoreList){
//		
//		return 
//	}
	
}
