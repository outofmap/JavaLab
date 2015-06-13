package Object;

import java.util.HashSet;

public class MyDate {

	public int day;
	public int month;
	public int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return year + "년" + month + "월" + day + "일";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate myDate = (MyDate) obj;
			if ((myDate.day == this.day) && (myDate.month == this.month)
					&& (myDate.year == this.year))
				return true;
			else
				return false;

		} else
			return false;
	}
	//hashcode는 원래 객체가 생성될때 가지는 참조값이지만, hashCode method도  재정의 할 수 있다. 
	public int hashCode(){

		return day + month + year;
	}

	public static void main(String[] args) {

		MyDate date1 = new MyDate(4, 6, 2015);
		MyDate date2 = new MyDate(4, 6, 2015);

		HashSet<MyDate> set = new HashSet<MyDate>();
		set.add(date1);
		set.add(date2);

		System.out.println(set);
	}

}
