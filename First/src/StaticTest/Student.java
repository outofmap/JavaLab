package StaticTest;

public class Student {
	
	private String name;
	private String address; 
	private String major; 	
	private static int studentNumber = 1000; //�ѹ������ϰ�, �ٲ��� ������� private �̰�, set�� �������� �ʾƵ��ȴ�.
	private int studentCode;
	
	public Student(){
		this("�̸�����","�ּҾ���","�а�����");
	}
	
	public Student(String name,String address,String major){
		this.name = name;
		this.address = address;
		this.major = major;
		
		initStudentNumber();
	}
	
	public void initStudentNumber(){
		studentNumber++;
		this.studentCode = studentNumber;
	}
	
	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public void getInformation(){
		System.out.println(name+","+address+","+major);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public static int getStudentNumber() {
		return studentNumber;
	}
	public static void setStudentNumber(int studentNumber) {
		Student.studentNumber = studentNumber;
	}

}
