package gradingsystem;

import java.util.HashMap;

public class Student {
	// 이름,학번,전공,
	String name;
	int studentID;
	String major;
	// scoreList에 <과목, 점수>
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
