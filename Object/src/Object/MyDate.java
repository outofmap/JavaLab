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
		return year + "³â" + month + "¿ù" + day + "ÀÏ";
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
