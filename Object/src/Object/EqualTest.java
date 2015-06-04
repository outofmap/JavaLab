package Object;

import java.util.HashSet;

class Student {

	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentName;
	}
	
	//equalsÀÇ ¿À¹ö¶óÀÌµù 
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student student = (Student)obj;
			if(this.studentId == student.studentId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}
}

public class EqualTest {

	public static void main(String[] args) {

		Student songPark1 = new Student(12345, "¹Ú¼ÛÈñ");
		Student songPark2 = new Student(12345, "¹Ú¼ÛÈñ");
//		System.out.println(songPark1==songPark2);
//		System.out.println(songPark1.equals(songPark2));
//		
//		String s1 = new String("ÃáÇâÀÌ");
//		String s2 = new String("ÃáÇâÀÌ");
//		
//		System.out.println(s1 == s2);		//false
//		System.out.println(s1.equals(s2));	//ture
//		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
//		
		System.out.println(i1==i2);			//false °´Ã¼ÀÇ address°¡ °°Àº°¡? f
		System.out.println(i1.equals(i2));	
		System.out.println(i1.hashCode());
		
		HashSet<Student> set = new HashSet<Student>();
		set.add(songPark1);
		set.add(songPark2);
		
		System.out.println(set);  								//setÀÇ toStringÀÌ ºÒÁø´Ù.
		
		HashSet<Integer> set2 = new HashSet<Integer>();
//		set2.add(new String("ÃáÇâ"));
//		set2.add(new String("ÃáÇâ"));

		set2.add(i1);
		set2.add(i2);
		
		System.out.println(set2);
	}
}
