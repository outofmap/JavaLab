package gradingsystem;

import java.util.Iterator;

public class BasicGrading implements IGrading {

	@Override
	public String grading(Student student) {
		int point = 0;

		Iterator<String> keys = student.scoreList.keySet().iterator();

		while (keys.hasNext()) {
			String key = keys.next();
			if (!key.equals(student.major))
				point = student.scoreList.get(key);
		}

		if (point >= 90 && point <= 100)
			return "A";
		else if (point >= 80 && point <= 89)
			return "B";
		else if (point >= 70 && point <= 79)
			return "C";
		else if (point >= 55 && point <= 69)
			return "D";
		else
			return "F";

	}

	
}
