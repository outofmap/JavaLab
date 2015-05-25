package ch6;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal(){
		return kor+eng+math;
	}
	public float getAverage(){
		return getTotal()/3;
	}
	public String info(){
		return name+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}


