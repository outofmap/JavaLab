package gradingsystem;

import java.util.ArrayList;

public class Report {

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	public void getReport() {
		ArrayList<Student> studentList = School.getStudentList();
		
		
		// StringBuffer.append();
		
		//BasicGrading bg = new BasicGrading();
		
		IGrading grade = new BasicGrading();
		String courseName1 = "math";
		String courseName2 = "english";
		
		
		System.out.println("이름" +"		"+ "학번" +"		"+ "학과"+"		"+"수학"+"		"+"학점"+"		" +"영어"+"		"+"학점");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.print(studentList.get(i).name +"		");
			System.out.print(studentList.get(i).studentID +"		");
			System.out.print(studentList.get(i).major +"		");
			System.out.print(studentList.get(i).scoreList.get("math") +"		");
			
			//scoreList의 Key인 과목이름을 String값으로 가져오고 싶었는데, 어떻게 해야할지 몰라서 직접입력한 텍스트로 대체함.
			
			if(studentList.get(i).major.equalsIgnoreCase(courseName1))
				grade = new MajorGrading();
			else
				grade = new BasicGrading();
			
			String mathGrade = grade.grading(studentList.get(i));
			
			System.out.print(mathGrade +"		");
			
			System.out.print(studentList.get(i).scoreList.get("english") +"		");
			if(studentList.get(i).major.equalsIgnoreCase(courseName2))
				grade = new MajorGrading();
			else
				grade = new BasicGrading();
			
			String englishGrade = grade.grading(studentList.get(i));
			
			System.out.print(englishGrade +"		");
			
			System.out.println();
		
		}
	}
}
