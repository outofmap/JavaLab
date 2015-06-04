package exception;

public class Student {
	String name;
	
	public Student(String name) throws StudentNameFormatErrorException{
		if(name == null){
			throw new StudentNameFormatErrorException("name must not be null");
		}
		if(name.split(" ").length > 3){
			throw new StudentNameFormatErrorException("name is too long");
		}
		this.name = name;
	}
}
