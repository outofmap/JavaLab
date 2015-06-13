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
		
		
		System.out.println("�̸�" +"		"+ "�й�" +"		"+ "�а�"+"		"+"����"+"		"+"����"+"		" +"����"+"		"+"����");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.print(studentList.get(i).name +"		");
			System.out.print(studentList.get(i).studentID +"		");
			System.out.print(studentList.get(i).major +"		");
			System.out.print(studentList.get(i).scoreList.get("math") +"		");
			
			//scoreList�� Key�� �����̸��� String������ �������� �;��µ�, ��� �ؾ����� ���� �����Է��� �ؽ�Ʈ�� ��ü��.
			
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
